package com.raphael.lc.p1008;

import com.raphael.lc.common.TreeNode;

/**
 * @author Raphael
 * @date 2021-05-29 12:41:30
 */
class BstFromPreorder {
    /**
     * Description for BstFromPreorder:
     * 前序遍历构造二叉搜索树
     */

    private TreeNode build(int[] preorder, int l, int r) {
        if (l >= r) {
            return null;
        }
        int mid = l + 1;
        while (mid < r && preorder[mid] < preorder[l]) mid++;
        TreeNode node = new TreeNode(preorder[l]);
        node.left = build(preorder, l + 1, mid);
        node.right = build(preorder, mid, r);
        return node;
    }

    public TreeNode bstFromPreorder(int[] preorder) {
        // code
        return build(preorder, 0, preorder.length);
    }
}
