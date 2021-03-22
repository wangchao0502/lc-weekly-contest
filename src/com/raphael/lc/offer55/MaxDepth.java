package com.raphael.lc.offer55;

import com.raphael.lc.common.TreeNode;

/**
 * @author Raphael
 * @date 2021-03-22 11:26:52
 */
class MaxDepth {
    /**
     * Description for MaxDepth:
     * 二叉树的深度
     */

    int ans;

    private void helper(TreeNode node, int curDepth) {
        if (node == null) return;
        curDepth++;
        ans = Math.max(ans, curDepth);
        helper(node.left, curDepth);
        helper(node.right, curDepth);
    }

    public int maxDepth(TreeNode root) {
        // code
        ans = 0;
        helper(root, 0);
        return ans;
        // return root == null ? 0 : 1 + Math.max(maxDepth(root.left), maxDepth(root.right));
    }
}
