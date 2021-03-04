package com.raphael.lc.p375;

/**
 * @author Raphael
 * @date 2021-03-04 14:48:30
 */
class GetMoneyAmount {
    /**
     * Description for GetMoneyAmount:
     * 猜数字大小2
     */
    public int getMoneyAmount(int n) {
        // code
        // 判断i-j区间所有可能的最小消耗
        int[][] dp = new int[n + 1][n + 1];

        for (int len = 2; len <= n; len++) {
            for (int start = 1; start <= n - len + 1; start++) {
                int minres = Integer.MAX_VALUE;
                for (int piv = start + (len - 1) / 2; piv < start + len - 1; piv++) {
                    int res = piv + Math.max(dp[start][piv - 1], dp[piv + 1][start + len - 1]);
                    minres = Math.min(res, minres);
                }
                dp[start][start + len - 1] = minres;
            }
        }
        return dp[1][n];
    }
}
