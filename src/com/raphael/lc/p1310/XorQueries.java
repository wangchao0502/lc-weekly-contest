package com.raphael.lc.p1310;

/**
 * @author Raphael
 * @date 2021-05-12 15:06:08
 */
class XorQueries {
    /**
     * Description for XorQueries:
     * 子数组异或查询
     */
    public int[] xorQueries(int[] arr, int[][] queries) {
        // code
        int m = arr.length;
        int n = queries.length;
        int[] prexor = new int[m];
        int[] ans = new int[n];

        prexor[0] = arr[0];

        for (int i = 1; i < m; i++) {
            prexor[i] = prexor[i - 1] ^ arr[i];
        }

        for (int i = 0; i < n; i++) {
            int[] query = queries[i];
            ans[i] = query[0] == 0 ? prexor[query[1]] : prexor[query[0] - 1] ^ prexor[query[1]];
        }

        return ans;
    }
}
