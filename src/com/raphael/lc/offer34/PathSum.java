package com.raphael.lc.offer34;

import com.raphael.lc.common.TreeNode;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Raphael
 * @date 2021-03-22 15:55:44
 */
class PathSum {
    /**
     * Description for PathSum:
     * 二叉树中和为某一值的路径
     */

    List<List<Integer>> ans;

    private void dfs(TreeNode node, List<Integer> list, int sum, int target) {
        if (node == null) return;

        sum += node.val;

        // 题目要求叶子节点
        if (sum == target && node.left == null && node.right == null) {
            List<Integer> res = new ArrayList<>(list);
            res.add(node.val);
            ans.add(res);
            return;
        }

        list.add(node.val);
        dfs(node.left, list, sum, target);
        dfs(node.right, list, sum, target);
        list.remove(list.size() - 1);
    }

    public List<List<Integer>> pathSum(TreeNode root, int target) {
        // code
        ans = new ArrayList<>();
        List<Integer> list = new ArrayList<>();
        dfs(root, list, 0, target);
        return ans;
    }
}
