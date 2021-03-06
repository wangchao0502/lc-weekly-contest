package com.raphael.lc.p413;

/**
 * @author Raphael
 * @date 2021-03-06 21:50:01
 */
class NumberOfArithmeticsSlices {
    /**
     * Description for NumberOfArithmeticsSlices:
     * 等差数列划分
     */
    public int numberOfArithmeticsSlices(int[] nums) {
        // code
        int dp = 0;
        int sum = 0;
        for (int i = 2; i < nums.length; i++) {
            if (nums[i] - nums[i - 1] == nums[i - 1] - nums[i - 2]) {
                dp = 1 + dp;
                sum += dp;
            } else
                dp = 0;
        }
        return sum;
    }
}
