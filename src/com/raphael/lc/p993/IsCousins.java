package com.raphael.lc.p993;

import com.raphael.lc.common.TreeNode;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Raphael
 * @date 2021-05-17 10:49:23
 */

class Item {
    TreeNode parent;
    int level;

    public Item(TreeNode parent, int level) {
        this.parent = parent;
        this.level = level;
    }
}

class IsCousins {
    /**
     * Description for IsCousins:
     * 二叉树的堂兄弟节点
     */

    List<Item> ans;

    private void dfs(TreeNode node, TreeNode parent, int level, int target) {
        if (node == null) {
            return;
        }
        if (node.val == target) {
            ans.add(new Item(parent, level));
            return;
        }
        dfs(node.left, node, level + 1, target);
        dfs(node.right, node, level + 1, target);
    }

    public boolean isCousins(TreeNode root, int x, int y) {
        // code
        ans = new ArrayList<>();
        dfs(root, null, 0, x);
        dfs(root, null, 0, y);

        if (ans.size() != 2) {
            return false;
        }

        Item node1 = ans.get(0);
        Item node2 = ans.get(1);

        return node1.level == node2.level && !node1.parent.equals(node2.parent);
    }
}
