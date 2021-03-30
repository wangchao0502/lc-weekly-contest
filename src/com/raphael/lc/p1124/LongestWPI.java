package com.raphael.lc.p1124;

import java.util.Stack;

/**
 * @author Raphael
 * @date 2021-03-30 18:19:12
 */
@SuppressWarnings("AlibabaLowerCamelCaseVariableNaming")
class LongestWPI {
    /**
     * Description for LongestWPI:
     * 表现良好的最长时间段
     */
    public int longestWPI(int[] hours) {
        // code
        int n = hours.length;
        int[] scores = new int[n];

        for (int i = 0; i < n; i++) {
            scores[i] = hours[i] > 8 ? 1 : -1;
        }

        int[] presum = new int[n + 1];

        for (int i = 1; i <= n; i++) {
            presum[i] = presum[i - 1] + scores[i - 1];
        }

        int ans = 0;
        Stack<Integer> stack = new Stack<>();

        for (int i = 0; i < n + 1; i++) {
            if (stack.isEmpty() || presum[stack.peek()] > presum[i]) {
                stack.push(i);
            }
        }

        int i = n;

        while (i > ans) {
            while (!stack.isEmpty() && presum[stack.peek()] < presum[i]) {
                ans = Math.max(ans, i - stack.pop());
            }
            i--;
        }

        return ans;
    }
}
