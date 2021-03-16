package com.raphael.lc.offer29;

/**
 * @author Raphael
 * @date 2021-03-16 15:36:51
 */
class SpiralOrder {
    /**
     * Description for SpiralOrder:
     * 顺时针打印矩阵
     */
    public int[] spiralOrder(int[][] matrix) {
        // code
        int n = matrix.length;
        if (n == 0) return new int[]{};
        int m = matrix[0].length;
        int[] ans = new int[n * m];
        int i = 0, total = n * m;
        int row = 0, col = 0;
        int r = n - 1, c = m;

        while (i < total) {
            for (int j = 0; i < total && j < c; j++) {
                ans[i++] = matrix[row][col++];
            }
            c--;
            col--;
            row++;
            for (int j = 0; i < total && j < r; j++) {
                ans[i++] = matrix[row++][col];
            }
            r--;
            row--;
            col--;
            for (int j = 0; i < total && j < c; j++) {
                ans[i++] = matrix[row][col--];
            }
            c--;
            col++;
            row--;
            for (int j = 0; i < total && j < r; j++) {
                ans[i++] = matrix[row--][col];
            }
            r--;
            row++;
            col++;
        }

        return ans;
    }
}
