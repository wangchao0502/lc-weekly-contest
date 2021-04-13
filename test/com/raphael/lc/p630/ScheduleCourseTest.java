package com.raphael.lc.p630;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

/**
 * @author Raphael
 * @date 2021-04-13 16:42:56
 */
class ScheduleCourseTest {

    private final ScheduleCourse solution = new ScheduleCourse();

    @Test
    void t1() {
        int[][] courses = {{100, 200}, {200, 1300}, {1000, 1250}, {2000, 3200}};
        Assertions.assertEquals(3, solution.scheduleCourse(courses));
    }

    @Test
    void t2() {
        int[][] courses = {{5, 5}, {4, 6}, {2, 6}};
        Assertions.assertEquals(2, solution.scheduleCourse(courses));
    }
}
