package com.raphael.lc.p331;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

/**
 * @author Raphael
 * @date 2021-03-12 10:10:49
 */
class IsValidSerializationTest {

    private final IsValidSerialization solution = new IsValidSerialization();

    @Test
    void t1() {
        Assertions.assertTrue(solution.isValidSerialization("9,3,4,#,#,1,#,#,2,#,6,#,#"));
    }

    @Test
    void t2() {
        Assertions.assertFalse(solution.isValidSerialization("1,#"));
    }

    @Test
    void t3() {
        Assertions.assertFalse(solution.isValidSerialization("9,#,#,1"));
    }
}
