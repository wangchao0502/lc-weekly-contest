package com.raphael.lc.p160;

import com.raphael.lc.common.ListNode;

/**
 * @author raphael
 * @date 2021-01-18 23:46:55
 */
class GetIntersectionNode {
    /**
     * Description for GetIntersectionNode:
     * 编写一个程序，找到两个单链表相交的起始节点。
     */
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        // code
        if (headA == null || headB == null) {
            return null;
        }
        ListNode pa = headA;
        ListNode pb = headB;
        while (pa != pb) {
            pa = pa == null ? headB : pa.next;
            pb = pb == null ? headA : pb.next;
        }
        return pa;
    }
}
