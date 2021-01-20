package com.raphael.lc.p83;

import com.raphael.lc.common.ListNode;

/**
 * @author raphael
 * @date 2021-01-20 19:58:05
 */
class DeleteDuplicates {
    /**
     * Description for DeleteDuplicates:
     * 给定一个排序链表，删除所有重复的元素，使得每个元素只出现一次。
     */
    public ListNode deleteDuplicates(ListNode head) {
        // code
        if (head == null || head.next == null) {
            return head;
        }

        ListNode left = head;
        ListNode right = head.next;

        while (left.next != null) {
            if (left.val == right.val) {
                left.next = right.next;
                right = left.next;
            } else {
                left = left.next;
                right = right.next;
            }
        }

        return head;
    }
}
