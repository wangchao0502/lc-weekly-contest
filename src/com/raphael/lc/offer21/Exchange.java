package com.raphael.lc.offer21;

/**
 * @author Raphael
 * @date 2021-03-15 15:55:42
 */
class Exchange {
    /**
     * Description for Exchange:
     * 调整数组顺序使奇数位于偶数前面
     */
    public int[] exchange(int[] nums) {
        // code
        int left = 0, right = nums.length - 1;
        while (left < right) {
            if ((nums[left] & 1) == 1) {
                left++;
                continue;
            }
            if ((nums[right] & 1) == 0) {
                right--;
                continue;
            }
            int tmp = nums[left];
            nums[left] = nums[right];
            nums[right] = tmp;
        }

        return nums;
    }
}
