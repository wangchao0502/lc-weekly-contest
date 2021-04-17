package com.raphael.lc.p220;

import java.util.Arrays;
import java.util.Comparator;

/**
 * @author Raphael
 * @date 2021-04-17 10:02:31
 */
class ContainsNearbyAlmostDuplicate {
    /**
     * Description for ContainsNearbyAlmostDuplicate:
     * 存在重复元素3
     */
    public boolean containsNearbyAlmostDuplicate(int[] nums, int k, int t) {
        // code
        int n = nums.length;
        if (n < 2) return false;

        long[][] pairs = new long[n][2];

        for (int i = 0; i < n; i++) {
            pairs[i] = new long[]{nums[i], i};
        }

        Arrays.sort(pairs, Comparator.comparingLong(x -> x[0]));

        int left = 0, right = 1;

        while (left < n && right < n) {
            while (right < n && pairs[right][0] - pairs[left][0] <= t) {
                if (Math.abs(pairs[left][1] - pairs[right][1]) <= k) {
                    return true;
                }
                right++;
            }
            left++;
            right = left + 1;
        }

        return false;
    }
}
