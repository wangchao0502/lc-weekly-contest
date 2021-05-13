package com.raphael.lc.p623;

import com.raphael.lc.common.TreeNode;

import java.util.LinkedList;
import java.util.Queue;

/**
 * @author Raphael
 * @date 2021-05-13 13:02:04
 */
class AddOneRow {
    /**
     * Description for AddOneRow:
     * 在二叉树中增加一行
     */
    public TreeNode addOneRow(TreeNode root, int val, int depth) {
        // code
        if (depth == 1) {
            TreeNode newRoot = new TreeNode(val);
            newRoot.left = root;
            return newRoot;
        }

        int curDepth = 1;
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);

        while (curDepth < depth - 1) {
            int count = queue.size();
            while (count > 0) {
                TreeNode node = queue.poll();
                assert node != null;
                if (node.left != null) {
                    queue.add(node.left);
                }
                if (node.right != null) {
                    queue.add(node.right);
                }
                count--;
            }
            curDepth++;
        }

        while (!queue.isEmpty()) {
            TreeNode node = queue.poll();
            TreeNode leftTmp = node.left;
            TreeNode rightTmp = node.right;

            node.left = new TreeNode(val);
            node.right = new TreeNode(val);

            node.left.left = leftTmp;
            node.right.right = rightTmp;
        }

        return root;
    }
}
