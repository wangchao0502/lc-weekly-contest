package com.raphael.lc.p68;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

/**
 * @author Raphael
 * @date 2021-05-17 11:10:42
 */
class FullJustifyTest {

    private final FullJustify solution = new FullJustify();

    @Test
    void t1() {
        String[] words = {"This", "is", "an", "example", "of", "text", "justification."};
        List<String> ans = Arrays.asList(
                "This    is    an",
                "example  of text",
                "justification.  ");
        Assertions.assertEquals(ans, solution.fullJustify(words, 16));
    }
}
