package com.raphael.lc.p110;

import com.raphael.lc.common.TreeNode;

/**
 * @author Raphael
 * @date 2021-02-22 16:48:36
 */
class IsBalanced {
    /**
     * Description for IsBalanced:
     * 平衡二叉树
     */
    public boolean isBalanced(TreeNode root) {
        // code
        return deepth(root) != -1;
    }

    private int deepth(TreeNode root) {
        if (root == null) {
            return 0;
        }
        int ld = deepth(root.left);
        int rd = deepth(root.right);

        if (ld == -1 || rd == -1 || Math.abs(ld - rd) > 1) {
            return -1;
        }
        return Math.max(ld + 1, rd + 1);
    }
}
