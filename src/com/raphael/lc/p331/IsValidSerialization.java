package com.raphael.lc.p331;

import java.util.Stack;

/**
 * @author Raphael
 * @date 2021-03-12 10:10:49
 */
class IsValidSerialization {
    /**
     * Description for IsValidSerialization:
     * 验证二叉树的前序序列化
     */
    public boolean isValidSerialization(String preorder) {
        // code
        Stack<Integer> stack = new Stack<>();
        String[] strs = preorder.split(",");

        for (String subStr : strs) {
            // 0 - #, 1 - digital
            if ("#".equals(subStr)) {
                stack.push(0);
                int len = stack.size();
                while (len > 2 && stack.peek() == 0 && stack.get(len - 2) == 0) {
                    if (stack.get(len - 3) != 1) {
                        return false;
                    }
                    stack.pop();
                    stack.pop();
                    stack.pop();
                    stack.push(0);
                    len -= 2;
                }
            } else {
                stack.push(1);
            }
        }

        return stack.size() == 1 && stack.peek() == 0;
    }
}
