package com.raphael.lc.offer50;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

/**
 * @author Raphael
 * @date 2021-03-18 11:27:08
 */
class FirstUniqCharTest {

    private final FirstUniqChar solution = new FirstUniqChar();

    @Test
    void t1() {
        Assertions.assertEquals('b', solution.firstUniqChar("abaccdeff"));
    }
}
