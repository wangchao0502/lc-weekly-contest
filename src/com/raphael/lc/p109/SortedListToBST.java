package com.raphael.lc.p109;

import com.raphael.lc.common.ListNode;
import com.raphael.lc.common.TreeNode;

/**
 * @author Raphael
 * @date 2021-05-03 11:26:05
 */
@SuppressWarnings("AlibabaLowerCamelCaseVariableNaming")
class SortedListToBST {
    /**
     * Description for SortedListToBST:
     * 有序链表转换二叉搜索树
     */

    ListNode globalHead;

    public TreeNode sortedListToBST(ListNode head) {
        // code
        globalHead = head;
        int length = getLength(head);
        return buildTree(0, length - 1);
    }

    private TreeNode buildTree(int left, int right) {
        if (left > right) {
            return null;
        }

        TreeNode root = new TreeNode();
        int mid = (left + right + 1) / 2;
        root.left = buildTree(left, mid - 1);
        root.val = globalHead.val;
        globalHead = globalHead.next;
        root.right = buildTree(mid + 1, right);
        return root;
    }

    private int getLength(ListNode head) {
        int length = 0;
        while (head != null) {
            length++;
            head = head.next;
        }
        return length;
    }
}
