package com.raphael.lc.p112;

import com.raphael.lc.common.TreeNode;

/**
 * @author Raphael
 * @date 2021-02-23 15:51:58
 */
class HasPathSum {
    /**
     * Description for HasPathSum:
     * 路经总和
     */
    public boolean hasPathSum(TreeNode root, int targetSum) {
        if (root == null) return false;
        if (root.left == null && root.right == null) return targetSum - root.val == 0;
        return hasPathSum(root.left, targetSum - root.val) || hasPathSum(root.right, targetSum - root.val);
    }
}
