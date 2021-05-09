package com.raphael.lc.p1482;

/**
 * @author Raphael
 * @date 2021-05-09 13:10:08
 */
class MinDays {
    /**
     * Description for MinDays:
     * 制作m束花所需的最少天数
     */
    public int minDays(int[] bloomDay, int m, int k) {
        // code
        int n = bloomDay.length;
        if (m * k > n) {
            return -1;
        }

        int low = 1, high = 1;
        for (int i : bloomDay) {
            high = Math.max(high, i);
        }

        while (low < high) {
            int mid = low + ((high - low) >> 1);
            if (canMake(bloomDay, mid, m, k)) {
                high = mid;
            } else {
                low = mid + 1;
            }
        }

        return high;
    }

    private boolean canMake(int[] bloomDay, int days, int m, int k) {
        int bouquets = 0;
        int flowers = 0;
        int n = bloomDay.length;

        for (int i = 0; i < n && bouquets < m; i++) {
            if (bloomDay[i] <= days) {
                flowers++;
                if (flowers == k) {
                    bouquets++;
                    flowers = 0;
                }
            } else {
                flowers = 0;
            }
        }
        return bouquets >= m;
    }
}
