package com.raphael.lc.p682;

import java.util.Stack;

/**
 * @author Raphael
 * @date 2021-03-25 12:29:23
 */
class CalPoints {
    /**
     * Description for CalPoints:
     * 棒球比赛
     */
    public int calPoints(String[] ops) {
        // code
        Stack<Integer> stack = new Stack<>();

        for (String op : ops) {
            switch (op) {
                case "D":
                    stack.push(stack.peek() * 2);
                    break;
                case "C":
                    stack.pop();
                    break;
                case "+":
                    stack.push(stack.peek() + stack.get(stack.size() - 2));
                    break;
                default:
                    stack.push(Integer.parseInt(op));
            }
        }

        int sum = 0;
        while (!stack.isEmpty()) {
            sum += stack.pop();
        }

        return sum;
    }
}
