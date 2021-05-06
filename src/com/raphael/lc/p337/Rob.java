package com.raphael.lc.p337;

import com.raphael.lc.common.TreeNode;

import java.util.HashMap;
import java.util.Map;

/**
 * @author Raphael
 * @date 2021-05-06 13:47:14
 */
class Rob {
    /**
     * Description for Rob:
     * 打家劫舍3
     */

    Map<TreeNode, Integer> robCache;
    Map<TreeNode, Integer> skipCache;

    public int rob(TreeNode root) {
        // code
        robCache = new HashMap<>(16);
        skipCache = new HashMap<>(16);
        dfs(root);
        return Math.max(robCache.getOrDefault(root, 0), skipCache.getOrDefault(root, 0));
    }

    private void dfs(TreeNode root) {
        if (root == null) {
            return;
        }

        dfs(root.left);
        dfs(root.right);
        robCache.put(root, root.val + skipCache.getOrDefault(root.left, 0) + skipCache.getOrDefault(root.right, 0));
        skipCache.put(root, Math.max(robCache.getOrDefault(root.left, 0), skipCache.getOrDefault(root.left, 0)) + Math.max(robCache.getOrDefault(root.right, 0), skipCache.getOrDefault(root.right, 0)));
    }
}
