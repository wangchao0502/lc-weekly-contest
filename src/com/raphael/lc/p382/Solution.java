package com.raphael.lc.p382;

import com.raphael.lc.common.ListNode;

import java.util.Random;

/**
 * @author raphael
 * @date 2021-02-13 19:36:20
 */
class Solution {
    /**
     * Description for Solution:
     * 链表随机节点 蓄水池抽样
     */
    ListNode head;

    public Solution(ListNode head) {
        this.head = head;
    }

    public int getRandom() {
        if (head == null) {
            return -1;
        }

        Random random = new Random();
        ListNode curr = head;
        int val = curr.val;
        curr = curr.next;

        int i = 1;
        while (curr != null) {
            i++;
            if (random.nextInt(i) == 0) {
                val = curr.val;
            }
            curr = curr.next;
        }
        return val;
    }
}
