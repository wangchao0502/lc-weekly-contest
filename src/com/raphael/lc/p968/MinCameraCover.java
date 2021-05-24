package com.raphael.lc.p968;

import com.raphael.lc.common.TreeNode;

/**
 * @author Raphael
 * @date 2021-05-24 10:12:11
 */
class MinCameraCover {
    /**
     * Description for MinCameraCover:
     * 监控二叉树
     */
    public int[] dfs(TreeNode root) {
        if (root == null) {
            return new int[]{Integer.MAX_VALUE / 2, 0, 0};
        }
        int[] leftArray = dfs(root.left);
        int[] rightArray = dfs(root.right);
        int[] array = new int[3];
        array[0] = leftArray[2] + rightArray[2] + 1;
        array[1] = Math.min(array[0], Math.min(leftArray[0] + rightArray[1], rightArray[0] + leftArray[1]));
        array[2] = Math.min(array[0], leftArray[1] + rightArray[1]);
        return array;
    }

    public int minCameraCover(TreeNode root) {
        // code
        int[] array = dfs(root);
        return array[1];
    }
}
