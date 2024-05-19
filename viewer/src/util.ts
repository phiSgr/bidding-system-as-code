import { Bid } from "./convertSystem";

export const background = (by: string): string => {
  switch (by) {
    case "E":
      return "orange lighten-5";
    case "W":
      return "red lighten-5";
    case "N":
      return "blue lighten-5";
    case "S":
      return "grey lighten-5";
    default:
      console.error("Unknown bidder", by);
      return "";
  }
};

export const bidToString = ({ bid, by }: Bid): string => {
  switch (by) {
    case "E":
    case "W":
      return `(${bid})`;
    case "N":
    case "S":
      return bid;
    default:
      console.error(`Bid ${bid} by unknown bidder ${by}`);
      return bid;
  }
};

export const withDashPrefix = (meaning: string): string =>
  meaning ? " - " + meaning : "";

export const setDisplay = (
  node: HTMLElement,
  display: boolean,
  defaultValue: string = "",
) => {
  node.style.display = display ? defaultValue : "none";
};
