package com.raphael.lc.p151;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

/**
 * @author raphael
 * @date 2021-02-02 16:15:57
 */
class ReverseWordsTest {

    private final ReverseWords solution = new ReverseWords();

    @Test
    void t1() {
        String input = "the sky is blue";
        String output = "blue is sky the";
        Assertions.assertEquals(output, solution.reverseWords(input));
    }

    @Test
    void t2() {
        String input = "  hello world!  ";
        String output = "world! hello";
        Assertions.assertEquals(output, solution.reverseWords(input));
    }
}
