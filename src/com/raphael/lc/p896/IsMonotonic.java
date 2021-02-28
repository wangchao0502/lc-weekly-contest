package com.raphael.lc.p896;

/**
 * @author Raphael
 * @date 2021-02-28 09:59:15
 */
class IsMonotonic {
    /**
     * Description for IsMonotonic:
     * 单调队列
     */
    public boolean isMonotonic(int[] a) {
        // code
        int n = a.length;
        if (n == 1) {
            return true;
        }

        // 0:equeal, 1:incr, 2:decr
        int state = 0;
        for (int i = 1; i < n; i++) {
            if (a[i] == a[i - 1]) {
                continue;
            }
            if (a[i] > a[i - 1] && state != 2) {
                state = 1;
            } else if (a[i] < a[i - 1] && state != 1) {
                state = 2;
            } else {
                return false;
            }
        }
        return true;
    }
}
