package com.raphael.lc.p591;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

/**
 * @author Raphael
 * @date 2021-03-24 11:13:10
 */
class IsValidTest {

    private final IsValid solution = new IsValid();

    @Test
    void t1() {
        String code = "<DIV>This is the first line <![CDATA[<div>]]></DIV>";
        Assertions.assertTrue(solution.isValid(code));
    }
}
