package com.raphael.lc.p257;

import com.raphael.lc.common.TreeNode;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Raphael
 * @date 2021-02-24 18:58:38
 */
class BinaryTreePaths {
    /**
     * Description for BinaryTreePaths:
     * 二叉树的所有路径
     */
    List<String> ans;

    private void dfs(TreeNode root, List<String> list) {
        if (root == null) return;

        list.add(String.valueOf(root.val));

        if (root.left == null && root.right == null) {
            ans.add(String.join("->", list));
        }

        dfs(root.left, list);
        dfs(root.right, list);
        list.remove(list.size() - 1);
    }

    public List<String> binaryTreePaths(TreeNode root) {
        // code
        ans = new ArrayList<>();
        List<String> list = new ArrayList<>();
        dfs(root, list);
        return ans;
    }
}
