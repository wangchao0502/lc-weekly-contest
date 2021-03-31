package com.raphael.lc.p1209;

import java.util.Stack;

/**
 * @author Raphael
 * @date 2021-03-31 14:11:53
 */
class RemoveDuplicates {
    /**
     * Description for RemoveDuplicates:
     * 删除字符串中的所有相邻重复项2
     */
    public String removeDuplicates(String s, int k) {
        // code
        Stack<int[]> stack = new Stack<>();

        for (char c : s.toCharArray()) {
            if (!stack.isEmpty() && stack.peek()[0] == c) {
                if (stack.peek()[1] == k - 1) {
                    stack.pop();
                } else {
                    stack.push(new int[]{c, stack.pop()[1] + 1});
                }
                continue;
            }
            stack.push(new int[]{c, 1});
        }

        StringBuilder sb = new StringBuilder();
        while (!stack.isEmpty()) {
            int[] item = stack.pop();
            for (int i = 0; i < item[1]; i++) {
                sb.append((char) item[0]);
            }
        }

        return sb.reverse().toString();
    }
}
