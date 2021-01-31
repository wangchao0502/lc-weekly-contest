package com.raphael.lc.p839;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

/**
 * @author raphael
 * @date 2021-01-31 10:20:40
 */
class NumSimilarGroupsTest {

    private final NumSimilarGroups solution = new NumSimilarGroups();

    @Test
    void t1() {
        String[] input = {"tars", "rats", "arts", "star"};
        Assertions.assertEquals(2, solution.numSimilarGroups(input));
    }

    @Test
    void t2() {
        String[] input = {"omv", "ovm"};
        Assertions.assertEquals(1, solution.numSimilarGroups(input));
    }

    @Test
    void t3() {
        String[] input = {"kccomwcgcs", "socgcmcwkc", "sgckwcmcoc", "coswcmcgkc", "cowkccmsgc", "cosgmccwkc", "sgmkwcccoc", "coswmccgkc", "kowcccmsgc", "kgcomwcccs"};
        Assertions.assertEquals(5, solution.numSimilarGroups(input));
    }
}
