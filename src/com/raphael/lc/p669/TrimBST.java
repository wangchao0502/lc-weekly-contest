package com.raphael.lc.p669;

import com.raphael.lc.common.TreeNode;

/**
 * @author Raphael
 * @date 2021-05-15 16:29:53
 */
@SuppressWarnings("AlibabaLowerCamelCaseVariableNaming")
class TrimBST {
    /**
     * Description for TrimBST:
     * 修剪二叉搜索树
     */
    public TreeNode trimBST(TreeNode root, int low, int high) {
        // code
        TreeNode dummy = new TreeNode();
        dummy.left = root;
        dummy.left = dfs(dummy.left, low, high);
        return dummy.left;
    }

    private TreeNode dfs(TreeNode node, int low, int high) {
        if (node == null) {
            return null;
        }
        if (node.val < low) {
            return dfs(node.right, low, high);
        }
        if (node.val > high) {
            return dfs(node.left, low, high);
        }

        node.left = dfs(node.left, low, high);
        node.right = dfs(node.right, low, high);
        return node;
    }
}
