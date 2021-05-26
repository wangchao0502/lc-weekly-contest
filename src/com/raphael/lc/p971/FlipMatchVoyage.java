package com.raphael.lc.p971;

import com.raphael.lc.common.TreeNode;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Stack;

/**
 * @author Raphael
 * @date 2021-05-26 09:37:39
 */
class FlipMatchVoyage {
    /**
     * Description for FlipMatchVoyage:
     * 翻转二叉树以匹配先序遍历
     */
    public List<Integer> flipMatchVoyage(TreeNode root, int[] voyage) {
        // code
        List<Integer> ans = new ArrayList<>();
        // 迭代模拟递归
        Stack<TreeNode> stack = new Stack<>();
        TreeNode parent = root;
        int index = 0;

        while (parent != null || !stack.isEmpty()) {
            while (parent != null) {
                if (voyage[index] != parent.val) {
                    return Collections.singletonList(-1);
                }
                stack.push(parent);
                index++;
                if (parent.left != null && parent.left.val != voyage[index]) {
                    TreeNode tmp = parent.left;
                    parent.left = parent.right;
                    parent.right = tmp;
                    ans.add(parent.val);
                }
                parent = parent.left;
            }
            if (!stack.isEmpty()) {
                parent = stack.pop();
                parent = parent.right;
            }
        }

        return ans;
    }
}
