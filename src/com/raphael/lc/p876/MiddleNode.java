package com.raphael.lc.p876;

import com.raphael.lc.common.ListNode;

/**
 * @author raphael
 * @date 2021-01-22 00:15:36
 */
class MiddleNode {
    /**
     * Description for MiddleNode:
     * 链表中间节点
     */
    public ListNode middleNode(ListNode head) {
        // code
        ListNode slow = head;
        ListNode fast = head;

        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }

        return slow;
    }
}
