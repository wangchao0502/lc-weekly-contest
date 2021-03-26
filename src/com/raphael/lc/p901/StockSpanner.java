package com.raphael.lc.p901;

import java.util.Stack;

/**
 * @author Raphael
 * @date 2021-03-26 11:45:13
 */
class StockSpanner {
    /**
     * Description for StockSpanner:
     * 股票价格跨度
     */

    Stack<int[]> stack;
    int index;

    public StockSpanner() {
        stack = new Stack<>();
        index = 0;
    }

    public int next(int price) {
        while (!stack.isEmpty() && stack.peek()[1] <= price) {
            stack.pop();
        }
        index++;
        int ans = index;
        if (!stack.isEmpty()) {
            int[] item = stack.peek();
            ans = index - item[0];
        }
        stack.push(new int[]{index, price});
        return ans;
    }
}
