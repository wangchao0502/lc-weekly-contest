package com.raphael.lc.p643;

/**
 * @author raphael
 * @date 2021-02-04 13:47:58
 */
class FindMaxAverage {
    /**
     * Description for FindMaxAverage:
     * 子数组最大平均数
     */
    public double findMaxAverage(int[] nums, int k) {
        // code
        int left = 0;
        int right = 0;
        double sum = 0;

        while (right < k) {
            sum += nums[right++];
        }

        double ans = sum / k;

        while (right < nums.length) {
            sum += nums[right++];
            sum -= nums[left++];
            ans = Math.max(ans, sum / k);
        }

        return ans;
    }
}
