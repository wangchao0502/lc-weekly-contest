package com.raphael.lc.weekly223;


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
        ListNode first = null;
        ListNode second = null;

        int i = 1;
        while (fast != null && slow != null) {
            if (i == k) {
                first = fast;
            }
            fast = fast.next;
            if (i > k) {
                slow = slow.next;
            }
            if (fast == null) {
                second = slow;
            }
            i++;
        }

        // swap
        assert first != null;
        int tmp = first.val;
        assert second != null;
        first.val = second.val;
        second.val = tmp;

        return head;
    }
}
