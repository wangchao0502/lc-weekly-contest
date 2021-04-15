package com.raphael.lc.p1029;

import java.util.Arrays;

/**
 * @author Raphael
 * @date 2021-04-15 11:17:19
 */
class TwoCitySchedCost {
    /**
     * Description for TwoCitySchedCost:
     * 两地调度
     */
    public int twoCitySchedCost(int[][] costs) {
        // code
        int n = costs.length / 2;
        int[] delta = new int[n * 2];
        int ans = 0;

        for (int i = 0; i < n * 2; i++) {
            ans += costs[i][0];
            delta[i] = costs[i][1] - costs[i][0];
        }

        Arrays.sort(delta);

        for (int i = 0; i < n; i++) {
            ans += delta[i];
        }

        return ans;
    }
}
