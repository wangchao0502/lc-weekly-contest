package com.raphael.lc.weekly242.p5764;

/**
 * @author Raphael
 * @date 2021-05-23 10:41:17
 */
class MinSpeedOnTime {
    /**
     * Description for MinSpeedOnTime:
     * 准时到达的列车最小时速
     */
    public int minSpeedOnTime(int[] dist, double hour) {
        // code
        int n = dist.length;
        int lo = 1, hi = (int) 1e7;

        while (lo <= hi) {
            int mid = (lo + hi) >> 1;
            double total = 0;
            for (int i = 0; i < n - 1; i++) {
                total += Math.ceil((double) dist[i] / mid);
            }
            total += (double) dist[n - 1] / mid;
            if (total <= hour) {
                hi = mid - 1;
            } else {
                lo = mid + 1;
            }
        }
        if (lo > 1e7) {
            return -1;
        }
        return lo;
    }
}
