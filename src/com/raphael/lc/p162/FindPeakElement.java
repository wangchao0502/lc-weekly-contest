package com.raphael.lc.p162;

/**
 * @author Raphael
 * @date 2021-02-19 18:38:02
 */
class FindPeakElement {
    /**
     * Description for FindPeakElement:
     * 寻找峰值
     */
    public int findPeakElement(int[] nums) {
        // code
        int left = 0, right = nums.length - 1;
        while (left < right) {
            int mid = left + ((right - left) >> 1);
            if (nums[mid] < nums[mid + 1]) {
                left = mid + 1;
            } else {
                right = mid;
            }
        }
        return left;
    }
}
