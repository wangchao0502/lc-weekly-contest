package com.raphael.lc.p80;

/**
 * @author raphael
 * @date 2021-02-04 16:46:10
 */
class RemoveDuplicates {
    /**
     * Description for RemoveDuplicates:
     * 删除排序数组中的重复项 II
     */
    public int removeDuplicates(int[] nums) {
        // code
        int n = nums.length;
        int count = 1;
        int left = 1, right = 1;

        while (right < n) {
            if (nums[right] == nums[right - 1]) {
                count++;
            } else {
                count = 1;
            }

            if (count <= 2) {
                nums[left++] = nums[right];
            }
            right++;
        }

        return left;
    }
}
