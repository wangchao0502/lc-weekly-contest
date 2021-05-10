package com.raphael.lc.p872;

import com.raphael.lc.common.TreeNode;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Raphael
 * @date 2021-05-10 11:58:44
 */
class LeafSimilar {
    /**
     * Description for LeafSimilar:
     * 叶子相似的树
     */
    private void inorder(TreeNode node, List<Integer> leafList) {
        if (node == null) {
            return;
        }
        // is leaf
        inorder(node.left, leafList);
        if (node.left == null && node.right == null) {
            leafList.add(node.val);
        }
        inorder(node.right, leafList);
    }

    public boolean leafSimilar(TreeNode root1, TreeNode root2) {
        // code
        List<Integer> leaf1 = new ArrayList<>();
        List<Integer> leaf2 = new ArrayList<>();
        inorder(root1, leaf1);
        inorder(root2, leaf2);

        if (leaf1.size() != leaf2.size()) {
            return false;
        }

        for (int i = 0; i < leaf1.size(); i++) {
            if (!leaf1.get(i).equals(leaf2.get(i))) {
                return false;
            }
        }

        return true;
    }
}
