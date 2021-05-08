package com.raphael.lc.p449;

import com.raphael.lc.common.TreeNode;

import java.util.Deque;
import java.util.LinkedList;
import java.util.Queue;

/**
 * @author Raphael
 * @date 2021-05-08 10:24:40
 */
class Codec {
    /**
     * Description for Codec:
     * 序列化和反序列化二叉树
     */
    public String serialize(TreeNode root) {
        Queue<TreeNode> queue = new LinkedList<>();
        if (root != null) queue.offer(root);
        Deque<Integer> deque = new LinkedList<>();
        StringBuilder sb = new StringBuilder();
        sb.append("[");

        while (!queue.isEmpty()) {
            TreeNode node = queue.poll();
            if (node == null) {
                deque.offerLast(null);
            } else {
                deque.offerLast(node.val);
                queue.offer(node.left);
                queue.offer(node.right);
            }
        }

        while (!deque.isEmpty() && deque.peekLast() == null) {
            deque.pollLast();
        }

        while (!deque.isEmpty()) {
            if (sb.length() != 1) sb.append(",");
            sb.append(deque.pollFirst());
        }

        sb.append("]");
        return sb.toString();
    }

    @SuppressWarnings("ConstantConditions")
    public TreeNode deserialize(String data) {
        if (data.length() == 2) return null;

        Queue<TreeNode> queue = new LinkedList<>();
        String[] str = data.substring(1, data.length() - 1).split(",");
        TreeNode root = new TreeNode(Integer.parseInt(str[0]));
        queue.offer(root);

        for (int i = 1; i < str.length; i += 2) {
            TreeNode node = queue.poll();
            if (!"null".equals(str[i])) {
                node.left = new TreeNode(Integer.parseInt(str[i]));
                queue.offer(node.left);
            }
            if (i + 1 < str.length && !"null".equals(str[i + 1])) {
                node.right = new TreeNode(Integer.parseInt(str[i + 1]));
                queue.offer(node.right);
            }
        }

        return root;
    }
}
