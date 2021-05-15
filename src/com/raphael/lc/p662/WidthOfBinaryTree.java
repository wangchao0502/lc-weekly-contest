package com.raphael.lc.p662;

import com.raphael.lc.common.TreeNode;

import java.util.HashMap;
import java.util.Map;

/**
 * @author Raphael
 * @date 2021-05-15 13:11:21
 */
class WidthOfBinaryTree {
    /**
     * Description for WidthOfBinaryTree:
     * 二叉树最大宽度
     */
    int ans;
    Map<Integer, Integer> left;

    public int widthOfBinaryTree(TreeNode root) {
        ans = 0;
        left = new HashMap<>(16);
        dfs(root, 0, 0);
        return ans;
    }

    public void dfs(TreeNode root, int depth, int pos) {
        if (root == null) return;
        left.computeIfAbsent(depth, x -> pos);
        ans = Math.max(ans, pos - left.get(depth) + 1);
        dfs(root.left, depth + 1, 2 * pos);
        dfs(root.right, depth + 1, 2 * pos + 1);
    }
}
