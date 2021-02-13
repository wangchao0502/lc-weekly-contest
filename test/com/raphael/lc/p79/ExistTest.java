package com.raphael.lc.p79;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

/**
 * @author raphael
 * @date 2021-02-13 15:55:53
 */
class ExistTest {

    private final Exist solution = new Exist();

    @Test
    void t1() {
        char[][] board = {{'A', 'B', 'C', 'E'}, {'S', 'F', 'C', 'S'}, {'A', 'D', 'E', 'E'}};
        Assertions.assertTrue(solution.exist(board, "ABCCED"));
        Assertions.assertTrue(solution.exist(board, "SEE"));
        Assertions.assertFalse(solution.exist(board, "ABCB"));
    }
}
