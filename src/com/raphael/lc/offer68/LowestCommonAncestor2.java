package com.raphael.lc.offer68;

import com.raphael.lc.common.TreeNode;

/**
 * @author Raphael
 * @date 2021-03-22 15:38:59
 */
@SuppressWarnings("AlibabaAvoidComplexCondition")
class LowestCommonAncestor2 {
    /**
     * Description for LowestCommonAncestor2:
     * 二叉树的最近公共祖先
     */

    TreeNode ans;

    private boolean dfs(TreeNode root, TreeNode p, TreeNode q) {
        if (root == null) return false;
        boolean lson = dfs(root.left, p, q);
        boolean rson = dfs(root.right, p, q);
        if ((lson && rson) || ((root.val == p.val || root.val == q.val) && (lson || rson))) {
            ans = new TreeNode(root.val);
        }
        return lson || rson || root.val == p.val || root.val == q.val;
    }

    public TreeNode lowestCommonAncestor2(TreeNode root, TreeNode p, TreeNode q) {
        // code
        ans = null;
        dfs(root, p, q);
        return ans;
    }
}
