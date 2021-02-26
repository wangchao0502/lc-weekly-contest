package com.raphael.lc.p117;

import com.raphael.lc.common.Node;

import java.util.Deque;
import java.util.LinkedList;

/**
 * @author Raphael
 * @date 2021-02-26 15:04:33
 */
class Connect {
    /**
     * Description for Connect:
     *
     */
    public Node connect(Node root) {
        // code
        if (root == null) return null;
        Deque<Node> queue = new LinkedList<>();
        queue.add(root);

        while (!queue.isEmpty()) {
            int count = queue.size();
            Node pre = null;
            while (count > 0) {
                Node node = queue.pollFirst();
                if (pre == null) {
                    pre = node;
                } else {
                    pre.next = node;
                    pre = pre.next;
                }
                if (node.left != null) {
                    queue.offerLast(node.left);
                }
                if (node.right != null) {
                    queue.offerLast(node.right);
                }
                count--;
            }
        }

        return root;
    }
}
