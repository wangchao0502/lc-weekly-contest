package com.raphael.lc.p145;

import com.raphael.lc.common.TreeNode;

import java.util.ArrayList;
import java.util.List;

/**
 * @author raphael
 * @date 2021-02-01 14:14:44
 */
class PostorderTraversal {
    /**
     * Description for PostorderTraversal:
     * 二叉树的后续遍历
     */
    private void postorder(TreeNode root, List<Integer> ans) {
        if (root == null) {
            return;
        }
        postorder(root.left, ans);
        postorder(root.right, ans);
        ans.add(root.val);
    }

    public List<Integer> postorderTraversal(TreeNode root) {
        // code
        List<Integer> ans = new ArrayList<>();
        postorder(root, ans);
        return ans;
    }
}
