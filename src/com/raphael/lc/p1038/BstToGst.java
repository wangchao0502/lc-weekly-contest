package com.raphael.lc.p1038;

import com.raphael.lc.common.TreeNode;

/**
 * @author raphael
 * @date 2021-02-08 16:29:58
 */
class BstToGst {
    /**
     * Description for BstToGst:
     *
     */
    private int sum = 0;
    public TreeNode bstToGst(TreeNode root) {
        // code
        if (root != null) {
            bstToGst(root.right);
            sum += root.val;
            root.val = sum;
            bstToGst(root.left);
        }
        return root;
    }
}
