package com.raphael.lc.p951;

import com.raphael.lc.common.TreeNode;

/**
 * @author Raphael
 * @date 2021-05-21 14:15:43
 */
class FlipEquiv {
    /**
     * Description for FlipEquiv:
     * 翻转等价二叉树
     */
    public boolean flipEquiv(TreeNode root1, TreeNode root2) {
        // code
        if (root1 == null && root2 == null) {
            return true;
        }
        if (root1 == null || root2 == null || root1.val != root2.val) {
            return false;
        }

        return (flipEquiv(root1.left, root2.right) && flipEquiv(root1.right, root2.left)) ||
                (flipEquiv(root1.left, root2.left) && flipEquiv(root1.right, root2.right));
    }
}
