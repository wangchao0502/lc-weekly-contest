package com.raphael.lc.p1673;

import java.util.Stack;

/**
 * @author Raphael
 * @date 2021-04-05 10:54:24
 */
class MostCompetitive {
    /**
     * Description for MostCompetitive:
     * 找出最具竞争力的子序列
     */
    public int[] mostCompetitive(int[] nums, int k) {
        // code
        Stack<Integer> stack = new Stack<>();
        int count = 0;

        for (int n : nums) {
            while (!stack.isEmpty() && stack.peek() > n && count < nums.length - k) {
                stack.pop();
                count++;
            }
            stack.push(n);
        }

        int[] ans = new int[k];
        for (int i = 0; i < k; i++) {
            ans[i] = stack.get(i);
        }

        return ans;
    }
}
