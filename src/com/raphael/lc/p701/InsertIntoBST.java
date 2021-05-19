package com.raphael.lc.p701;

import com.raphael.lc.common.TreeNode;

/**
 * @author Raphael
 * @date 2021-05-19 10:34:11
 */
@SuppressWarnings("AlibabaLowerCamelCaseVariableNaming")
class InsertIntoBST {
    /**
     * Description for InsertIntoBST:
     * 二叉搜索树中的插入操作
     */
    public TreeNode insertIntoBST(TreeNode root, int val) {
        // code
        if (root == null) {
            return new TreeNode(val);
        }

        TreeNode pos = root;

        while (true) {
            if (val < pos.val) {
                if (pos.left == null) {
                    pos.left = new TreeNode(val);
                    return root;
                }
                pos = pos.left;
            } else {
                if (pos.right == null) {
                    pos.right = new TreeNode(val);
                    return root;
                }
                pos = pos.right;
            }
        }
    }
}
