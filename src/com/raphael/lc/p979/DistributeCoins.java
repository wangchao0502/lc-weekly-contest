package com.raphael.lc.p979;

import com.raphael.lc.common.TreeNode;

/**
 * @author Raphael
 * @date 2021-05-26 10:12:41
 */
class DistributeCoins {
    /**
     * Description for DistributeCoins:
     * 在二叉树中分配硬币
     */

    int ans;

    /*
     * 计算某节点过载量，金币数比需求数多多少，其绝对值加到结果中
     */
    private int dfs(TreeNode node) {
        if (node == null) return 0;
        int l = dfs(node.left);
        int r = dfs(node.right);
        ans += Math.abs(l) + Math.abs(r);
        return node.val + l + r - 1;
    }

    public int distributeCoins(TreeNode root) {
        // code
        ans = 0;
        dfs(root);
        return ans;
    }
}
