package com.raphael.lc.p655;

import com.raphael.lc.common.TreeNode;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/**
 * @author Raphael
 * @date 2021-05-14 11:31:07
 */
class PrintTree {
    /**
     * Description for PrintTree:
     * 输出二叉树
     */

    private int calHeight(TreeNode node) {
        if (node == null) {
            return 0;
        }

        return Math.max(calHeight(node.left), calHeight(node.right)) + 1;
    }

    private int getIndex(int level, int x, int n) {
        if (level == 1) return n / 2;
        int k = n;
        while (level > 1) {
            k /= 2;
            level--;
        }
        return (k + 1) * (x - 1) + k / 2;
    }

    public List<List<String>> printTree(TreeNode root) {
        // code
        int m = calHeight(root);
        int n = (int) (Math.pow(2, m) - 1);
        List<List<String>> ans = new ArrayList<>();

        for (int i = 0; i < m; i++) {
            List<String> line = new ArrayList<>();
            for (int j = 0; j < n; j++) {
                line.add("");
            }
            ans.add(line);
        }

        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);
        int level = 1;

        while (!queue.isEmpty() && level <= m) {
            int i = 1;
            int total = (int) Math.pow(2, level - 1);

            while (i <= total) {
                TreeNode node = queue.poll();
                if (node != null) {
                    ans.get(level - 1).set(getIndex(level, i, n), String.valueOf(node.val));
                    queue.add(node.left);
                    queue.add(node.right);
                } else {
                    queue.add(null);
                    queue.add(null);
                }
                i++;
            }
            level++;
        }

        return ans;
    }
}
