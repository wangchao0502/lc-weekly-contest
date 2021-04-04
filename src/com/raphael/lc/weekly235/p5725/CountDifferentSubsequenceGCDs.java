package com.raphael.lc.weekly235.p5725;

import java.util.HashSet;
import java.util.Set;

/**
 * @author Raphael
 * @date 2021-04-04 11:00:21
 */
@SuppressWarnings("AlibabaLowerCamelCaseVariableNaming")
class CountDifferentSubsequenceGCDs {
    /**
     * Description for CountDifferentSubsequenceGCDs:
     * 序列中不同最大公约数的数目
     */

    Set<Integer> set;

    private int gcd(int a, int b) {
        if (b == 0)
            return a;
        else
            return gcd(b, a % b);
    }

    private void backtracking(int[] nums, int start, int prev) {
        if (prev != 0) set.add(prev);
        if (prev == 1) return;

        for (int i = start; i < nums.length; i++) {
            if (prev == 0) {
                backtracking(nums, i + 1, nums[i]);
            } else {
                backtracking(nums, i + 1, gcd(prev, nums[i]));
                backtracking(nums, i + 1, prev);
            }
        }
    }

    public int countDifferentSubsequenceGCDs(int[] nums) {
        // code
        int n = nums.length;
        set = new HashSet<>();
        backtracking(nums, 0, 0);
        return set.size();
    }
}
