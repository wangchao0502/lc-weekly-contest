package com.raphael.lc.p404;

import com.raphael.lc.common.TreeNode;

/**
 * @author Raphael
 * @date 2021-05-07 10:51:42
 */
class SumOfLeftLeaves {
    /**
     * Description for SumOfLeftLeaves:
     * 左叶子之和
     */

    private int dfs(TreeNode root, boolean isLeft) {
        if (root == null) {
            return 0;
        }
        if (root.left == null && root.right == null) {
            return isLeft ? root.val : 0;
        }

        return dfs(root.left, true) + dfs(root.right, false);
    }

    public int sumOfLeftLeaves(TreeNode root) {
        // code
        return dfs(root, false);
    }
}
