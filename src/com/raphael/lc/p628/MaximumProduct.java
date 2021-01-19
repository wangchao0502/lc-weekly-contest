package com.raphael.lc.p628;

import java.util.Arrays;

/**
 * @author raphael
 * @date 2021-01-20 00:07:49
 */
class MaximumProduct {
    /**
     * Description for MaximumProduct:
     * 给定一个整型数组，在数组中找出由三个数组成的最大乘积，并输出这个乘积。
     */
    public int maximumProduct(int[] nums) {
        // code
        int n = nums.length;
        Arrays.sort(nums);
        return Math.max(nums[n - 1] * nums[n - 2] * nums[n - 3], nums[n - 1] * nums[0] * nums[1]);
    }
}
