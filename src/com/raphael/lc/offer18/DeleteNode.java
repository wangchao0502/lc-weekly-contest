package com.raphael.lc.offer18;

import com.raphael.lc.common.ListNode;

/**
 * @author Raphael
 * @date 2021-03-15 11:21:43
 */
class DeleteNode {
    /**
     * Description for DeleteNode:
     */
    public ListNode deleteNode(ListNode head, int val) {
        // code
        ListNode dummy = new ListNode();
        ListNode curr = dummy;

        dummy.next = head;

        while (curr.next != null) {
            if (curr.next.val == val) {
                curr.next = curr.next.next;
                break;
            }
            curr = curr.next;
        }

        return dummy.next;
    }
}
