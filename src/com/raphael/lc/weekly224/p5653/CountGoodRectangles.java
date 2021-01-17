package com.raphael.lc.weekly224.p5653;

/**
 * @author raphael
 * @date 2021-01-17 10:35:12
 */
class CountGoodRectangles {
    /**
     * Description for CountGoodRectangles:
     * 可以形成最大正方型的矩阵数目
     */
    public int countGoodRectangles(int[][] rectangles) {
        // code
        int maxLen = 0;
        int count = 0;
        for (int[] rectangle : rectangles) {
            int min = Math.min(rectangle[0], rectangle[1]);
            if (maxLen < min) {
                maxLen = min;
                count = 1;
            } else if (maxLen == min) {
                count++;
            }
        }
        return count;
    }
}
