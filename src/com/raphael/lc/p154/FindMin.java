package com.raphael.lc.p154;

/**
 * @author Raphael
 * @date 2021-04-09 16:59:08
 */
class FindMin {
    /**
     * Description for FindMin:
     * 寻找旋转排顺序数组中的最小值2
     */
    public int findMin(int[] nums) {
        // code
        int left = 0, right = nums.length - 1;
        while (left < right) {
            int mid = left + ((right - left) >> 1);
            if (nums[mid] < nums[right]) {
                right = mid;
            } else if (nums[mid] > nums[right]) {
                left = mid + 1;
            } else {
                right--;
            }
        }
        return nums[left];
    }
}
