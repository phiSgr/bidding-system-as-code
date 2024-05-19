import system from "./convertSystem.ts";
import { showDialog } from "./dialog.tsx";

interface BidNodeController {
  collapsed: boolean;
  setCollapsed(collapsed?: boolean, recurse?: boolean): void;

  hide(before: number): void;
  hideBefore: number;
  clearHiddenBids(): void;
  displayHideButton(display: boolean): void;

  // recurse (default true) is false for bulk actions that act on all nodes
  display(display: boolean, recurse?: boolean): void;

  toggleExplanation(show?: boolean): void;

  scrollIntoView(): void;
}

export const controllers: BidNodeController[] = new Array(system.bids.length);

export const showAllContext = (bidId: number) => {
  showDialog(bidId);
};

const setAllShowingHandler = (elementId: string, show: boolean) => {
  const button = document.getElementById(elementId)!;
  button.onclick = () => {
    button.blur();

    for (let i = 0; i < system.bids.length; i++) {
      let controller = controllers[i];
      controller.setCollapsed(!show, false);
      controller.toggleExplanation(show);
      controller.display(show || system.bids[i].isRoot, false);

      controller.displayHideButton(true);
      controller.clearHiddenBids();
      controller.hideBefore = -1;
    }
  };
};

setAllShowingHandler("collapseAllBtn", false);
setAllShowingHandler("expandAllBtn", true);
