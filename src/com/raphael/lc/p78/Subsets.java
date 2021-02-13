package com.raphael.lc.p78;

import java.util.ArrayList;
import java.util.List;

/**
 * @author raphael
 * @date 2021-02-13 14:22:52
 */
class Subsets {
    /**
     * Description for Subsets:
     * 子集
     */
    List<List<Integer>> ans;

    private void backtracking(int[] nums, int n, int k, List<Integer> list) {
        if (list.size() == n) {
            ans.add(new ArrayList<>(list));
            return;
        }

        for (int i = k; i < nums.length; i++) {
            list.add(nums[i]);
            backtracking(nums, n, i + 1, list);
            list.remove(list.size() - 1);
        }
    }

    public List<List<Integer>> subsets(int[] nums) {
        // code
        ans = new ArrayList<>();
        for (int i = 0; i <= nums.length; i++) {
            List<Integer> list = new ArrayList<>();
            backtracking(nums, i, 0, list);
        }
        return ans;
    }
}
