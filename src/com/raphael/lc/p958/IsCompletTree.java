package com.raphael.lc.p958;

import com.raphael.lc.common.TreeNode;

import java.util.LinkedList;
import java.util.Queue;

/**
 * @author Raphael
 * @date 2021-05-22 10:49:46
 */
class IsCompletTree {
    /**
     * Description for IsCompletTree:
     * 二叉树的完全性检验
     */
    public boolean isCompletTree(TreeNode root) {
        // code
        Queue<TreeNode> q = new LinkedList<>();
        q.offer(root);
        boolean reachedEnd = false;
        while (!q.isEmpty()) {
            TreeNode cur = q.poll();
            if (reachedEnd && cur != null) {
                return false;
            }
            if (cur == null) {
                reachedEnd = true;
                continue;
            }
            q.offer(cur.left);
            q.offer(cur.right);
        }
        return true;
    }
}
