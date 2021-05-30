package com.raphael.lc.p1026;

import com.raphael.lc.common.TreeNode;

/**
 * @author Raphael
 * @date 2021-05-30 10:13:29
 */
class MaxAncestorDiff {
    /**
     * Description for MaxAncestorDiff:
     * 节点与其祖先之间的最大差值
     */

    int ans = 0;

    private void dfs(TreeNode node, int max, int min) {
        if (node == null) {
            return;
        }
        int val = node.val;
        ans = Math.max(ans, Math.max(Math.abs(val - min), Math.abs(val - max)));
        max = Math.max(max, val);
        min = Math.min(min, val);
        dfs(node.left, max, min);
        dfs(node.right, max, min);
    }

    public int maxAncestorDiff(TreeNode root) {
        // code
        dfs(root, root.val, root.val);
        return ans;
    }
}
