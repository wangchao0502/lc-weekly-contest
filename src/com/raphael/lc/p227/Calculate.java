package com.raphael.lc.p227;

import java.util.Stack;

/**
 * @author Raphael
 * @date 2021-03-11 10:23:08
 */
@SuppressWarnings("AlibabaAvoidComplexCondition")
class Calculate {
    /**
     * Description for Calculate:
     * 基本计算器2
     */
    public int calculate(String s) {
        // code
        Stack<Integer> stack = new Stack<>();
        int n = s.length();
        char preSign = '+';
        int num = 0;
        for (int i = 0; i < n; i++) {
            char c = s.charAt(i);
            if (Character.isDigit(c)) {
                num = num * 10 + c - '0';
            }
            if (!Character.isDigit(c) && c != ' ' || i == n - 1) {
                switch (preSign) {
                    case '+':
                        stack.push(num);
                        break;
                    case '-':
                        stack.push(-num);
                        break;
                    case '*':
                        stack.push(stack.pop() * num);
                        break;
                    case '/':
                        stack.push(stack.pop() / num);
                        break;
                    default:
                }
                preSign = c;
                num = 0;
            }
        }

        int ans = 0;
        while (!stack.isEmpty()) {
            ans += stack.pop();
        }

        return ans;
    }
}
