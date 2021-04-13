package com.raphael.lc.p783;

import com.raphael.lc.common.TreeNode;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Raphael
 * @date 2021-04-13 15:41:57
 */
@SuppressWarnings("AlibabaLowerCamelCaseVariableNaming")
class MinDiffInBST {
    /**
     * Description for MinDiffInBST:
     * 二叉搜索树节点最小距离
     */

    List<Integer> list;

    private void inorder(TreeNode root) {
        if (root == null) return;
        inorder(root.left);
        list.add(root.val);
        inorder(root.right);
    }

    public int minDiffInBST(TreeNode root) {
        // code
        list = new ArrayList<>();
        inorder(root);
        int ans = Integer.MAX_VALUE;
        for (int i = 1; i < list.size(); i++) {
            ans = Math.min(ans, Math.abs(list.get(i) - list.get(i - 1)));
        }
        return ans;
    }
}
