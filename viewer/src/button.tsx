import React from "jsx-dom";
import { MouseEventHandler } from "jsx-dom/types";

export default (
  pathD: string,
  descriptioon: string,
  onClick: MouseEventHandler<HTMLButtonElement>,
): HTMLElement => {
  const tooltipContent = (
    <div
      className="v-tooltip__content"
      style="z-index: 100; white-space: nowrap"
    >
      {descriptioon}
    </div>
  ) as HTMLElement;

  const button = (
    <span className="with-tooltip">
      {tooltipContent}
      <button
        type="button"
        className="v-btn v-btn--contained v-btn--fab v-btn--round theme--light v-size--x-small"
        onClick={onClick}
      >
        <span className="v-btn__content">
          <span
            aria-hidden="true"
            className="v-icon notranslate v-icon--svg theme--light"
          >
            <svg
              xmlns="http://www.w3.org/2000/svg"
              viewBox="0 0 24 24"
              height="24"
              width="24"
              role="img"
              aria-hidden="true"
            >
              <path d={pathD}></path>
            </svg>
          </span>
        </span>
      </button>
    </span>
  ) as HTMLElement;

  // left offset depends on row width, so recalculate every time
  button.onmouseover = () => {
    console.log(
      "button.offsetTop",
      button.offsetTop,
      "button.offsetHeight",
      button.offsetHeight,
    );
    // hard coding the row height 40
    const top = (40 - tooltipContent.offsetHeight) / 2;
    tooltipContent.style.top = `${top}px`;
    // 2px is half of the button margin
    const left = button.offsetLeft - tooltipContent.offsetWidth + 2;
    tooltipContent.style.left = `${left}px`;
  };
  return button;
};
