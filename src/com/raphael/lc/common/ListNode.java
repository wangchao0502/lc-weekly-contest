package com.raphael.lc.common;

import java.util.Objects;

/**
 * @author Raphael
 */
public class ListNode {
    public int val;
    public ListNode next;

    public ListNode() {
    }

    public ListNode(int val) {
        this.val = val;
    }

    public static ListNode build(int[] arr) {
        if (arr.length == 0) {
            return null;
        }
        ListNode head = new ListNode(arr[0]);
        ListNode tail = head;
        for (int i = 1; i < arr.length; i++) {
            tail.next = new ListNode(arr[i]);
            tail = tail.next;
        }
        return head;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ListNode listNode = (ListNode) o;
        if (next == null) {
            return listNode.next == null;
        }
        return val == listNode.val && next.equals(listNode.next);
    }

    @Override
    public int hashCode() {
        return Objects.hash(val, next);
    }
}
