package com.raphael.lc.p111;

import com.raphael.lc.common.TreeNode;

/**
 * @author Raphael
 * @date 2021-02-23 15:35:32
 */
class MinDepth {
    /**
     * Description for MinDepth:
     * 二叉树的最小深度
     */
    private int minDepth(TreeNode root, int depth) {
        int lDepth = root.left == null ? -1 : minDepth(root.left, depth + 1);
        int rDepth = root.right == null ? -1 : minDepth(root.right, depth + 1);
        if (lDepth == -1 && rDepth == -1) return depth;
        if (lDepth == -1) return rDepth;
        if (rDepth == -1) return lDepth;
        return Math.min(lDepth, rDepth);
    }

    public int minDepth(TreeNode root) {
        // code
        if (root == null) return 0;
        return minDepth(root, 1);
    }
}
