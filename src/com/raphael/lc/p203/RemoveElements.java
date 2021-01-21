package com.raphael.lc.p203;

import com.raphael.lc.common.ListNode;

/**
 * @author raphael
 * @date 2021-01-21 23:57:21
 */
class RemoveElements {
    /**
     * Description for RemoveElements:
     *
     */
    public ListNode removeElements(ListNode head, int val) {
        ListNode dummy = new ListNode();
        dummy.next= head;
        ListNode curHead = dummy;
        while (curHead.next != null) {
            if (curHead.next.val == val) {
                curHead.next = curHead.next.next;
            } else {
                curHead = curHead.next;
            }
        }
        return dummy.next;
    }
}
