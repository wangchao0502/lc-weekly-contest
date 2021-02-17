package com.raphael.lc.p566;

/**
 * @author raphael
 * @date 2021-02-17 12:17:40
 */
class MatrixReshape {
    /**
     * Description for MatrixReshape:
     * 重塑矩阵
     */
    public int[][] matrixReshape(int[][] nums, int r, int c) {
        // code
        int m = nums.length;
        int n = nums[0].length;
        if (r * c > m * n) {
            return nums;
        }
        int[][] ans = new int[r][c];
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                int idx = i * c + j;
                int x = idx / n;
                int y = idx % n;
                ans[i][j] = nums[x][y];
            }
        }
        return ans;
    }
}
