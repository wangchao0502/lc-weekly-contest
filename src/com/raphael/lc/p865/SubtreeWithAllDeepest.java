package com.raphael.lc.p865;

import com.raphael.lc.common.TreeNode;

/**
 * @author Raphael
 * @date 2021-05-20 11:32:50
 */

class Result {
    TreeNode node;
    int dist;

    Result(TreeNode n, int d) {
        node = n;
        dist = d;
    }
}

@SuppressWarnings("unused")
class SubtreeWithAllDeepest {
    /**
     * Description for SubtreeWithAllDeepest:
     * 具有所有最深节点的最小子树
     */
    public TreeNode subtreeWithAllDeepest(TreeNode root) {
        return dfs(root).node;
    }

    public Result dfs(TreeNode node) {
        if (node == null) return new Result(null, 0);
        Result left = dfs(node.left), right = dfs(node.right);
        if (left.dist > right.dist) return new Result(left.node, left.dist + 1);
        if (left.dist < right.dist) return new Result(right.node, right.dist + 1);
        return new Result(node, left.dist + 1);
    }
}
