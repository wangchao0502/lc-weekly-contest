package com.raphael.lc.common;

import java.util.Objects;

/**
 * @author Raphael
 */
public class TreeNode {
    public int val;
    public TreeNode left;
    public TreeNode right;

    private static final String EMPTY = "[]";

    public TreeNode(int x) {
        val = x;
    }

    public TreeNode() {}

    /**
     * 创建测试数据
     *
     * @return {@link TreeNode}
     */
    public static TreeNode build(String data) {
        if (EMPTY.equals(data)) {
            return null;
        }
        data = data.substring(1, data.length() - 1);
        String[] split = data.split(",");
        int len = split.length;

        TreeNode[] treeNodes = new TreeNode[len + 1];
        for (int i = 1; i < treeNodes.length; i++) {
            if ("null".equals(split[i - 1])) {
                treeNodes[i] = null;
            } else {
                treeNodes[i] = new TreeNode(Integer.parseInt(split[i - 1]));
            }
        }

        TreeNode treeNode;
        for (int i = 1, index = 2; i < treeNodes.length && index < treeNodes.length; i++) {
            treeNode = treeNodes[i];
            if (treeNode == null) {
                continue;
            }
            treeNode.left = treeNodes[index];
            if (index + 1 < treeNodes.length) {
                treeNode.right = treeNodes[index + 1];
            }
            index += 2;
        }
        return treeNodes[1];
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        TreeNode treeNode = (TreeNode) o;
        return val == treeNode.val &&
                Objects.equals(left, treeNode.left) &&
                Objects.equals(right, treeNode.right);
    }

    @Override
    public int hashCode() {
        return Objects.hash(val, left, right);
    }
}
