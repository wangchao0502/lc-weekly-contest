package com.raphael.lc.p74;

/**
 * @author Raphael
 * @date 2021-02-18 11:16:44
 */
class SearchMatrix {
    /**
     * Description for SearchMatrix:
     */
    public boolean searchMatrix(int[][] matrix, int target) {
        // code
        int m = matrix.length;
        int n = matrix[0].length;
        int left = 0, right = m;
        // 查找左边界，慢慢靠近，所以每次left = mid + 1;
        while (left < right) {
            int mid = left + ((right - left) >> 1);
            if (matrix[mid][0] < target) {
                left = mid + 1;
            } else {
                right = mid;
            }
        }
        if (left != m && matrix[left][0] == target) {
            return true;
        }
        if (left == 0) {
            return false;
        }
        int row = left - 1;
        left = 0;
        right = n - 1;
        while (left <= right) {
            int mid = left + ((right - left) >> 1);
            if (matrix[row][mid] > target) {
                right = mid - 1;
            } else if (matrix[row][mid] < target) {
                left = mid + 1;
            } else {
                return true;
            }
        }
        return false;
    }
}
