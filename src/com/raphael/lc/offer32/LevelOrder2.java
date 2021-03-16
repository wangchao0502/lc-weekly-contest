package com.raphael.lc.offer32;

import com.raphael.lc.common.TreeNode;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/**
 * @author Raphael
 * @date 2021-03-16 17:51:06
 */
class LevelOrder2 {
    /**
     * Description for LevelOrder2:
     */
    @SuppressWarnings("ConstantConditions")
    public List<List<Integer>> levelOrder2(TreeNode root) {
        // code
        if (root == null) return new ArrayList<>();

        Queue<TreeNode> queue = new LinkedList<>();
        List<List<Integer>> ans = new ArrayList<>();
        queue.offer(root);

        while (!queue.isEmpty()) {
            int count = queue.size();
            List<Integer> list = new ArrayList<>();
            while (count > 0) {
                TreeNode node = queue.poll();
                list.add(node.val);
                if (node.left != null) queue.offer(node.left);
                if (node.right != null) queue.offer(node.right);
                count--;
            }
            ans.add(list);
        }

        return ans;
    }
}
