package com.raphael.lc.weekly233.p5711;

/**
 * @author Raphael
 * @date 2021-03-21 11:27:33
 */
class MaxValue {
    /**
     * Description for MaxValue:
     * 有界数组中制定下标处的最大值
     */

    private long calcMin(long len, long hi) {
        if (len >= hi) {
            return hi * (hi + 1) / 2 + (len - hi);
        }
        return (hi + hi - len + 1) * len / 2;
    }

    public int maxValue(int n, int index, int maxSum) {
        // code
        int right = n - index - 1;
        int lo = 1, hi = maxSum - (n - 1);
        while (lo <= hi) {
            int mid = (lo + hi) >> 1;
            long lmin = calcMin(index, mid - 1);
            long rmin = calcMin(right, mid - 1);
            if (lmin + rmin + mid > maxSum) {
                hi = mid - 1;
            } else {
                lo = mid + 1;
            }
        }

        return hi;
    }
}
