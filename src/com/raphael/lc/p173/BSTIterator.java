package com.raphael.lc.p173;

import com.raphael.lc.common.TreeNode;

import java.util.Stack;

/**
 * @author Raphael
 * @date 2021-02-26 15:34:28
 */
class BSTIterator {
    /**
     * Description for BSTIterator:
     */

    Stack<TreeNode> stack;

    public BSTIterator(TreeNode root) {
        stack = new Stack<>();
        TreeNode curNode = root;
        while (curNode != null) {
            stack.push(curNode);
            curNode = curNode.left;
        }
    }

    public int next() {
        TreeNode node = stack.pop();
        TreeNode curNode = node;

        if (curNode.right != null) {
            curNode = curNode.right;
            while (curNode != null) {
                stack.push(curNode);
                curNode = curNode.left;
            }
        }

        return node.val;
    }

    public boolean hasNext() {
        return stack.size() != 0;
    }
}
