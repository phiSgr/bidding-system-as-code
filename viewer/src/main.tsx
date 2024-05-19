import "./style.css";
import "./vuetify2.css";

import React from "jsx-dom";

import { mdiArrowCollapseAll, mdiArrowExpandAll } from "@mdi/js";
import system from "./convertSystem.ts";
import { parse } from "marked";
import { bidNode } from "./bidNode.tsx";

document.title = system.name;
document.getElementById("nameSpan")!.innerText = system.name;

const replaceIcon = (id: string, pathD: string) => {
  const node = document.getElementById(id)!;
  const newNode = (
    <span aria-hidden="true" class="v-icon notranslate v-icon--svg theme--dark">
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
  );
  node.replaceWith(newNode);
};

replaceIcon("collapseAll", mdiArrowCollapseAll);
replaceIcon("expandAll", mdiArrowExpandAll);

document.getElementById("description")!.innerHTML = parse(
  system.description,
) as string;

const treeView = document.getElementsByClassName("v-treeview")[0];
for (let i = 0; i < system.bids.length; i++) {
  treeView.appendChild(bidNode(i));
}
