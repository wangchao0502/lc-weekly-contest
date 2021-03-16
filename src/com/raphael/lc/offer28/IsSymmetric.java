package com.raphael.lc.offer28;

import com.raphael.lc.common.TreeNode;

/**
 * @author Raphael
 * @date 2021-03-16 14:44:43
 */
class IsSymmetric {
    /**
     * Description for IsSymmetric:
     * 对称二叉树
     */

    private boolean helper(TreeNode left, TreeNode right) {
        if (left == null && right == null) return true;
        if (left == null || right == null) return false;
        return left.val == right.val && helper(left.left, right.right) && helper(left.right, right.left);
    }

    public boolean isSymmetric(TreeNode root) {
        // code
        if (root == null) return true;
        return helper(root.left, root.right);
    }
}
