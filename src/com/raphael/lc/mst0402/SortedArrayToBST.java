package com.raphael.lc.mst0402;

import com.raphael.lc.common.TreeNode;

/**
 * @author Raphael
 * @date 2021-05-27 12:31:06
 */
@SuppressWarnings("AlibabaLowerCamelCaseVariableNaming")
class SortedArrayToBST {
    /**
     * Description for SortedArrayToBST:
     * 最小高度树
     */

    private TreeNode helper(int[] nums, int start, int end) {
        if (start == end) {
            return null;
        }
        int mid = start + ((end - start) >> 1);
        TreeNode node = new TreeNode(nums[mid]);
        node.left = helper(nums, start, mid);
        node.right = helper(nums, mid + 1, end);
        return node;
    }

    public TreeNode sortedArrayToBST(int[] nums) {
        // code
        return helper(nums, 0, nums.length);
    }
}
