package com.raphael.lc.offer17;

/**
 * @author Raphael
 * @date 2021-03-15 11:17:30
 */
class PrintNumbers {
    /**
     * Description for PrintNumbers:
     * 打印从1到最大的n位数
     */
    public int[] printNumbers(int n) {
        // code
        int max = (int) (Math.pow(10, n) - 1);
        int[] ans = new int[max];
        for (int i = 1; i <= max; i++) {
            ans[i - 1] = i;
        }
        return ans;
    }
}
