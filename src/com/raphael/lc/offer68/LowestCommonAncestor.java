package com.raphael.lc.offer68;

import com.raphael.lc.common.TreeNode;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Raphael
 * @date 2021-03-22 15:14:56
 */
class LowestCommonAncestor {
    /**
     * Description for LowestCommonAncestor:
     * 二叉搜索树的最近公共祖先
     */

    private boolean dfs(TreeNode node, int target, List<Integer> path) {
        if (node == null) return false;

        path.add(node.val);
        if (node.val == target) return true;

        if (dfs(node.left, target, path)) {
            return true;
        } else if (dfs(node.right, target, path)) {
            return true;
        }
        path.remove(path.size() - 1);
        return false;
    }

    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        // code
        if (root == null) return null;

        List<Integer> path1 = new ArrayList<>();
        List<Integer> path2 = new ArrayList<>();
        dfs(root, p.val, path1);
        dfs(root, q.val, path2);

        int ptr = 0;

        while (ptr < path1.size() && ptr < path2.size() && path1.get(ptr).equals(path2.get(ptr))) {
            ptr++;
        }

        return new TreeNode(path1.get(ptr - 1));
    }
}
