package com.raphael.lc.p114;

import com.raphael.lc.common.TreeNode;

/**
 * @author Raphael
 * @date 2021-02-24 16:45:13
 */
class Flatten {
    /**
     * Description for Flatten:
     * 二叉树展开为链表
     */
    TreeNode pre;

    public void flatten(TreeNode root) {
        // code
        if (root == null)
            return;
        flatten(root.right);
        flatten(root.left);
        root.right = pre;
        root.left = null;
        pre = root;
    }
}
