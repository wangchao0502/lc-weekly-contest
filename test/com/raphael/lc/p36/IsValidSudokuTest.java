package com.raphael.lc.p36;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

/**
 * @author raphael
 * @date 2021-01-14 18:49:19
 */
class IsValidSudokuTest {

    private final IsValidSudoku solution = new IsValidSudoku();

    @Test
    void t1() {
        char[][] board = {
                {'5', '3', '.', '.', '7', '.', '.', '.', '.'},
                {'6', '.', '.', '1', '9', '5', '.', '.', '.'},
                {'.', '9', '8', '.', '.', '.', '.', '6', '.'},
                {'8', '.', '.', '.', '6', '.', '.', '.', '3'},
                {'4', '.', '.', '8', '.', '3', '.', '.', '1'},
                {'7', '.', '.', '.', '2', '.', '.', '.', '6'},
                {'.', '6', '.', '.', '.', '.', '2', '8', '.'},
                {'.', '.', '.', '4', '1', '9', '.', '.', '5'},
                {'.', '.', '.', '.', '8', '.', '.', '7', '9'}
        };
        Assertions.assertTrue(solution.isValidSudoku(board));
    }
}
