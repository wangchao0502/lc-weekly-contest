package com.raphael.lc.p107;

import com.raphael.lc.common.TreeNode;

import java.util.*;

/**
 * @author Raphael
 * @date 2021-02-22 16:38:09
 */
class LevelOrderBottom {
    /**
     * Description for LevelOrderBottom:
     * 二叉树的层序遍历
     */
    private void bfs(List<List<Integer>> ans, Deque<TreeNode> nodes) {
        int count = nodes.size();
        if (count == 0) {
            return;
        }
        List<Integer> list = new ArrayList<>();
        while (count > 0) {
            TreeNode root = nodes.pollFirst();
            if (root != null) {
                list.add(root.val);
                nodes.offerLast(root.left);
                nodes.offerLast(root.right);
            }
            count--;
        }
        bfs(ans, nodes);
        if (!list.isEmpty()) {
            ans.add(list);
        }
    }

    public List<List<Integer>> levelOrderBottom(TreeNode root) {
        // code
        List<List<Integer>> ans = new ArrayList<>();
        Deque<TreeNode> nodes = new LinkedList<>();
        nodes.offerFirst(root);
        bfs(ans, nodes);
        return ans;
    }
}
