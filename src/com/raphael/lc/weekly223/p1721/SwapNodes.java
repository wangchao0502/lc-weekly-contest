package com.raphael.lc.weekly223.p1721;


import com.raphael.lc.common.ListNode;

/**
 * @author raphael
 * @date 2021-01-10 10:42:56
 */
class SwapNodes {
    /**
     * Description for SwapNodes:
     * 给你链表的头节点 head 和一个整数 k 。
     * 交换 链表正数第 k 个节点和倒数第 k 个节点的值后，返回链表的头节点（链表 从 1 开始索引）。
     */
    public ListNode swapNodes(ListNode head, int k) {
        // code
        ListNode fast = head;
        ListNode slow = head;
        ListNode kth = head;

        int i = 1;
        while (fast.next != null) {
            if (i < k) {
                kth = kth.next;
            } else {
                slow = slow.next;
            }
            fast = fast.next;
            i++;
        }

        // swap
        int tmp = kth.val;
        kth.val = slow.val;
        slow.val = tmp;

        return head;
    }
}
