package com.raphael.lc.p988;

import com.raphael.lc.common.TreeNode;

/**
 * @author Raphael
 * @date 2021-05-28 13:42:35
 */
class SmallestFromLeaf {
    /**
     * Description for SmallestFromLeaf:
     * 从叶节点开始的最小字符串
     */

    String ans = "~";

    public String smallestFromLeaf(TreeNode root) {
        dfs(root, new StringBuilder());
        return ans;
    }

    public void dfs(TreeNode node, StringBuilder sb) {
        if (node == null) return;
        sb.append((char) ('a' + node.val));

        if (node.left == null && node.right == null) {
            sb.reverse();
            String S = sb.toString();
            sb.reverse();

            if (S.compareTo(ans) < 0)
                ans = S;
        }

        dfs(node.left, sb);
        dfs(node.right, sb);
        sb.deleteCharAt(sb.length() - 1);
    }
}
