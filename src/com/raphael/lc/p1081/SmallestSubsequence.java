package com.raphael.lc.p1081;

import java.util.Stack;

/**
 * @author Raphael
 * @date 2021-03-30 16:26:34
 */
class SmallestSubsequence {
    /**
     * Description for SmallestSubsequence:
     * 不同字符的最小子序列
     */
    public String smallestSubsequence(String s) {
        // code
        StringBuilder sb = new StringBuilder();
        // 单调递增栈
        Stack<Character> stack = new Stack<>();
        char[] chars = s.toCharArray();
        boolean[] used = new boolean[26];
        int[] count = new int[26];

        for (char c : chars) {
            count[c - 'a']++;
        }

        for (char c : chars) {
            if (used[c - 'a']) {
                count[c - 'a']--;
                continue;
            }
            while (!stack.isEmpty() && stack.peek() > c && count[stack.peek() - 'a'] > 1) {
                char top = stack.pop();
                count[top - 'a']--;
                used[top - 'a'] = false;
            }
            if (!used[c - 'a']) {
                used[c - 'a'] = true;
                stack.push(c);
            }
        }

        while (!stack.isEmpty()) {
            sb.append(stack.pop());
        }

        return sb.reverse().toString();
    }
}
