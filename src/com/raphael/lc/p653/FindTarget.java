package com.raphael.lc.p653;

import com.raphael.lc.common.TreeNode;

import java.util.HashSet;
import java.util.Set;

/**
 * @author Raphael
 * @date 2021-05-14 06:44:48
 */
class FindTarget {
    /**
     * Description for FindTarget:
     * 两数之和IV - 输入BST
     */

    boolean ans;
    Set<Integer> set;

    private void inorder(TreeNode node, int k) {
        if (node == null) {
            return;
        }

        inorder(node.left, k);
        if (set.contains(k - node.val)) {
            ans = true;
            return;
        } else {
            set.add(node.val);
        }
        inorder(node.right, k);
    }

    public boolean findTarget(TreeNode root, int k) {
        // code
        set = new HashSet<>();
        inorder(root, k);
        return ans;
    }
}
