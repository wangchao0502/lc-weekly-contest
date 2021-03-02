package com.raphael.lc.p303;

/**
 * @author Raphael
 * @date 2021-03-01 19:33:44
 */
class NumArray {
    /**
     * Description for SumRange:
     * 区域和检索 - 数组不可变
     */

    int[] prefixSum;

    public NumArray(int[] nums) {
        int n = nums.length;
        prefixSum = new int[n + 1];
        int sum = 0;

        for (int i = 1; i <= n; i++) {
            sum += nums[i - 1];
            prefixSum[i] = sum;
        }
    }

    public int sumRange(int i, int j) {
        // code
        return prefixSum[j + 1] - prefixSum[i];
    }
}
