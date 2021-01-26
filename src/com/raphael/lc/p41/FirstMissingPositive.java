package com.raphael.lc.p41;

/**
 * @author raphael
 * @date 2021-01-26 20:40:54
 */
class FirstMissingPositive {
    /**
     * Description for FirstMissingPositive:
     * 给你一个未排序的证书数组nums，请你找出其中没有出现的最小的正整数
     * O(n)时间复杂度, O(1)空间复杂度
     */
    public int firstMissingPositive(int[] nums) {
        // code
        int n = nums.length;
        for (int i = 0; i < n; i++) {
            while (nums[i] > 0 && nums[i] <= n && nums[nums[i] - 1] != nums[i]) {
                int tmp = nums[nums[i] - 1];
                nums[nums[i] - 1] = nums[i];
                nums[i] = tmp;
            }
        }
        for (int i = 0; i < n; i++) {
            if (nums[i] != i + 1) {
                return i + 1;
            }
        }
        return n + 1;
    }
}
