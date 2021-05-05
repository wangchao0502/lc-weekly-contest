package com.raphael.lc.p740;

/**
 * @author Raphael
 * @date 2021-05-05 11:50:42
 */
class DeleteAndEarn {
    /**
     * Description for DeleteAndEarn:
     * 删除并获得点数
     */
    public int deleteAndEarn(int[] nums) {
        // code
        int maxVal = 0;
        for (int n : nums) {
            maxVal = Math.max(maxVal, n);
        }
        int[] sum = new int[maxVal + 1];
        for (int n : nums) {
            sum[n] += n;
        }
        return rob(sum);
    }

    private int rob(int[] nums) {
        int first = nums[0];
        int second = Math.max(nums[0], nums[1]);
        int n = nums.length;

        for (int i = 2; i < n; i++) {
            int tmp = second;
            second = Math.max(first + nums[i], second);
            first = tmp;
        }

        return second;
    }
}
