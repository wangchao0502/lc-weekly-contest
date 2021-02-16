package com.raphael.lc.p561;

import java.util.Arrays;

/**
 * @author raphael
 * @date 2021-02-16 12:18:46
 */
class ArrayPairSum {
    /**
     * Description for ArrayPairSum:
     * 数组拆分1
     */
    public int arrayPairSum(int[] nums) {
        // code
        Arrays.sort(nums);
        int sum = 0;
        for (int i = 0; i < nums.length; i += 2) {
            sum += nums[i];
        }
        return sum;
    }
}
