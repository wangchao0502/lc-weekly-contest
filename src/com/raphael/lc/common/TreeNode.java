package com.raphael.lc.common;

/**
 * @author Raphael
 */
public class TreeNode {
    public int val;
    public TreeNode left;
    public TreeNode right;

    public TreeNode(int val) {
        this.val = val;
    }

    public TreeNode(int val, TreeNode left, TreeNode right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }

    public static TreeNode build(int[] arr) {
        TreeNode[] nodes = new TreeNode[arr.length];

        for (int i = arr.length - 1; i >= 0; i--) {
            nodes[i] = new TreeNode(arr[i]);
            if (2 * i + 1 < arr.length) {
                nodes[i].left = nodes[2 * i + 1];
            }
            if (2 * i + 2 < arr.length) {
                nodes[i].right = nodes[2 * i + 2];
            }
        }
        return nodes[0];
    }
}
