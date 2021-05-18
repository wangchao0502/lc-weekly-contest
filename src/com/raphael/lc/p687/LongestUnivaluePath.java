package com.raphael.lc.p687;

import com.raphael.lc.common.TreeNode;

/**
 * @author Raphael
 * @date 2021-05-18 12:13:35
 */
class LongestUnivaluePath {
    /**
     * Description for LongestUnivaluePath:
     * 最长同值路径
     */

    int ans;

    private int dfs(TreeNode node) {
        if (node == null) {
            return 0;
        }

        int left = dfs(node.left);
        int right = dfs(node.right);
        int arrowLeft = 0, arrowRight = 0;

        if (node.left != null && node.left.val == node.val) {
            arrowLeft = left + 1;
        }
        if (node.right != null && node.right.val == node.val) {
            arrowRight = right + 1;
        }
        ans = Math.max(ans, arrowLeft + arrowRight);
        return Math.max(arrowLeft, arrowRight);
    }

    public int longestUnivaluePath(TreeNode root) {
        // code
        ans = 0;
        dfs(root);
        return ans;
    }
}
