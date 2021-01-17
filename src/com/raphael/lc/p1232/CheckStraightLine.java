package com.raphael.lc.p1232;

/**
 * @author raphael
 * @date 2021-01-17 10:23:17
 */
class CheckStraightLine {
    /**
     * Description for CheckStraightLine:
     * 在一个 XY 坐标系中有一些点，我们用数组 coordinates 来分别记录它们的坐标，其中 coordinates[i] = [x, y] 表示横坐标为
     * x、纵坐标为 y 的点。
     * 请你来判断，这些点是否在该坐标系中属于同一条直线上，是则返回 true，否则请返回 false。
     */
    public boolean checkStraightLine(int[][] coordinates) {
        // code
        //noinspection AlibabaUndefineMagicConstant
        if (coordinates.length == 2) {
            return true;
        }
        double k;
        if (coordinates[1][1] != coordinates[0][1]) {
            k = (double) (coordinates[1][0] - coordinates[0][0]) / (coordinates[1][1] - coordinates[0][1]);
        } else {
            k = -1;
        }
        for (int i = 2; i < coordinates.length; i++) {
            int[] curPoint = coordinates[i];
            int[] prePoint = coordinates[i - 1];
            if (curPoint[1] == prePoint[1]) {
                if (k == -1) {
                    continue;
                }
                return false;
            }
            if ((double) (curPoint[0] - prePoint[0]) / (curPoint[1] - prePoint[1]) != k) {
                return false;
            }
        }
        return true;
    }
}
