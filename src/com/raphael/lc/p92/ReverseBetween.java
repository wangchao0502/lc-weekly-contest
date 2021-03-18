package com.raphael.lc.p92;

import com.raphael.lc.common.ListNode;

/**
 * @author Raphael
 * @date 2021-03-18 10:42:32
 */
class ReverseBetween {
    /**
     * Description for ReverseBetween:
     */
    public ListNode reverseBetween(ListNode head, int left, int right) {
        // code
        // 设置 dummyNode 是这一类问题的一般做法
        ListNode dummyNode = new ListNode(-1);
        dummyNode.next = head;
        ListNode pre = dummyNode;

        for (int i = 0; i < left - 1; i++) {
            pre = pre.next;
        }
        ListNode cur = pre.next;
        ListNode next;
        for (int i = 0; i < right - left; i++) {
            next = cur.next;
            cur.next = next.next;
            next.next = pre.next;
            pre.next = next;
        }
        return dummyNode.next;
    }
}
