package com.raphael.lc.p936;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

/**
 * @author Raphael
 * @date 2021-04-21 11:13:18
 */
class MovesToStampTest {

    private final MovesToStamp solution = new MovesToStamp();

    @Test
    void t1() {
        int[] ans = {0, 2};
        Assertions.assertArrayEquals(ans, solution.movesToStamp("abc", "ababc"));
    }

    @Test
    void t2() {
        int[] ans = {3, 0, 1};
        Assertions.assertArrayEquals(ans, solution.movesToStamp("abca", "aabcaca"));
    }

    @Test
    void t3() {
        int[] ans = {};
        Assertions.assertArrayEquals(ans, solution.movesToStamp("aye", "eyeye"));
    }

    @Test
    void t4() {
        int[] ans = {};
        Assertions.assertArrayEquals(ans, solution.movesToStamp("ycameqjduwsdyvcrisbbgmvqgigtinjzzyfrtoabafxqrqvbep", "ycyycameqjduwsdycameqjduwsdyvcrisbycameqjduwsdyvcrisbbgmvqgigtinjzzyfrtoabyycameqjduwsdyvcrisbbgmvqgigtiycameqjduwsdyvcrisbbgmvqgigtinjzzyfrtoabafxqrqvbeptoabafxqrqvbepcrisbbycameqjduwsdyvcrisbbgmvqgigtinjzzyfrtoabafxqrqvbepqvycameqjduwsdyvcrisbbgmvqgigtinjzzyfrtoabafxqrqvbepbbgmvqgigtinjzzyfrtoabafxqrqycameqjduwsdycameqjduwsdyvcrisbbgmvqgigtinjzzyfrtoabafxqrqbbepgigtinjzzyfrtoabafxqrqvbepafxqrqvbepycameqjduwsdyvcrisbbgmvqgigtinjzzyfrtoabafxqrqvbepvbeptinjycameqjduwsdyvcrisbbgmvqgigtinjycameqjduwsdyvcrisbbgmvqgigtinjzzyfrtoabafxqrqvbepwsdyvcrisbbgmvqgigtinjzzyfrtoabafxqrqvbepbepyfycameqjduwsdyvcriycameqjduwsdyvcrisbbgmvqgigtinjzzyfrtoabafxqrycameqjduwsdyvcrisbbgmvqgigtinjzzyfrtoabafxqrqvbeppmeqjduwsdyvcrisbbgmvqgigtinjzzyfrtoabafxqycameqjduwycameqjduwsdyvcrisbbgmycameqjduwsdyvcrisbbgmvqgigtinjzzyfrtoabafxqrqvbepsbbgmvqgigtinjzzyfrtoabafxqrqvbepmeqjduwsycameqycameqjduwsycameqjduwsdyvcrisbbgmvqgigtinjzzyfrtoabafxqrqvbepbafxqrqvbepamycameqjduwsdyvcrisbbgmvqgigtinjzzyfrtoabafxqrqvbepepvbep"));
    }
}
