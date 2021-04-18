package com.raphael.lc.p26;

/**
 * @author Raphael
 * @date 2021-04-18 10:05:45
 */
class RemoveDuplicates {
    /**
     * Description for RemoveDuplicates:
     * 删除有序数组中的重复项
     */
    public int removeDuplicates(int[] nums) {
        // code
        int index = 0;
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] != nums[index]) {
                nums[++index] = nums[i];
            }
        }

        return index + 1;
    }
}
