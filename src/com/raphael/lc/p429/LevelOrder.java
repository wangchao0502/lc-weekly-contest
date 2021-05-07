package com.raphael.lc.p429;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/**
 * @author Raphael
 * @date 2021-05-07 10:59:40
 */

class Node {
    int val;
    List<Node> children;
}

@SuppressWarnings("unused")
class LevelOrder {
    /**
     * Description for LevelOrder:
     * N叉树的层序遍历
     */
    public List<List<Integer>> levelOrder(Node root) {
        // code
        List<List<Integer>> ans = new ArrayList<>();

        if (root == null) {
            return ans;
        }

        Queue<Node> queue = new LinkedList<>();
        queue.offer(root);

        while (!queue.isEmpty()) {
            int count = queue.size();
            List<Integer> level = new ArrayList<>();
            while (count > 0) {
                Node node = queue.poll();
                assert node != null;
                level.add(node.val);
                if (node.children != null) {
                    for (Node child : node.children) {
                        queue.offer(child);
                    }
                }
                count--;
            }
            ans.add(level);
        }

        return ans;
    }
}
