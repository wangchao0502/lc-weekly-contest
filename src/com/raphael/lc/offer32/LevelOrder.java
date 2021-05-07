package com.raphael.lc.offer32;

import com.raphael.lc.common.TreeNode;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/**
 * @author Raphael
 * @date 2021-03-16 17:41:22
 */
class LevelOrder {
    /**
     * Description for LevelOrder:
     * 从上到下打印二叉树
     */
    public int[] levelOrder(TreeNode root) {
        // code
        if (root == null) return new int[]{};
        Queue<TreeNode> deque = new LinkedList<>();
        List<Integer> list = new ArrayList<>();
        deque.offer(root);

        while (!deque.isEmpty()) {
            TreeNode node = deque.poll();
            list.add(node.val);
            if (node.left != null) deque.offer(node.left);
            if (node.right != null) deque.offer(node.right);
        }

        int[] ans = new int[list.size()];
        for (int i = 0; i < list.size(); i++) {
            ans[i] = list.get(i);
        }
        return ans;
    }
}
