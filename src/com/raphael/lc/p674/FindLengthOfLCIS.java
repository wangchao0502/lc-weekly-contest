package com.raphael.lc.p674;

/**
 * @author raphael
 * @date 2021-01-24 12:55:03
 */
@SuppressWarnings("AlibabaClassNamingShouldBeCamel")
class FindLengthOfLCIS {
    /**
     * Description for FindLengthOfLCIS:
     * 给定未排序的数组，找到最长连续递增子序列
     */
    @SuppressWarnings("AlibabaLowerCamelCaseVariableNaming")
    public int findLengthOfLCIS(int[] nums) {
        // code
        if (nums.length == 0) {
            return 0;
        }
        int ptr = 0;
        int ans = 1;
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] > nums[i - 1]) {
                ans = Math.max(i - ptr + 1, ans);
            } else {
                ptr = i;
            }
        }
        return ans;
    }
}
