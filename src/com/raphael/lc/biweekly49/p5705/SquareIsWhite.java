package com.raphael.lc.biweekly49.p5705;

/**
 * @author Raphael
 * @date 2021-04-03 22:47:54
 */
class SquareIsWhite {
    /**
     * Description for SquareIsWhite:
     * 判断国际象棋棋盘中一个格子的颜色
     */
    public boolean squareIsWhite(String coordinates) {
        // code
        int x = coordinates.charAt(0) - 'a';
        int y = coordinates.charAt(1) - '1';

        return (x & 1) == 0 && (y & 1) == 1 || (x & 1) == 1 && (y & 1) == 0;
    }
}
