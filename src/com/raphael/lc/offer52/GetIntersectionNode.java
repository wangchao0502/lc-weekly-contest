package com.raphael.lc.offer52;

import com.raphael.lc.common.ListNode;

/**
 * @author Raphael
 * @date 2021-03-20 21:42:23
 */
class GetIntersectionNode {
    /**
     * Description for GetIntersectionNode:
     * 两个链表的第一个公共节点
     */
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        // code
        ListNode p1 = headA;
        ListNode p2 = headB;

        while (p1 != p2) {
            p1 = p1 == null ? headB : p1.next;
            p2 = p2 == null ? headA : p2.next;
        }

        return p1;
    }
}
