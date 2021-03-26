package com.raphael.lc.p735;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

/**
 * @author Raphael
 * @date 2021-03-26 10:36:20
 */
class AsteroidCollisionTest {

    private final AsteroidCollision solution = new AsteroidCollision();

    @Test
    void t1() {
        int[] asteroids = {5, 10, -5};
        int[] result = {5, 10};
        Assertions.assertArrayEquals(result, solution.asteroidCollision(asteroids));
    }

    @Test
    void t2() {
        int[] asteroids = {8, -8};
        int[] result = {};
        Assertions.assertArrayEquals(result, solution.asteroidCollision(asteroids));
    }

    @Test
    void t3() {
        int[] asteroids = {10, 2, -5};
        int[] result = {10};
        Assertions.assertArrayEquals(result, solution.asteroidCollision(asteroids));
    }

    @Test
    void t4() {
        int[] asteroids = {-2, -1, 1, 2};
        int[] result = {-2, -1, 1, 2};
        Assertions.assertArrayEquals(result, solution.asteroidCollision(asteroids));
    }
}
