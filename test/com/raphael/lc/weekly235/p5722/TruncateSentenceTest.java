package com.raphael.lc.weekly235.p5722;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

/**
 * @author Raphael
 * @date 2021-04-04 10:31:52
 */
class TruncateSentenceTest {

    private final TruncateSentence solution = new TruncateSentence();

    @Test
    void t1() {
        Assertions.assertEquals("Hello how are you", solution.truncateSentence("Hello how are you Contestant", 4));
    }

    @Test
    void t2() {
        Assertions.assertEquals("What is the solution", solution.truncateSentence("What is the solution to this problem", 4));
    }

    @Test
    void t3() {
        Assertions.assertEquals("chopper is not a tanuki", solution.truncateSentence("chopper is not a tanuki", 5));
    }
}
