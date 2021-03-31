package com.raphael.lc.p1130;

import java.util.Stack;

/**
 * @author Raphael
 * @date 2021-03-31 12:55:54
 */
class MctFromLeafValues {
    /**
     * Description for MctFromLeafValues:
     * 叶值的最小代价生成树
     */
    public int mctFromLeafValues(int[] arr) {
        // code
        Stack<Integer> stack = new Stack<>();
        stack.push(Integer.MAX_VALUE);
        int mct = 0;
        for (int j : arr) {
            while (j >= stack.peek()) {
                mct += stack.pop() * Math.min(stack.peek(), j);
            }
            stack.push(j);
        }
        while (stack.size() > 2) {
            mct += stack.pop() * stack.peek();
        }
        return mct;
    }
}
