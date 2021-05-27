package com.raphael.lc.mst0403;

import com.raphael.lc.common.ListNode;
import com.raphael.lc.common.TreeNode;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/**
 * @author Raphael
 * @date 2021-05-27 16:48:08
 */
class ListOfDepth {
    /**
     * Description for ListOfDepth:
     * 特定深度节点链表
     */
    public ListNode[] listOfDepth(TreeNode tree) {
        // code
        List<ListNode> ans = new ArrayList<>();
        // 帮助用来层序遍历的队列
        Queue<TreeNode> queue = new LinkedList<>();
        // 先把树的根节点入队
        queue.offer(tree);
        while (!queue.isEmpty()) {
            // 逐层遍历树
            int size = queue.size();
            // dummy 节点是用来标记链表头节点的辅助节点
            ListNode dummy = new ListNode(0);
            // curr 节点用来逐个连接新节点
            ListNode curr = dummy;
            for (int i = 0; i < size; ++i) {
                // 遍历这一层的所有节点
                TreeNode treeNode = queue.poll();
                // 连接链表
                assert treeNode != null;
                curr.next = new ListNode(treeNode.val);
                curr = curr.next;
                // 把这一层所有节点的左右子节点放到队列中去
                if (treeNode.left != null) queue.offer(treeNode.left);
                if (treeNode.right != null) queue.offer(treeNode.right);
            }
            // 把这一层的链表头放到返回值中
            ans.add(dummy.next);
        }
        return ans.toArray(new ListNode[0]);
    }
}
