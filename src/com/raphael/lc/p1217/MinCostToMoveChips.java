package com.raphael.lc.p1217;

/**
 * @author Raphael
 * @date 2021-04-12 12:37:35
 */
class MinCostToMoveChips {
    /**
     * Description for MinCostToMoveChips:
     * 玩筹码
     */
    public int minCostToMoveChips(int[] position) {
        // code
        int even = 0;
        int odd = 0;
        for (int n : position) {
            if ((n & 1) == 1) {
                odd++;
            } else {
                even++;
            }
        }
        return Math.min(even, odd);
    }
}
