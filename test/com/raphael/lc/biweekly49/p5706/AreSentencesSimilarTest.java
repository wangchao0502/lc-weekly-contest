package com.raphael.lc.biweekly49.p5706;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

/**
 * @author Raphael
 * @date 2021-04-03 22:52:41
 */
class AreSentencesSimilarTest {

    private final AreSentencesSimilar solution = new AreSentencesSimilar();

    @Test
    void t1() {
        Assertions.assertTrue(solution.areSentencesSimilar("My name is Haley", "My Haley"));
    }

    @Test
    void t2() {
        Assertions.assertFalse(solution.areSentencesSimilar("of", "A lot of words"));
    }

    @Test
    void t3() {
        Assertions.assertTrue(solution.areSentencesSimilar("Eating right now", "Eating"));
    }

    @Test
    void t4() {
        Assertions.assertFalse(solution.areSentencesSimilar("Luky", "Lucccky"));
    }

    @Test
    void t5() {
        Assertions.assertTrue(solution.areSentencesSimilar("Eating right now", "now"));
    }
}
