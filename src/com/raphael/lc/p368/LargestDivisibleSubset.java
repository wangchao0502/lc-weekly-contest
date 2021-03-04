package com.raphael.lc.p368;

import java.util.*;

/**
 * @author Raphael
 * @date 2021-03-04 11:47:05
 */
class LargestDivisibleSubset {
    /**
     * Description for LargestDivisibleSubset:
     * 最大整除子集
     */
    public List<Integer> largestDivisibleSubset(int[] nums) {
        // code
        int n = nums.length;
        int[] dp = new int[n];
        int max = 0;
        Map<Integer, List<Integer>> map = new HashMap<>(16);

        Arrays.sort(nums);

        for (int i = 0; i < n; i++) {
            dp[i] = 1;
            map.computeIfAbsent(i, k -> new ArrayList<>()).add(nums[i]);
        }

        for (int i = 1; i < n; i++) {
            for (int j = 0; j < i; j++) {
                if (nums[i] % nums[j] == 0 && dp[j] + 1 > dp[i]) {
                    dp[i] = dp[j] + 1;
                    List<Integer> lastList = new ArrayList<>(map.get(j));
                    lastList.add(nums[i]);
                    map.put(i, lastList);
                }
            }
            if (dp[i] > dp[max]) {
                max = i;
            }
        }

        return map.get(max);
    }
}
