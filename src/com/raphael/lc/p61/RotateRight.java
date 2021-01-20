package com.raphael.lc.p61;

import com.raphael.lc.common.ListNode;

/**
 * @author raphael
 * @date 2021-01-20 19:23:40
 */
class RotateRight {
    /**
     * Description for RotateRight:
     * 给定一个链表，旋转链表，将链表每个节点向右移动 k 个位置，其中 k 是非负数。
     */
    public ListNode rotateRight(ListNode head, int k) {
        // code
        if (head == null || head.next == null) {
            return head;
        }
        ListNode curHead = head;

        int len = 1;
        while (curHead.next != null) {
            len++;
            curHead = curHead.next;
        }
        curHead = head;
        k = k % len;

        for (int i = 0; i < k; i++) {
            ListNode tail = curHead;
            while (tail.next.next != null) {
                tail = tail.next;
            }
            ListNode tmp = curHead;
            curHead = tail.next;
            tail.next = null;
            curHead.next = tmp;
        }

        return curHead;
    }
}
