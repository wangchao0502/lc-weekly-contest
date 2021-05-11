package com.raphael.lc.p563;

import com.raphael.lc.common.TreeNode;

/**
 * @author Raphael
 * @date 2021-05-11 10:14:19
 */
class FindTilt {
    /**
     * Description for FindTilt:
     * 二叉树的坡度
     */

    int ans = 0;

    private int dfs(TreeNode root) {
        if (root == null) {
            return 0;
        }

        int leftSum = dfs(root.left);
        int rightSum = dfs(root.right);

        ans += Math.abs(leftSum - rightSum);

        return leftSum + rightSum + root.val;
    }

    public int findTilt(TreeNode root) {
        // code
        dfs(root);
        return ans;
    }
}
