package com.raphael.lc.p1019;

import com.raphael.lc.common.ListNode;

import java.util.Stack;

/**
 * @author Raphael
 * @date 2021-03-29 18:47:55
 */
class NextLargerNodes {
    /**
     * Description for NextLargerNodes:
     * 链表中的下一个更大节点
     */
    public int[] nextLargerNodes(ListNode head) {
        // code
        Stack<int[]> stack = new Stack<>();
        int n = 0;
        ListNode curr = head;

        while (curr != null) {
            n++;
            curr = curr.next;
        }

        int[] arr = new int[n];
        curr = head;
        
        for (int i = 0; i < n; i++) {
            arr[i] = curr.val;
            curr = curr.next;
        }

        int[] ans = new int[n];

        for (int i = 0; i < n; i++) {
            while (!stack.isEmpty() && stack.peek()[1] < arr[i]) {
                int[] item = stack.pop();
                ans[item[0]] = arr[i];
            }
            stack.push(new int[]{i, arr[i]});
        }

        return ans;
    }
}
