package com.raphael.lc.p437;

import com.raphael.lc.common.TreeNode;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Raphael
 * @date 2021-05-07 11:10:28
 */
class PathSum {
    /**
     * Description for PathSum:
     * 路径总和3
     */

    int count = 0;

    private List<Integer> dfs(TreeNode node, int targetSum) {
        List<Integer> ans = new ArrayList<>();
        if (node == null) {
            return ans;
        }
        if (node.left == null && node.right == null) {
            ans.add(node.val);
            return ans;
        }

        List<Integer> left = dfs(node.left, targetSum);
        List<Integer> right = dfs(node.right, targetSum);

        for (int n : left) {
            if (n == targetSum) {
                count++;
            }
            ans.add(n + node.val);
        }
        for (int n : right) {
            if (n == targetSum) {
                count++;
            }
            ans.add(n + node.val);
        }
        ans.add(node.val);
        return ans;
    }

    public int pathSum(TreeNode root, int targetSum) {
        // code
        List<Integer> list = dfs(root, targetSum);
        for (int n : list) {
            if (n == targetSum) {
                count++;
            }
        }
        return count;
    }
}
