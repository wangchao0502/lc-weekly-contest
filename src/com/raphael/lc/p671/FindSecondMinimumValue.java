package com.raphael.lc.p671;

import com.raphael.lc.common.TreeNode;

import java.util.LinkedList;
import java.util.Queue;

/**
 * @author Raphael
 * @date 2021-05-15 16:39:45
 */
class FindSecondMinimumValue {
    /**
     * Description for FindSecondMinimumValue:
     * 二叉树中第二小的节点
     */
    public int findSecondMinimumValue(TreeNode root) {
        // code
        if (root == null) return -1;

        int minValue = root.val;
        int maxValue = Integer.MAX_VALUE;
        boolean isFind = false;
        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);

        while (!queue.isEmpty()) {
            int count = queue.size();
            while (count-- > 0) {
                TreeNode node = queue.poll();
                if (node == null) continue;
                if (node.val > minValue && node.val <= maxValue) {
                    maxValue = node.val;
                    isFind = true;
                } else if (node.val == minValue) {
                    queue.offer(node.left);
                    queue.offer(node.right);
                }
            }
        }

        return isFind ? maxValue : -1;
    }
}
