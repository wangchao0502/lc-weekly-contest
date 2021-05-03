package com.raphael.lc.p130;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

/**
 * @author Raphael
 * @date 2021-05-03 13:00:10
 */
class SolveTest {

    private final Solve solution = new Solve();

    @Test
    void t1() {
        char[][] board = {{'X', 'X', 'X', 'X'}, {'X', 'O', 'O', 'X'}, {'X', 'X', 'O', 'X'}, {'X', 'O', 'X', 'X'}};
        char[][] ans = {{'X', 'X', 'X', 'X'}, {'X', 'X', 'X', 'X'}, {'X', 'X', 'X', 'X'}, {'X', 'O', 'X', 'X'}};
        solution.solve(board);
        Assertions.assertArrayEquals(ans, board);
    }

    @Test
    void t2() {
        char[][] board = {{'X'}};
        char[][] ans = {{'X'}};
        solution.solve(board);
        Assertions.assertArrayEquals(ans, board);
    }
}
