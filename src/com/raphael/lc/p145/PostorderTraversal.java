package com.raphael.lc.p145;

import com.raphael.lc.common.TreeNode;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

/**
 * @author raphael
 * @date 2021-02-01 14:14:44
 */
class PostorderTraversal {
    /// 递归写法
    //private void postorder(TreeNode root, List<Integer> ans) {
    //    if (root == null) {
    //        return;
    //    }
    //    postorder(root.left, ans);
    //    postorder(root.right, ans);
    //    ans.add(root.val);
    //}
    //
    //public List<Integer> postorderTraversal(TreeNode root) {
    //    // code 递归法
    //    List<Integer> ans = new ArrayList<>();
    //    postorder(root, ans);
    //    return ans;
    //}

    public List<Integer> postorderTraversal(TreeNode root) {
        // 迭代法
        List<Integer> ans = new ArrayList<>();
        Stack<TreeNode> stack = new Stack<>();
        if (root != null) {
            stack.push(root);
        }

        while (!stack.isEmpty()) {
            TreeNode node = stack.pop();
            if (node != null) {
                // 对于前中后序遍历，只要改变以下顺序即可，类似于递归思路
                // 中
                stack.push(node);
                stack.push(null);
                // 右
                if (node.right != null) stack.push(node.right);
                // 左
                if (node.left != null) stack.push(node.left);
            } else {
                ans.add(stack.pop().val);
            }
        }

        return ans;
    }
}
