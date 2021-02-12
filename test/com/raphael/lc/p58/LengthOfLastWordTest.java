package com.raphael.lc.p58;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

/**
 * @author raphael
 * @date 2021-02-12 12:11:40
 */
class LengthOfLastWordTest {

    private final LengthOfLastWord solution = new LengthOfLastWord();

    @Test
    void t1() {
        Assertions.assertEquals(5, solution.lengthOfLastWord("Hello World"));
    }

    @Test
    void t2() {
        Assertions.assertEquals(0, solution.lengthOfLastWord(" "));
    }

    @Test
    void t3() {
        Assertions.assertEquals(1, solution.lengthOfLastWord("a "));
    }
}
