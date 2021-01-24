package com.raphael.lc.weekly225.p5664;

/**
 * @author raphael
 * @date 2021-01-24 11:54:56
 */
class MinimumBoxes {
    /**
     * Description for MinimumBoxes:
     * 墙角堆箱子
     */
    private boolean check(int mid, int i) {
        return ((long) mid + 1) * (long) mid / 2 >= i;
    }

    private int getMore(int i) {
        int l = 0;
        int r = (i + 1) / 2;
        while (l < r) {
            int mid = l + (r - l >> 1);
            if (check(mid, i)) {
                r = mid;
            } else {
                l = mid + 1;
            }
        }
        return l;
    }

    public int minimumBoxes(int n) {
        // code
        int sumA = 0;
        int sumB = 0;
        int bottomA = 0;
        int bottomB = 0;
        if (n == 1) {
            return 1;
        } else if (n <= 4) {
            return Math.min(3, n);
        } else if (n <= 10) {
            return Math.min(6, 3 + getMore(n - 4));
        }

        bottomA = 3;
        bottomB = 6;
        int nextAcc = 4;
        sumA = 4;
        sumB = 10;
        while (sumB < n) {
            bottomA = bottomB;
            bottomB += nextAcc;
            nextAcc++;
            sumA = sumB;
            sumB += bottomB;
        }
        return Math.min(bottomB, bottomA + getMore(n - sumA));
    }
}
