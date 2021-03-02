package com.raphael.lc.p199;

import com.raphael.lc.common.TreeNode;
import sun.awt.image.ImageWatched;

import java.util.ArrayList;
import java.util.Deque;
import java.util.LinkedList;
import java.util.List;

/**
 * @author Raphael
 * @date 2021-02-26 15:52:33
 */
class RightSideView {
    /**
     * Description for RightSideView:
     * 二叉树的右视图
     */
    @SuppressWarnings("ConstantConditions")
    public List<Integer> rightSideView(TreeNode root) {
        // code
        List<Integer> ans = new ArrayList<>();

        if (root == null) {
            return ans;
        }

        Deque<TreeNode> queue = new LinkedList<>();
        queue.add(root);

        while (!queue.isEmpty()) {
            int count = queue.size();
            while (count > 0) {
                TreeNode node = queue.pollFirst();
                if (count == 1) {
                    ans.add(node.val);
                }
                if (node.left != null) {
                    queue.add(node.left);
                }
                if (node.right != null) {
                    queue.add(node.right);
                }
                count--;
            }
        }

        return ans;
    }
}
