package com.raphael.lc.p82;

import com.raphael.lc.common.ListNode;

/**
 * @author raphael
 * @date 2021-01-20 20:12:58
 */
class DeleteDuplicates {
    /**
     * Description for DeleteDuplicates:
     * 给定一个排序链表，删除所有含有重复数字的节点，只保留原始链表中 没有重复出现 的数字。
     */
    public ListNode deleteDuplicates(ListNode head) {
        // code
        if (head == null || head.next == null) {
            return head;
        }
        if (head.next == head.next.next) {
            return null;
        }
        // find real head
        ListNode dummy = new ListNode(0);
        dummy.next = head;
        ListNode ptr = dummy;
        while (ptr.next != null) {
            if (ptr.next.next != null && ptr.next.val == ptr.next.next.val) {
                ListNode p = ptr.next.next;
                while (p.next != null && p.next.val == ptr.next.val) {
                    p = p.next;
                }
                ptr.next = p.next;
            } else {
                ptr = ptr.next;
            }
        }

        return dummy.next;
    }
}
