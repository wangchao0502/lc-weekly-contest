package com.raphael.lc.p726;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

/**
 * @author Raphael
 * @date 2021-03-25 12:39:52
 */
class CountOfAtomsTest {

    private final CountOfAtoms solution = new CountOfAtoms();

    @Test
    void t1() {
        Assertions.assertEquals("H2O", solution.countOfAtoms("H2O"));
    }

    @Test
    void t2() {
        Assertions.assertEquals("H2MgO2", solution.countOfAtoms("Mg(OH)2"));
    }

    @Test
    void t3() {
        Assertions.assertEquals("K4N2O14S4", solution.countOfAtoms("K4(ON(SO3)2)2"));
    }

    @Test
    void t4() {
        Assertions.assertEquals("Be32", solution.countOfAtoms("Be32"));
    }

    @Test
    void t5() {
        Assertions.assertEquals("H2MgNO", solution.countOfAtoms("Mg(H2O)N"));
    }
}
