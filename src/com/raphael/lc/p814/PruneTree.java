package com.raphael.lc.p814;

import com.raphael.lc.common.TreeNode;

/**
 * @author Raphael
 * @date 2021-05-19 10:48:01
 */
class PruneTree {
    /**
     * Description for PruneTree:
     * 二叉树剪枝
     */

    private boolean dfs(TreeNode node) {
        if (node == null) {
            return true;
        }
        if (!dfs(node.left)) {
            node.left = null;
        }
        if (!dfs(node.right)) {
            node.right = null;
        }
        return !(node.val == 0 && node.left == null && node.right == null);
    }

    public TreeNode pruneTree(TreeNode root) {
        // code
        return dfs(root) ? root : null;
    }
}
