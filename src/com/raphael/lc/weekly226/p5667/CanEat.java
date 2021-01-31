package com.raphael.lc.weekly226.p5667;

/**
 * @author raphael
 * @date 2021-01-31 11:24:19
 */
class CanEat {
    /**
     * Description for CanEat:
     * 你能在你最喜欢的那天吃到你最喜欢的糖果吗
     */
    public boolean[] canEat(int[] candiesCount, int[][] queries) {
        // code
        int n = candiesCount.length;
        boolean[] ans = new boolean[queries.length];
        long[] s = new long[n + 1];

        for (int i = 1; i <= n; i++) {
            s[i] = s[i - 1] + candiesCount[i - 1];
        }

        for (int i = 0; i < queries.length; i++) {
            int[] q = queries[i];
            int type = q[0];
            long day = q[1];
            long count = q[2];
            ans[i] = s[type] < (day + 1) * count && s[type + 1] >= day + 1;
        }

        return ans;
    }
}
