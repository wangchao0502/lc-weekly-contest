package com.raphael.lc.offer54;

import com.raphael.lc.common.TreeNode;

/**
 * @author Raphael
 * @date 2021-03-22 11:12:48
 */
class KthLargest {
    /**
     * Description for KthLargest:
     * 二叉搜索树的第k大节点
     */

    int count;
    int ans;

    private void helper(TreeNode node, int k) {
        if (node == null) return;

        helper(node.right, k);

        if (++count == k) {
            ans = node.val;
            return;
        }

        helper(node.left, k);
    }

    public int kthLargest(TreeNode root, int k) {
        // code
        count = 0;
        helper(root, k);
        return ans;
    }
}
