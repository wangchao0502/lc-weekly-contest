package com.raphael.lc.p128;

import java.util.HashSet;
import java.util.Set;

/**
 * @author raphael
 * @date 2021-02-02 11:39:25
 */
class LongestConsecutive {
    /**
     * Description for LongestConsecutive:
     * 最长连续序列
     */
    public int longestConsecutive(int[] nums) {
        // code
        Set<Integer> set = new HashSet<>();
        for (int n : nums ) {
            set.add(n);
        }

        int ans = 0;

        for (int n : nums ) {
            if (!set.contains(n - 1)) {
                int len = 0;
                int k = n;
                while (set.contains(k++)) {
                    len++;
                }
                ans = Math.max(ans, len);
            }
        }

        return ans;
    }
}
