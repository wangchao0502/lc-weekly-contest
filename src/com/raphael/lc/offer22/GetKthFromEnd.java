package com.raphael.lc.offer22;

import com.raphael.lc.common.ListNode;

/**
 * @author Raphael
 * @date 2021-03-15 16:06:11
 */
class GetKthFromEnd {
    /**
     * Description for GetKthFromEnd:
     */
    public ListNode getKthFromEnd(ListNode head, int k) {
        // code
        ListNode fast = head;
        ListNode slow = head;

        while (k > 0) {
            fast = fast.next;
            k--;
        }

        while (fast != null) {
            fast = fast.next;
            slow = slow.next;
        }

        return slow;
    }
}
