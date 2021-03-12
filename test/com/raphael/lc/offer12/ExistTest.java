package com.raphael.lc.offer12;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

/**
 * @author Raphael
 * @date 2021-03-12 11:18:43
 */
class ExistTest {

    private final Exist solution = new Exist();

    @Test
    void t1() {
        char[][] board = {{'A', 'B', 'C', 'E'}, {'S', 'F', 'C', 'S'}, {'A', 'D', 'E', 'E'}};
        Assertions.assertTrue(solution.exist(board, "ABCCED"));
    }
}
