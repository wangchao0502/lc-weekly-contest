package com.raphael.lc.p987;

import com.raphael.lc.common.TreeNode;

import java.util.ArrayList;
import java.util.List;
import java.util.PriorityQueue;

/**
 * @author Raphael
 * @date 2021-05-26 10:31:33
 */
class VerticalTraversal {
    /**
     * Description for VerticalTraversal:
     * 二叉树的垂序遍历
     */

    List<List<PriorityQueue<Integer>>> list;

    private int getDepth(TreeNode node) {
        if (node == null) return 0;
        return Math.max(getDepth(node.left), getDepth(node.right)) + 1;
    }

    private void dfs(TreeNode node, int level, int i) {
        if (node == null) return;

        list.get(i).get(level).add(node.val);
        dfs(node.left, level + 1, i - 1);
        dfs(node.right, level + 1, i + 1);
    }

    public List<List<Integer>> verticalTraversal(TreeNode root) {
        // code
        list = new ArrayList<>();
        int depth = getDepth(root);
        int width = depth * 2 - 1;

        for (int i = 0; i < width; i++) {
            list.add(new ArrayList<>());
            for (int j = 0; j < depth; j++) {
                list.get(i).add(new PriorityQueue<>());
            }
        }

        dfs(root, 0, depth - 1);

        List<List<Integer>> ans = new ArrayList<>();

        for (int i = 0; i < width; i++) {
            List<Integer> vert = new ArrayList<>();
            for (int j = 0; j < depth; j++) {
                PriorityQueue<Integer> queue = list.get(i).get(j);
                while (!queue.isEmpty()) {
                    vert.add(queue.poll());
                }
            }
            if (vert.size() != 0) {
                ans.add(vert);
            }
        }

        return ans;
    }
}
