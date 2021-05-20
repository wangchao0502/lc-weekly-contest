package com.raphael.lc.p889;

import com.raphael.lc.common.TreeNode;

/**
 * @author Raphael
 * @date 2021-05-20 11:48:07
 */
class ConstructFromPrePost {
    /**
     * Description for ConstructFromPrePost:
     * 根据前序和后序遍历构造二叉树
     */

    int[] pre, post;

    public TreeNode constructFromPrePost(int[] pre, int[] post) {
        this.pre = pre;
        this.post = post;
        return make(0, 0, pre.length);
    }

    public TreeNode make(int i0, int i1, int n) {
        if (n == 0) return null;
        TreeNode root = new TreeNode(pre[i0]);
        if (n == 1) return root;

        int left = 1;
        for (; left < n; ++left)
            if (post[i1 + left - 1] == pre[i0 + 1])
                break;

        root.left = make(i0 + 1, i1, left);
        root.right = make(i0 + left + 1, i1 + left, n - 1 - left);
        
        return root;
    }
}
