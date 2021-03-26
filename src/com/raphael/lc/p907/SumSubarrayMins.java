package com.raphael.lc.p907;

import java.util.Stack;

/**
 * @author Raphael
 * @date 2021-03-26 12:09:00
 */
@SuppressWarnings("AlibabaLowerCamelCaseVariableNaming")
class SumSubarrayMins {
    /**
     * Description for SumSubarrayMins:
     * 子数组的最小值之和
     */
    public int sumSubarrayMins(int[] arr) {
        // code
        int BASE = 1_000_000_007;
        int n = arr.length;
        long ans = 0, cost = 0;
        Stack<Integer> stack = new Stack<>();
        stack.push(-1);

        for (int i = 0; i < n; i++) {
            while (stack.size() > 1 && arr[stack.peek()] > arr[i]) {
                int top = stack.pop();
                cost -= (long) arr[top] * (top - stack.peek());
            }
            cost += (long) arr[i] * (i - stack.peek());
            ans += cost;
            stack.push(i);
        }

        return (int) (ans % BASE);
    }
}
