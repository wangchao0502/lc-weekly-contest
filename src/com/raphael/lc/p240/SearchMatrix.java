package com.raphael.lc.p240;

/**
 * @author Raphael
 * @date 2021-02-19 18:47:35
 */
class SearchMatrix {
    /**
     * Description for SearchMatrix:
     * 搜索二维矩阵2
     */
    public boolean searchMatrix(int[][] matrix, int target) {
        // code
        int row = matrix.length - 1;
        int col = 0;

        while (row >= 0 && col < matrix[0].length) {
            if (matrix[row][col] > target) {
                row--;
            } else if (matrix[row][col] < target) {
                col++;
            } else {
                return true;
            }
        }

        return false;
    }
}
