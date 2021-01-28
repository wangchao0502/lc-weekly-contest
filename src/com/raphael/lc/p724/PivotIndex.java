package com.raphael.lc.p724;

/**
 * @author raphael
 * @date 2021-01-28 21:50:54
 */
class PivotIndex {
    /**
     * Description for PivotIndex:
     * 寻找数组的中心索引
     */
    public int pivotIndex(int[] nums) {
        // code
        int sum = 0;
        for (int n : nums) {
            sum += n;
        }
        int s = 0;
        for (int i = 0; i < nums.length; i++) {
            if (s * 2 + nums[i] == sum) {
                return i;
            }
            s += nums[i];
        }
        return -1;
    }
}
