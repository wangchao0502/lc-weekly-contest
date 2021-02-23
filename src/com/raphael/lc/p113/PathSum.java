package com.raphael.lc.p113;

import com.raphael.lc.common.TreeNode;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Raphael
 * @date 2021-02-23 16:37:32
 */
class PathSum {
    /**
     * Description for PathSum:
     * 路径总和2
     */
    List<List<Integer>> ans;

    private void dfs(TreeNode root, int targetSum, List<Integer> list) {
        // isLeaf
        if (root == null) return;

        list.add(root.val);

        if (root.left == null && root.right == null) {
            if (targetSum == root.val) {
                ans.add(new ArrayList<>(list));
            }
        }

        dfs(root.left, targetSum - root.val, list);
        dfs(root.right, targetSum - root.val, list);
        list.remove(list.size() - 1);
    }

    public List<List<Integer>> pathSum(TreeNode root, int targetSum) {
        // code
        ans = new ArrayList<>();
        List<Integer> list = new ArrayList<>();
        dfs(root, targetSum, list);
        return ans;
    }
}
