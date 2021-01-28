package com.raphael.lc.p25;

import com.raphael.lc.common.ListNode;

/**
 * @author raphael
 * @date 2021-01-28 23:45:47
 */
@SuppressWarnings("AlibabaClassNamingShouldBeCamel")
class ReverseKGroup {
    /**
     * Description for ReverseKGroup:
     */
    @SuppressWarnings("AlibabaLowerCamelCaseVariableNaming")
    public ListNode reverseKGroup(ListNode head, int k) {
        // code
        ListNode hair = new ListNode(0);
        hair.next = head;
        ListNode pre = hair;

        while (head != null) {
            ListNode tail = pre;
            for (int i = 0; i < k; i++) {
                tail = tail.next;
                if (tail == null) {
                    return hair.next;
                }
            }
            ListNode next = tail.next;
            ListNode[] reverse = myReverse(head, tail);
            head = reverse[0];
            tail = reverse[1];
            pre.next = head;
            tail.next = next;
            pre = tail;
            head = tail.next;
        }
        return hair.next;
    }

    private ListNode[] myReverse(ListNode head, ListNode tail) {
        ListNode prev = tail.next;
        ListNode p = head;
        while (prev != tail) {
            ListNode next = p.next;
            p.next = prev;
            prev = p;
            p = next;
        }
        return new ListNode[]{tail, head};
    }
}
