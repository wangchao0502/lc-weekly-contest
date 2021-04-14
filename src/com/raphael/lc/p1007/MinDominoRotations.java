package com.raphael.lc.p1007;

/**
 * @author Raphael
 * @date 2021-04-14 12:51:54
 */
@SuppressWarnings("AlibabaAvoidComplexCondition")
class MinDominoRotations {
    /**
     * Description for MinDominoRotations:
     * 行相等的最少多米诺旋转
     */
    public int minDominoRotations(int[] a, int[] b) {
        // code
        int n = a.length;
        int x = a[0], y = b[0];

        for (int i = 1; i < n; i++) {
            if (a[i] != x && a[i] != y && b[i] != x && b[i] != y) {
                return -1;
            }
        }

        int c1 = 0;
        int c2 = 0;

        for (int i = 0; i < n; i++) {
            if (a[i] != x) {
                if (b[i] == x && c1 != Integer.MAX_VALUE) c1++;
                else c1 = Integer.MAX_VALUE;
            }
            if (b[i] != y) {
                if (a[i] == y && c2 != Integer.MAX_VALUE) c2++;
                else c2 = Integer.MAX_VALUE;
            }
        }

        int ans = Math.min(c1, c2);
        c1 = 0;
        c2 = 0;

        for (int i = 0; i < n; i++) {
            if (a[i] != y) {
                if (b[i] == y && c1 != Integer.MAX_VALUE) c1++;
                else c1 = Integer.MAX_VALUE;
            }
            if (b[i] != x) {
                if (a[i] == x && c2 != Integer.MAX_VALUE) c2++;
                else c2 = Integer.MAX_VALUE;
            }
        }

        ans = Math.min(ans, Math.min(c1, c2));

        return ans == Integer.MAX_VALUE ? -1 : ans;
    }
}
