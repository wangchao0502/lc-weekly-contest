package com.raphael.lc.offer07;

import com.raphael.lc.common.TreeNode;

/**
 * @author Raphael
 * @date 2021-03-09 14:18:50
 */
class BuildTree {
    /**
     * Description for BuildTree:
     * 重建二叉树
     */

    private TreeNode helper(int[] preorder, int p, int[] inorder, int start, int end) {
        if (end < start) return null;

        int rootVal = preorder[p];
        int idx = 0;
        for (int i = start; i <= end; i++) {
            if (inorder[i] == rootVal) {
                idx = i;
                break;
            }
        }

        TreeNode node = new TreeNode(rootVal);
        node.left = helper(preorder, p + 1, inorder, start, idx - 1);
        node.right = helper(preorder, p + idx - start + 1, inorder, idx + 1, end);
        return node;
    }

    public TreeNode buildTree(int[] preorder, int[] inorder) {
        // code
        return helper(preorder, 0, inorder, 0, inorder.length - 1);
    }
}
