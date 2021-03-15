package com.raphael.lc.offer25;

import com.raphael.lc.common.ListNode;

/**
 * @author Raphael
 * @date 2021-03-15 16:30:08
 */
class MergeTwoLists {
    /**
     * Description for MergeTwoLists:
     */
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        // code
        ListNode dummy = new ListNode();
        ListNode head = dummy;

        while (l1 != null && l2 != null) {
            head.next = new ListNode();
            if (l1.val < l2.val) {
                head.next.val = l1.val;
                l1 = l1.next;
            } else {
                head.next.val = l2.val;
                l2 = l2.next;
            }
            head = head.next;
        }

        head.next = l1 == null ? l2 : l1;

        return dummy.next;
    }
}
