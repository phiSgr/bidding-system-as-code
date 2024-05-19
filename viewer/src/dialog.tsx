import React from "jsx-dom";
import system from "./convertSystem.ts";
import { background, bidToString, withDashPrefix } from "./util.ts";

const overlay = (
  <div
    className="v-overlay v-overlay--active theme--dark"
    style="z-index: 1000;"
  >
    <div
      className="v-overlay__scrim"
      style="opacity: 0.46; background-color: rgb(33, 33, 33); border-color: rgb(33, 33, 33);"
    ></div>
    <div className="v-overlay__content"></div>
  </div>
);
const app = document.getElementById("app")!;

const removeDialog = async () => {
  dialog.onkeydown = null;
  app.removeChild(overlay);
  dialogContent.classList.remove("v-dialog__content--active");

  dialog.classList.remove("v-dialog--active");
  dialog.style.display = "none";

  document.documentElement.classList.remove("overflow-y-hidden");
  app.onclick = null;
};

const dialogContent = document.getElementById("fullSeqDialogContent")!;
const dialog = document.getElementById("fullSeqDialog")!;
const list = document.getElementById("fullSeqList")!;

dialogContent.onclick = (e) => e.stopPropagation();

export const showDialog = (bidId: number) => {
  const ids = [...system.bids[bidId].ancestors, bidId];

  list.innerHTML = "";
  list.append(
    ...ids.map((id) => {
      const bid = system.bids[id];
      return (
        <div
          tabIndex={-1}
          role="listitem"
          className={`v-list-item theme--light ${background(bid.by)}`}
        >
          {`${bidToString(bid)}${withDashPrefix(bid.meaning)}`}
        </div>
      );
    }),
  );

  app.appendChild(overlay);
  dialogContent.classList.add("v-dialog__content--active");
  dialog.classList.add("v-dialog--active");
  dialog.style.display = "";

  dialogContent.focus();
  dialogContent.onkeydown = (e) => {
    if (e.code === "Escape") {
      removeDialog().catch((e) => console.error(e));
    }
  };

  document.documentElement.classList.add("overflow-y-hidden");
  app.onclick = removeDialog;
};
