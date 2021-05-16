package com.raphael.lc.p5759;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Raphael
 * @date 2021-05-16 10:33:00
 */
@SuppressWarnings("AlibabaLowerCamelCaseVariableNaming")
class SubsetXORSum {
    /**
     * Description for SubsetXORSum:
     * 找出所有子集的异或总和再求和
     */

    List<Integer> list;

    private void dfs(int pre, int cur, int[] nums) {
        if (cur == nums.length) {
            return;
        }
        dfs(pre, cur + 1, nums);
        pre ^= nums[cur];
        list.add(pre);
        dfs(pre, cur + 1, nums);
    }

    public int subsetXORSum(int[] nums) {
        // code
        list = new ArrayList<>();
        int n = nums.length;
        dfs(0, 0, nums);
        int sum = 0;
        for (int num : list) {
            sum += num;
        }
        return sum;
    }
}
