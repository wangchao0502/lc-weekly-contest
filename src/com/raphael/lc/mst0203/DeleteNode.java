package com.raphael.lc.mst0203;

import com.raphael.lc.common.ListNode;

/**
 * @author Raphael
 * @date 2021-04-16 14:50:05
 */
class DeleteNode {
    /**
     * Description for DeleteNode:
     * 删除中间节点
     */
    public void deleteNode(ListNode node) {
        // code
        int len = 0;
        ListNode ptr = node;

        while (ptr != null) {
            len++;
            ptr = ptr.next;
        }

        ListNode prev = node;
        ListNode curr = node;
        int count = 1;

        while (count < (len + 1) / 2) {
            count++;
            prev = curr;
            curr = curr.next;
        }

        prev.next = curr.next;
    }
}
