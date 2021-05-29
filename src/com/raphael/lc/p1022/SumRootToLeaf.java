package com.raphael.lc.p1022;

import com.raphael.lc.common.TreeNode;

/**
 * @author Raphael
 * @date 2021-05-29 14:10:47
 */
class SumRootToLeaf {
    /**
     * Description for SumRootToLeaf:
     * 从根到叶的二进制数之和
     */

    int ans = 0;

    private void dfs(TreeNode node, int before) {
        int cur = (before << 1) + node.val;
        if (node.left == null && node.right == null) {
            ans += cur;
            return;
        }

        if (node.left != null) dfs(node.left, cur);
        if (node.right != null) dfs(node.right, cur);
    }

    public int sumRootToLeaf(TreeNode root) {
        // code
        dfs(root, 0);
        return ans;
    }
}
