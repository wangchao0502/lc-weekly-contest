package com.raphael.lc.p1373;

import com.raphael.lc.common.TreeNode;

import java.util.HashMap;

/**
 * @author raphael
 * @date 2021-02-08 16:35:50
 */
@SuppressWarnings({"AlibabaClassNamingShouldBeCamel", "AlibabaLowerCamelCaseVariableNaming"})
class MaxSumBST {
    /**
     * Description for MaxSumBST:
     * 二叉搜索子树的最大键值和
     */
    private int maxSum = 0;
    private HashMap<TreeNode, Boolean> isBstMap;

    int childMax(TreeNode root) {
        if (root == null) return Integer.MIN_VALUE;
        while (root.right != null) {
            root = root.right;
        }
        return root.val;
    }

    int childMin(TreeNode root) {
        if (root == null) return Integer.MAX_VALUE;
        while (root.left != null) {
            root = root.left;
        }
        return root.val;
    }

    private boolean isBstWalker(TreeNode root) {
        if (root == null) {
            return true;
        }
        boolean leftBst = isBstWalker(root.left);
        boolean rightBst = isBstWalker(root.right);
        boolean currBst = leftBst && rightBst;

        if (root.left != null) {
            currBst &= root.left.val < root.val;
        }
        if (root.right != null) {
            currBst &= root.right.val > root.val;
        }
        currBst &= root.val > childMax(root.left);
        currBst &= root.val < childMin(root.right);

        isBstMap.put(root, currBst);
        return currBst;
    }

    private int sumWalker(TreeNode root) {
        if (root == null) {
            return 0;
        }
        int leftSum = sumWalker(root.left);
        int rightSum = sumWalker(root.right);
        int sum = 0;

        if (isBstMap.get(root)) {
            sum = leftSum + rightSum + root.val;
        }

        // update maxSum
        maxSum = Math.max(maxSum, sum);

        return sum;
    }

    public int maxSumBST(TreeNode root) {
        // code
        isBstMap = new HashMap<>(16);
        isBstWalker(root);
        sumWalker(root);
        return maxSum;
    }
}
