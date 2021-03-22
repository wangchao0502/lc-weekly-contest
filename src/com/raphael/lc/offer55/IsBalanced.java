package com.raphael.lc.offer55;

import com.raphael.lc.common.TreeNode;

/**
 * @author Raphael
 * @date 2021-03-22 11:33:42
 */
class IsBalanced {
    /**
     * Description for IsBalanced:
     * 平衡二叉树
     */

    private int helper(TreeNode node, int curDepth) {
        // 返回树深度, -1表示不平衡
        if (node == null) return curDepth;
        curDepth++;
        int leftDepth = helper(node.left, curDepth);
        int rightDepth = helper(node.right, curDepth);

        if (leftDepth == -1 || rightDepth == -1) {
            return -1;
        }

        if (Math.abs(leftDepth - rightDepth) > 1) {
            return -1;
        }

        return Math.max(leftDepth, rightDepth);
    }

    public boolean isBalanced(TreeNode root) {
        // code
        return helper(root, 0) != -1;
    }
}
