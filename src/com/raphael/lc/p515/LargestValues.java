package com.raphael.lc.p515;

import com.raphael.lc.common.TreeNode;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/**
 * @author Raphael
 * @date 2021-05-11 10:07:46
 */
class LargestValues {
    /**
     * Description for LargestValues:
     * 在每个树行中找最大值
     */
    public List<Integer> largestValues(TreeNode root) {
        // code
        List<Integer> ans = new ArrayList<>();

        if (root == null) return ans;

        Queue<TreeNode> queue = new LinkedList<>();

        queue.add(root);

        while (!queue.isEmpty()) {
            int count = queue.size();
            int max = Integer.MIN_VALUE;
            while (count > 0) {
                TreeNode node = queue.poll();
                assert node != null;

                if (node.val > max) {
                    max = node.val;
                }
                if (node.left != null) {
                    queue.offer(node.left);
                }
                if (node.right != null) {
                    queue.offer(node.right);
                }

                count--;
            }
            ans.add(max);
        }

        return ans;
    }
}
