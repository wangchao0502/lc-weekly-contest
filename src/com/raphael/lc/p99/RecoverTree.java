package com.raphael.lc.p99;

import com.raphael.lc.common.TreeNode;

/**
 * @author Raphael
 * @date 2021-05-04 12:57:33
 */
class RecoverTree {
    /**
     * Description for RecoverTree:
     * 恢复二叉搜索树
     */
    public void recoverTree(TreeNode root) {
        // code
        TreeNode x = null, y = null, pred = null, predecessor = null;

        while (root != null) {
            if (root.left != null) {
                predecessor = root.left;
                while (predecessor.right != null && predecessor.right != root) {
                    predecessor = predecessor.right;
                }

                if (predecessor.right == null) {
                    predecessor.right = root;
                    root = root.left;
                } else {
                    if (pred != null && root.val < pred.val) {
                        y = root;
                        if (x == null) {
                            x = pred;
                        }
                    }
                    pred = root;
                    predecessor.right = null;
                    root = root.right;
                }
            } else {
                if (pred != null && root.val < pred.val) {
                    y = root;
                    if (x == null) {
                        x = pred;
                    }
                }
                pred = root;
                root = root.right;
            }
        }
        swap(x, y);
    }

    private void swap(TreeNode x, TreeNode y) {
        int tmp = x.val;
        x.val = y.val;
        y.val = tmp;
    }
}
