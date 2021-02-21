package com.raphael.lc.weekly229.p5686;

/**
 * @author Raphael
 * @date 2021-02-21 10:37:50
 */
class MinOperations {
    /**
     * Description for MinOperations:
     * 移动所有球到每个盒子所需的最小操作数
     */
    public int[] minOperations(String boxes) {
        // code
        int n = boxes.length();
        char[] chars = boxes.toCharArray();
        int leftCount = 0, leftSum = 0;
        int rightCount = 0, rightSum = 0;

        // get index = 0, right total and count
        for (int i = 0; i < n; i++) {
            if (chars[i] == '1') {
                rightCount++;
                rightSum += i;
            }
        }

        int[] ans = new int[n];
        int ptr = 0;
        while (ptr < n) {
            ans[ptr] = leftSum + rightSum;
            if (chars[ptr] == '1'){
                rightCount--;
                leftCount++;
            }
            rightSum -= rightCount;
            leftSum += leftCount;
            ptr++;
        }

        return ans;
    }
}
