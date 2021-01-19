package com.raphael.lc.p39;

import java.util.ArrayList;
import java.util.List;

/**
 * @author raphael
 * @date 2021-01-19 22:27:49
 */
class CombinationSum {
    /**
     * Description for CombinationSum:
     */
    public void dfs(int[] candidates, int target, List<List<Integer>> ans, List<Integer> combine, int idx) {
        if (idx == candidates.length) {
            return;
        }
        if (target == 0) {
            ans.add(new ArrayList<>(combine));
            return;
        }
        dfs(candidates, target, ans, combine, idx + 1);
        if (target - candidates[idx] >= 0) {
            combine.add(candidates[idx]);
            dfs(candidates, target - candidates[idx], ans, combine, idx);
            combine.remove(combine.size() - 1);
        }
    }

    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        // code
        List<List<Integer>> ans = new ArrayList<>();
        List<Integer> combine = new ArrayList<>();
        dfs(candidates, target, ans, combine, 0);
        return ans;
    }
}
