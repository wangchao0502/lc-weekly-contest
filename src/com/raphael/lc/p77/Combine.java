package com.raphael.lc.p77;

import java.util.ArrayList;
import java.util.List;

/**
 * @author raphael
 * @date 2021-02-13 15:40:46
 */
class Combine {
    /**
     * Description for Combine:
     * 组合
     */

    List<List<Integer>> ans;

    private void backtracking(int[] nums, int start, int k, List<Integer> list) {
        if (list.size() == k) {
            ans.add(new ArrayList<>(list));
            return;
        }

        for (int i = start; i < nums.length; i++) {
            list.add(nums[i]);
            backtracking(nums, i + 1, k, list);
            list.remove(list.size() - 1);
        }
    }


    public List<List<Integer>> combine(int n, int k) {
        // code
        ans = new ArrayList<>();
        int[] nums = new int[n];
        for (int i = 0; i < n; i++) {
            nums[i] = i + 1;
        }
        backtracking(nums, 0, k, new ArrayList<>());
        return ans;
    }
}
