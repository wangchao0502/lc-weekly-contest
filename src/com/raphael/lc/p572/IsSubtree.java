package com.raphael.lc.p572;

import com.raphael.lc.common.TreeNode;

/**
 * @author Raphael
 * @date 2021-05-12 15:42:06
 */
class IsSubtree {
    /**
     * Description for IsSubtree:
     * 另一个树的子树
     */
    public boolean isSubtree(TreeNode s, TreeNode t) {
        if (t == null) return true;
        if (s == null) return false;
        return isSubtree(s.left, t) || isSubtree(s.right, t) || isSameTree(s, t);
    }

    /**
     * 判断两棵树是否相同
     */
    public boolean isSameTree(TreeNode s, TreeNode t) {
        if (s == null && t == null) return true;
        if (s == null || t == null) return false;
        if (s.val != t.val) return false;
        return isSameTree(s.left, t.left) && isSameTree(s.right, t.right);
    }
}
