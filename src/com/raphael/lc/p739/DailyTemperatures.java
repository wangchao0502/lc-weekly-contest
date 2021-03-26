package com.raphael.lc.p739;

import java.util.Stack;

/**
 * @author Raphael
 * @date 2021-03-26 11:10:15
 */
class DailyTemperatures {
    /**
     * Description for DailyTemperatures:
     * 每日温度
     */
    public int[] dailyTemperatures(int[] t) {
        // code
        int n = t.length;
        Stack<Integer> stack = new Stack<>();
        int[] ans = new int[n];

        for (int i = 0; i < n; i++) {
            while (!stack.isEmpty() && t[stack.peek()] < t[i]) {
                int idx = stack.pop();
                ans[idx] = i - idx;
            }
            stack.push(i);
        }

        return ans;
    }
}
