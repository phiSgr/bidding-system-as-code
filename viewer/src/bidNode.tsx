import React from "jsx-dom";
import { background, bidToString, setDisplay, withDashPrefix } from "./util";
import {
  mdiInformationOutline,
  mdiArrowCollapseUp,
  mdiMenuDown,
} from "@mdi/js";
import system from "./convertSystem";
import { controllers, showAllContext } from "./controllers.ts";
import { parse } from "marked";
import button from "./button";

// inspired by mdiNotificationClearAll
const showAncestors = "M6,13H21V11H6M9,17H21V15H9M3,7V9H21V7";

const TREEVIEW_OPEN = "v-treeview-node__toggle--open";

export const bidNode = (bidId: number) => {
  const bidObj = system.bids[bidId];
  const {
    ancestors,
    meaning,
    by,
    nextBids,
    explanation,
    isRoot,
    previousBids,
  } = bidObj;
  const hasChild = nextBids.length > 0;

  const indentation = () =>
    ancestors.map(() => <div class="v-treeview-node__level" />);

  let explanationDiv: HTMLElement | undefined;
  if (explanation) {
    explanationDiv = (
      <div style="display: none;">
        {indentation()}
        <div className="v-card__text explanation">
          <div innerHTML={parse(explanation) as string} />
        </div>
      </div>
    ) as HTMLElement;
  }

  const toggleExplanation = (show?: boolean) => {
    if (explanationDiv === undefined) return;
    let newState = show ?? explanationDiv.style.display === "none";
    setDisplay(explanationDiv, newState, "flex");
  };

  const toggleCollapse = () => {
    if (hasChild) {
      controllers[bidId].setCollapsed();
    } else if (explanation !== "") {
      toggleExplanation();
    }
  };

  let toggleSpan: HTMLElement | undefined;
  if (hasChild) {
    toggleSpan = (
      <span
        aria-hidden="true"
        class="v-icon notranslate v-treeview-node__toggle v-icon--svg theme--light"
      >
        <svg
          xmlns="http://www.w3.org/2000/svg"
          viewBox="0 0 24 24"
          height="24"
          width="24"
          role="img"
          aria-hidden="true"
          onClick={(e) => {
            e.stopPropagation();
            toggleCollapse();
          }}
        >
          <path d={mdiMenuDown}></path>
        </svg>
      </span>
    ) as HTMLElement;
  }

  const hasElderSibling = isRoot
    ? false
    : (() => {
        const parentId = ancestors[ancestors.length - 1];
        const parent = system.bids[parentId];
        return parent.nextBids[0] !== bidId;
      })();
  const hideSiblingButton =
    hasElderSibling &&
    (() =>
      button(mdiArrowCollapseUp, "Hide Lower Bids", function (e) {
        e.stopPropagation();
        this.blur();
        controllers[ancestors[ancestors.length - 1]].hide(bidId);
        controllers[bidId].displayHideButton(false);
        controllers[bidId].scrollIntoView();
      }))();

  const hiddenBidsSpan = (
    <span
      className="overline text--secondary grey lighten-3"
      style="text-transform: none"
    ></span>
  );

  const clearHiddenBids = () => {
    hiddenBidsSpan.parentElement!.style.display = "none";
    hiddenBidsSpan.textContent = "";
  };

  const unhideChildren = () => {
    for (let child of nextBids) {
      let childController = controllers[child];
      childController.display(true);
      childController.displayHideButton(true);
    }

    clearHiddenBids();

    controllers[controllers[bidId].hideBefore].scrollIntoView();
    controllers[bidId].hideBefore = -1;
  };
  const bidSpan = (
    <span class="with-tooltip">{bidToString(bidObj)}</span>
  ) as HTMLElement;
  if (previousBids) {
    const tooltipContent = (
      <div
        className="v-tooltip__content"
        style="z-index: 100; background-color: rgb(97, 97, 97); border-color: rgb(97, 97, 97);"
      >
        <span>{previousBids}</span>
      </div>
    ) as HTMLElement;
    bidSpan.appendChild(tooltipContent);

    let positionUpdated = false;
    bidSpan.onmouseover = () => {
      if (positionUpdated) return;
      const top = bidSpan.offsetTop - tooltipContent.offsetHeight - 10;
      tooltipContent.style.top = `${top}px`;
      const left =
        bidSpan.offsetLeft +
        (bidSpan.offsetWidth - tooltipContent.offsetWidth) / 2;
      tooltipContent.style.left = `${left}px`;

      positionUpdated = true;
      bidSpan.onmouseover = null;
    };
  }

  const node = (
    <div>
      <div class="v-treeview-node" style="display: flex">
        {indentation()}
        <div
          class={`v-treeview-node__root ${background(by)}`}
          style="position: relative; flex-grow: 1"
          onClick={(e) => {
            e.stopPropagation();
            const selection = window.getSelection();
            if (selection == null || selection.isCollapsed) {
              toggleCollapse();
            }
          }}
        >
          {toggleSpan || <div className="v-treeview-node__level" />}
          <div class="v-treeview-node__content">
            <div class="v-treeview-node__label">
              {bidSpan}
              {withDashPrefix(meaning)}
            </div>
            <div class="v-treeview-node__append">
              {explanation !== "" &&
                button(mdiInformationOutline, "Explanation", function (e) {
                  e.stopPropagation();
                  this.blur();
                  toggleExplanation();
                })}
              {hideSiblingButton}
              {!isRoot &&
                button(showAncestors, "Show All Previous Bids", function (e) {
                  e.stopPropagation();
                  this.blur();

                  showAllContext(bidId);
                })}
            </div>
          </div>
          <div
            class="hidden-bids"
            style="display: none"
            onClick={function (e) {
              e.stopPropagation();
              unhideChildren();
            }}
          >
            {hiddenBidsSpan}
          </div>
        </div>
      </div>
      {explanationDiv}
    </div>
  ) as HTMLElement;
  setDisplay(node, isRoot);

  controllers[bidId] = {
    collapsed: true,
    setCollapsed(collapsed?: boolean, recurse: boolean = true) {
      if (toggleSpan === undefined) return;

      const oldState = this.collapsed;
      const newState = collapsed ?? !oldState;

      if (newState != oldState) {
        setDisplay(hiddenBidsSpan.parentElement!, !newState);
        toggleSpan.classList.toggle(TREEVIEW_OPEN, !newState);
        this.collapsed = newState;

        if (recurse) {
          for (const id of nextBids) {
            controllers[id].display(!newState && id >= this.hideBefore);
          }
        }
      }
    },
    hideBefore: -1,
    hide(before: number) {
      this.hideBefore = before;

      const hidden = [];
      for (let child of nextBids) {
        if (child >= before) break;

        hidden.push(bidToString(system.bids[child]));
        controllers[child].display(false);
      }

      const str = hidden.join(", ");
      const hiddenBids = str.length > 100 ? str.substring(0, 100) + "..." : str;
      hiddenBidsSpan.textContent = `Hidden: ${hiddenBids}`;
      hiddenBidsSpan.parentElement!.style.display = "";
    },
    clearHiddenBids,
    displayHideButton(display: boolean) {
      if (hideSiblingButton) {
        setDisplay(hideSiblingButton, display);
      }
    },
    display(display: boolean, recurse: boolean = true) {
      setDisplay(node, display);

      if (this.collapsed || !recurse) return;

      if (display) {
        nextBids.forEach((id) => {
          if (id > this.hideBefore) {
            controllers[id].display(true);
          }
        });
      } else {
        nextBids.forEach((id) => {
          controllers[id].display(false);
        });
      }
    },
    toggleExplanation,
    scrollIntoView() {
      node.scrollIntoView({
        block: "center",
        inline: "center",
        behavior: "smooth",
      });
    },
  };
  return node;
};
