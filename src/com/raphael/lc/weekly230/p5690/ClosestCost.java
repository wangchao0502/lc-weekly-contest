package com.raphael.lc.weekly230.p5690;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Raphael
 * @date 2021-02-28 10:35:08
 */
class ClosestCost {
    /**
     * Description for ClosestCost:
     * 最接近目标价格的甜点成本
     */
    List<Integer> costs;
    int minDiff = Integer.MAX_VALUE;

    private void backtracking(int start, int diff, int[] toppingCosts, int target) {
        int absDiff = Math.abs(diff);
        if (absDiff == 0) {
            minDiff = 0;
            costs.add(target);
            return;
        }
        if (absDiff < minDiff) {
            minDiff = absDiff;
            costs.add(target - diff);
        }

        for (int i = start; i < toppingCosts.length; i++) {
            int cost = toppingCosts[i];
            for (int j = 0; j <= 2; j++) {
                backtracking(i + 1, diff - cost * j, toppingCosts, target);
            }
        }
    }

    public int closestCost(int[] baseCosts, int[] toppingCosts, int target) {
        // code
        costs = new ArrayList<>();
        for (int base : baseCosts) {
            backtracking(0, target - base, toppingCosts, target);
        }
        int ans = Integer.MAX_VALUE;

        for (int cost : costs) {
            if (Math.abs(target - cost) == minDiff) {
                ans = Math.min(ans, cost);
            }
        }
        return ans;
    }
}
