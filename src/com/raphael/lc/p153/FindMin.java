package com.raphael.lc.p153;

/**
 * @author Raphael
 * @date 2021-02-18 15:14:09
 */
class FindMin {
    /**
     * Description for FindMin:
     * 寻找旋转排序数组中的最小值
     */
    public int findMin(int[] nums) {
        // code
        int left = 0, right = nums.length - 1;

        if (nums.length == 1 || nums[0] < nums[right]) {
            return nums[0];
        }

        while (left <= right) {
            int mid = left + ((right - left) >> 1);
            if (nums[mid] > nums[mid + 1]) {
                return nums[mid + 1];
            }
            if (nums[mid - 1] > nums[mid]) {
                return nums[mid];
            }

            if (nums[mid] > nums[right]) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return -1;
    }
}
