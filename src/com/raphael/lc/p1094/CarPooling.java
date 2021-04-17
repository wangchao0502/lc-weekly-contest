package com.raphael.lc.p1094;

/**
 * @author Raphael
 * @date 2021-04-17 10:15:19
 */
class CarPooling {
    /**
     * Description for CarPooling:
     * 拼车
     */
    public boolean carPooling(int[][] trips, int capacity) {
        // code
        int[] plus = new int[1001];
        int[] minus = new int[1001];

        for (int[] trip : trips) {
            plus[trip[1]] += trip[0];
            minus[trip[2]] += trip[0];
        }

        int curr = 0;
        for (int i = 0; i < 1001; i++) {
            curr -= minus[i];
            curr += plus[i];
            if (curr > capacity) {
                return false;
            }
        }

        return true;
    }
}
