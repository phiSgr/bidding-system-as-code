import system from "../../dsl/build/system.json";
import { bidToString } from "./util";

export interface Bid {
  id: number;
  bid: string;
  by: string;
  meaning: string;
  explanation: string;
  ancestors: number[];
  previousBids: string;
  nextBids: number[];
  isRoot: boolean;
  treeEnd: number;
}

let bidId = 0;
const bids: Bid[] = [];
const bidToId =
  (ancestors: number[]) =>
  ({ bid, by, meaning, explanation = "", nextBids = [] }: any): number => {
    const newBidId = bidId++;
    const bidObj = {
      id: newBidId,
      bid,
      by,
      meaning,
      explanation,
      ancestors,
      previousBids: ancestors.map((id) => bidToString(bids[id])).join(" - "),
      nextBids: [],
      isRoot: ancestors.length === 0,
      treeEnd: 0,
    };
    bids.push(bidObj);
    bidObj.nextBids = (nextBids || []).map(bidToId([...ancestors, newBidId]));
    bidObj.treeEnd = bidId;
    return newBidId;
  };
const rootIds = system.nextBids.map(bidToId([]));

export default {
  name: system.name,
  author: system.author,
  description: system.description,
  bids: Object.freeze(bids),
  rootIds,
};
