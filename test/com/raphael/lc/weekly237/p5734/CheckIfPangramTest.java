package com.raphael.lc.weekly237.p5734;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

/**
 * @author Raphael
 * @date 2021-04-18 10:32:43
 */
class CheckIfPangramTest {

    private final CheckIfPangram solution = new CheckIfPangram();

    @Test
    void t1() {
        Assertions.assertTrue(solution.checkIfPangram("thequickbrownfoxjumpsoverthelazydog"));
    }

    @Test
    void t2() {
        Assertions.assertFalse(solution.checkIfPangram("leetcode"));
    }
}
