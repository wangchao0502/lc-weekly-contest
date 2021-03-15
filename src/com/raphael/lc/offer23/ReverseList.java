package com.raphael.lc.offer23;

import com.raphael.lc.common.ListNode;

/**
 * @author Raphael
 * @date 2021-03-15 16:10:59
 */
class ReverseList {
    /**
     * Description for ReverseList:
     */
    public ListNode reverseList(ListNode head) {
        // code
        ListNode prev = null;
        ListNode curr = head;

        while (curr != null) {
            ListNode tmp = curr.next;
            curr.next = prev;
            prev = curr;
            curr = tmp;
        }

        return prev;
    }
}
