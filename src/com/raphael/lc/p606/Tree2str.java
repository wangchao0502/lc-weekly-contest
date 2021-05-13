package com.raphael.lc.p606;

import com.raphael.lc.common.TreeNode;

import java.util.Stack;

/**
 * @author Raphael
 * @date 2021-05-12 16:02:49
 */
class Tree2str {
    /**
     * Description for Tree2str:
     * 根据二叉树创建字符串
     */

    private void preorder(TreeNode node, Stack<String> stack) {
        if (node == null) {
            return;
        }

        stack.push(String.valueOf(node.val));
        stack.push("(");
        if (node.left == null && node.right == null) {
            stack.pop();
        } else {
            preorder(node.left, stack);
            stack.push(")");
        }
        stack.push("(");
        preorder(node.right, stack);
        if ("(".equals(stack.peek())) {
            stack.pop();
        } else {
            stack.push(")");
        }
    }


    public String tree2str(TreeNode root) {
        // code
        Stack<String> stack = new Stack<>();
        preorder(root, stack);
        StringBuilder sb = new StringBuilder();
        int i = 0;

        while (i < stack.size()) {
            sb.append(stack.get(i++));
        }

        return sb.toString();
    }
}
