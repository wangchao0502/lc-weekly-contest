package com.raphael.lc.p304;

/**
 * @author Raphael
 * @date 2021-03-02 07:39:59
 */
class NumMatrix {
    /**
     * Description for NumMatrix:
     * 二维区域和检索- 矩阵不可变
     */

    int[][] sum;

    public NumMatrix(int[][] matrix) {
        int m = matrix.length;
        int n = m == 0 ? 0 : matrix[0].length;
        sum = new int[m + 1][n + 1];

        for (int i = 1; i <= m; i++) {
            int rowSum = 0;
            for (int j = 1; j <= n; j++) {
                rowSum += matrix[i - 1][j - 1];
                sum[i][j] = sum[i - 1][j] + rowSum;
            }
        }
    }

    public int sumRegion(int row1, int col1, int row2, int col2) {
        return sum[row2 + 1][col2 + 1] - sum[row2 + 1][col1] - sum[row1][col2 + 1] + sum[row1][col1];
    }
}
