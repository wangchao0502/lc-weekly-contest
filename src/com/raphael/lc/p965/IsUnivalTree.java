package com.raphael.lc.p965;

import com.raphael.lc.common.TreeNode;

import java.util.LinkedList;
import java.util.Queue;

/**
 * @author Raphael
 * @date 2021-05-22 11:14:34
 */
class IsUnivalTree {
    /**
     * Description for IsUnivalTree:
     * 单值二叉树
     */
    public boolean isUnivalTree(TreeNode root) {
        // code
        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);
        int value = root.val;

        while (!queue.isEmpty()) {
            TreeNode node = queue.poll();
            if (node != null && node.val != value) {
                return false;
            }
            if (node != null) {
                queue.offer(node.left);
                queue.offer(node.right);
            }
        }

        return true;
    }
}
