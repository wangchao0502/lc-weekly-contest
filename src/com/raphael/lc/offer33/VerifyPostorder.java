package com.raphael.lc.offer33;

/**
 * @author Raphael
 * @date 2021-03-16 18:13:13
 */
class VerifyPostorder {
    /**
     * Description for VerifyPostorder:
     * 二叉搜索树的后序遍历序列
     */
    private boolean helper(int[] postorder, int i, int j) {
        if (i >= j - 1) return true;
        int k = i;
        while (postorder[k] < postorder[j]) k++;
        int m = k;
        while (postorder[k] > postorder[j]) k++;
        return k == j && helper(postorder, i, m - 1) && helper(postorder, m, j - 1);
    }

    public boolean verifyPostorder(int[] postorder) {
        // code
        return helper(postorder, 0, postorder.length - 1);
    }
}
