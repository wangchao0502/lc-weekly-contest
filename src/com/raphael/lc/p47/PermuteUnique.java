package com.raphael.lc.p47;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author raphael
 * @date 2021-02-09 14:46:17
 */
class PermuteUnique {
    /**
     * Description for PermuteUnique:
     * 全排列2
     */
    boolean[] visit;

    public List<List<Integer>> permuteUnique(int[] nums) {
        // code
        int n = nums.length;
        visit = new boolean[n];
        List<List<Integer>> ans = new ArrayList<>();
        List<Integer> list = new ArrayList<>();
        Arrays.sort(nums);
        backtrack(nums, list, 0, ans);
        return ans;
    }

    @SuppressWarnings("AlibabaAvoidComplexCondition")
    private void backtrack(int[] nums, List<Integer> list, int start, List<List<Integer>> ans) {
        if (start == nums.length) {
            ans.add(new ArrayList<>(list));
            return;
        }
        for (int i = 0; i < nums.length; i++) {
            if (visit[i] || (i > 0 && nums[i] == nums[i - 1] && !visit[i - 1])) {
                continue;
            }
            list.add(nums[i]);
            visit[i] = true;
            backtrack(nums, list, start + 1, ans);
            visit[i] = false;
            list.remove(start);
        }
    }
}
