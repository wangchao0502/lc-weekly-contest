package com.raphael.lc.p275;

/**
 * @author Raphael
 * @date 2021-02-20 10:29:56
 */
class HIndex {
    /**
     * Description for HIndex:
     * H指数2
     */
    public int hIndex(int[] citations) {
        // 0 1 3 5 6
        int n = citations.length;
        if (n == 0) return 0;

        int left = 0, right = n;
        while (left < right) {
            int mid = left + ((right - left) >> 1);
            int cnt = n - mid;
            if (citations[mid] < cnt) {
                left = mid + 1;
            } else {
                right = mid;
            }
        }
        return n - left;
    }
}
