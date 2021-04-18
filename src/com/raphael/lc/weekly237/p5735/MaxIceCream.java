package com.raphael.lc.weekly237.p5735;

import java.util.Arrays;

/**
 * @author Raphael
 * @date 2021-04-18 10:36:08
 */
class MaxIceCream {
    /**
     * Description for MaxIceCream:
     * 雪糕的最大数量
     */
    public int maxIceCream(int[] costs, int coins) {
        // code
        Arrays.sort(costs);
        int ans = 0;
        int index = 0;

        while (coins > 0 && index < costs.length) {
            if (coins >= costs[index]) {
                coins -= costs[index++];
                ans++;
            } else {
                break;
            }
        }

        return ans;
    }
}
