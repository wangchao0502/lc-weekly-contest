package com.raphael.lc.p40;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author raphael
 * @date 2021-02-09 14:09:59
 */
class CombinationSum2 {
    /**
     * Description for CombinationSum2:
     * 组合总和2
     */
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        // code
        int n = candidates.length;
        List<List<Integer>> ans = new ArrayList<>();
        if (n == 0) {
            return ans;
        }

        Arrays.sort(candidates);
        backtrack(candidates, target, 0, ans, new ArrayList<>());
        return ans;
    }

    private void backtrack(int[] candidates, int target, int start, List<List<Integer>> ans, List<Integer> list) {
        if (target == 0) {
            ans.add(new ArrayList<>(list));
        }
        if (target < 0) {
            return;
        }
        for (int i = start; i < candidates.length; i++) {
            if (i > start && candidates[i] == candidates[i - 1]) {
                continue;
            }
            list.add(candidates[i]);
            backtrack(candidates, target - candidates[i], i + 1, ans, list);
            list.remove(list.size() - 1);
        }
    }
}
