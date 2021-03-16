package com.raphael.lc.offer32;

import com.raphael.lc.common.TreeNode;

import java.util.ArrayList;
import java.util.Deque;
import java.util.LinkedList;
import java.util.List;

/**
 * @author Raphael
 * @date 2021-03-16 17:57:07
 */
@SuppressWarnings("ConstantConditions")
class LevelOrder3 {
    /**
     * Description for LevelOrder3:
     * 从上到下打印二叉树3
     */
    public List<List<Integer>> levelOrder3(TreeNode root) {
        // code
        if (root == null) return new ArrayList<>();
        boolean flag = false;
        List<List<Integer>> ans = new ArrayList<>();
        Deque<TreeNode> deque = new LinkedList<>();
        deque.offer(root);

        while (!deque.isEmpty()) {
            int count = deque.size();
            List<Integer> list = new ArrayList<>();
            while (count > 0) {
                TreeNode node = flag ? deque.pollLast() : deque.pollFirst();
                list.add(node.val);
                if (flag) {
                    if (node.right != null) deque.offerFirst(node.right);
                    if (node.left != null) deque.offerFirst(node.left);
                } else {
                    if (node.left != null) deque.offerLast(node.left);
                    if (node.right != null) deque.offerLast(node.right);
                }
                count--;
            }
            ans.add(list);
            flag = !flag;
        }

        return ans;
    }
}
