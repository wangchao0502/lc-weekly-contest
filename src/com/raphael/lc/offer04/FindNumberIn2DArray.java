package com.raphael.lc.offer04;

/**
 * @author Raphael
 * @date 2021-03-08 21:36:20
 */
class FindNumberIn2DArray {
    /**
     * Description for FindNumberIn2DArray:
     *
     */
    public boolean findNumberIn2DArray(int[][] matrix, int target) {
        // code
        if (matrix == null || matrix.length == 0 || matrix[0].length == 0) {
            return false;
        }
        int m = matrix.length, n = matrix[0].length;
        int row = 0, col = n - 1;

        while (row < m && col >= 0){
            int num = matrix[row][col];
            if (num == target) return true;
            if (num > target) col--;
            else row++;
        }

        return false;
    }
}
