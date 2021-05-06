package com.raphael.lc.p430;

/**
 * @author Raphael
 * @date 2021-05-06 14:56:35
 */

class Node {
    int val;
    Node prev;
    Node next;
    Node child;
}

class Flatten {
    /**
     * Description for Flatten:
     * 扁平化多级双向链表
     */
    public Node flatten(Node head) {
        // code
        if (head == null) return null;
        Node dummy = new Node();
        dfs(dummy, head);
        dummy.next.prev = null;
        return dummy.next;
    }

    private Node dfs(Node cur, Node ptr) {
        while (ptr.next != null) {
            cur.next = new Node();
            cur.next.val = ptr.val;
            cur.next.prev = cur;
            cur = cur.next;

            if (ptr.child != null) {
                cur = dfs(cur, ptr.child);
            }

            ptr = ptr.next;
        }

        return cur;
    }
}
