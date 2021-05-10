package com.raphael.lc.p513;

import com.raphael.lc.common.TreeNode;

/**
 * @author Raphael
 * @date 2021-05-10 13:18:55
 */
class FindBottomLeftValue {
    /**
     * Description for FindBottomLeftValue:
     * 找树左下角的值
     */

    int ans;
    boolean found;

    private int dfs(TreeNode node) {
        if (node == null) {
            return 0;
        }

        return Math.max(dfs(node.left), dfs(node.right)) + 1;
    }

    private void find(TreeNode node, int curHeight, int height) {
        if (node == null) {
            return;
        }

        find(node.left, curHeight + 1, height);
        if (curHeight == height && !found) {
            ans = node.val;
            found = true;
            return;
        }
        find(node.right, curHeight + 1, height);
    }

    public int findBottomLeftValue(TreeNode root) {
        // code
        int height = dfs(root);
        find(root, 1, height);
        return ans;
    }
}
