package com.raphael.lc.p998;

import com.raphael.lc.common.TreeNode;

/**
 * @author Raphael
 * @date 2021-05-28 14:05:37
 */
class InsertIntoMaxTree {
    /**
     * Description for InsertIntoMaxTree:
     * 最大二叉树2
     */
    public TreeNode insertIntoMaxTree(TreeNode root, int val) {
        // code
        if (root == null || root.val < val) {
            TreeNode tmp = new TreeNode(val);
            tmp.left = root;
            return tmp;
        }
        root.right = insertIntoMaxTree(root.right, val);
        return root;
    }
}
