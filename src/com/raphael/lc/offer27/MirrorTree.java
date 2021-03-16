package com.raphael.lc.offer27;

import com.raphael.lc.common.TreeNode;

/**
 * @author Raphael
 * @date 2021-03-16 14:36:05
 */
class MirrorTree {
    /**
     * Description for MirrorTree:
     * 二叉树的镜像
     */
    public TreeNode mirrorTree(TreeNode root) {
        // code
        if (root == null) return null;
        TreeNode tmp = root.left;
        root.left = mirrorTree(root.right);
        root.right = mirrorTree(tmp);
        return root;
    }
}
