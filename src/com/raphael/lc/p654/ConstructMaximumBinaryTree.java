package com.raphael.lc.p654;

import com.raphael.lc.common.TreeNode;

/**
 * @author Raphael
 * @date 2021-05-14 06:55:33
 */
class ConstructMaximumBinaryTree {
    /**
     * Description for ConstructMaximumBinarayTree:
     * 最大二叉树
     */

    private int findMax(int[] nums, int start, int end) {
        int maxIndex = start;
        for (int i = start + 1; i <= end; i++) {
            if (nums[i] > nums[maxIndex]) {
                maxIndex = i;
            }
        }
        return maxIndex;
    }

    private TreeNode buildTree(int[] nums, int start, int end) {
        if (start > end || start >= nums.length) {
            return null;
        }
        int maxIndex = findMax(nums, start, end);
        TreeNode root = new TreeNode(nums[maxIndex]);
        root.left = buildTree(nums, start, maxIndex - 1);
        root.right = buildTree(nums, maxIndex + 1, end);
        return root;
    }

    public TreeNode constructMaximumBinarayTree(int[] nums) {
        // code
        return buildTree(nums, 0, nums.length - 1);
    }
}
