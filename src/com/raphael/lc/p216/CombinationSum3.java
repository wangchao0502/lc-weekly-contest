package com.raphael.lc.p216;

import java.util.ArrayList;
import java.util.List;

/**
 * @author raphael
 * @date 2021-02-17 13:49:11
 */
class CombinationSum3 {
    /**
     * Description for CombinationSum3:
     * 组合总数3
     */

    List<List<Integer>> ans;

    public List<List<Integer>> combinationSum3(int k, int n) {
        // code
        ans = new ArrayList<>();
        List<Integer> list = new ArrayList<>();
        backtracking(n, k, 1, list, 0);
        return ans;
    }

    private void backtracking(int target, int count, int start, List<Integer> list, int sum) {
        if (sum == target && list.size() == count) {
            ans.add(new ArrayList<>(list));
            return;
        }

        if (sum > target || list.size() > count) {
            return;
        }

        for (int i = start; i < 10; i++) {
            list.add(i);
            backtracking(target, count, i + 1, list, sum + i);
            list.remove(list.size() - 1);
        }
    }
}
