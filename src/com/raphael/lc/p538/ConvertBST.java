package com.raphael.lc.p538;

import com.raphael.lc.common.TreeNode;

/**
 * @author raphael
 * @date 2021-02-08 15:23:09
 */
@SuppressWarnings({"AlibabaLowerCamelCaseVariableNaming", "AlibabaClassNamingShouldBeCamel"})
class ConvertBST {
    /**
     * Description for ConvertBST:
     * 把二叉搜索树转换为累加树，中续遍历
     */
    private int sum = 0;

    private void inorder(TreeNode root) {
        if (root == null) {
            return;
        }
        inorder(root.right);
        sum += root.val;
        root.val = sum;
        inorder(root.left);
    }

    public TreeNode convertBST(TreeNode root) {
        // code
        inorder(root);
        return root;
    }
}
