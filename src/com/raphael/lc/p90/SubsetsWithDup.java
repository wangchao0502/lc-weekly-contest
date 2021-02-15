package com.raphael.lc.p90;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author raphael
 * @date 2021-02-15 16:53:38
 */
class SubsetsWithDup {
    /**
     * Description for SubsetsWithDup:
     * 子集2
     */

    List<List<Integer>> ans;

    private void backtracking(int[] nums, int start, List<Integer> list) {
        ans.add(new ArrayList<>(list));
        for (int i = start; i < nums.length; i++) {
            if (i > start && nums[i] == nums[i - 1]) {
                continue;
            }
            list.add(nums[i]);
            backtracking(nums, i + 1, list);
            list.remove(list.size() - 1);
        }
    }

    public List<List<Integer>> subsetsWithDup(int[] nums) {
        // code
        ans = new ArrayList<>();
        Arrays.sort(nums);
        List<Integer> list = new ArrayList<>();
        backtracking(nums, 0, list);
        return ans;
    }
}
