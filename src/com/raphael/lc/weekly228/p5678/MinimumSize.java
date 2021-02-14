package com.raphael.lc.weekly228.p5678;

import java.util.Arrays;

/**
 * @author raphael
 * @date 2021-02-14 10:41:50
 */
class MinimumSize {
    /**
     * Description for MinimumSize:
     * 袋子里最少数目的球
     */
    public int minimumSize(int[] nums, int maxOperations) {
        // code
        int lo = 1;
        int hi = Arrays.stream(nums).max().orElse(0);
        while (lo <= hi) {
            int mid = lo + ((hi - lo) >> 1);
            int tot = 0;
            for (int num : nums) {
                tot += (num - 1) / mid;
            }
            if (tot <= maxOperations) {
                hi = mid - 1;
            } else {
                lo = mid + 1;
            }
        }
        return lo;
    }
}
