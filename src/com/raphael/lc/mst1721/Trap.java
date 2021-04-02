package com.raphael.lc.mst1721;

import java.util.Stack;

/**
 * @author Raphael
 * @date 2021-04-02 10:56:43
 */
class Trap {
    /**
     * Description for Trap:
     * 直方图的水量
     */
    public int trap(int[] height) {
        // code
        Stack<Integer> stack = new Stack<>();
        int ans = 0;

        for (int i = 0; i < height.length; i++) {
            while (!stack.isEmpty() && height[stack.peek()] < height[i]) {
                int top = stack.pop();
                if (stack.isEmpty()) {
                    break;
                }
                int left = stack.peek();
                int currWidth = i - left - 1;
                int currHeight = Math.min(height[left], height[i]) - height[top];
                ans += currHeight * currWidth;
            }
            stack.push(i);
        }

        return ans;
    }
}
