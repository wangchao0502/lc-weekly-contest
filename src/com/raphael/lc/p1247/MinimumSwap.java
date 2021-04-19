package com.raphael.lc.p1247;

import java.util.Stack;

/**
 * @author Raphael
 * @date 2021-04-19 13:02:43
 */
class MinimumSwap {
    /**
     * Description for MinimumSwap:
     * 交换字符使得字符串相同
     */
    public int minimumSwap(String s1, String s2) {
        // code
        int n = s1.length();
        Stack<Character> stack = new Stack<>();
        int i = 0, ans = 0;

        while (i < n) {
            char c1 = s1.charAt(i);
            char c2 = s2.charAt(i);
            if (c1 != c2) {
                if (!stack.isEmpty() && stack.peek() == c1) {
                    stack.pop();
                    ans++;
                } else {
                    stack.push(c1);
                }
            }
            i++;
        }

        if ((stack.size() & 1) == 1) {
            return -1;
        }

        if (((stack.size() / 2) & 1) == 1) {
            return ans + (stack.size() + 2) / 2;
        }

        return ans + stack.size() / 2;
    }
}
