package com.raphael.lc.p1603;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

/**
 * @author Raphael
 * @date 2021-03-19 10:21:35
 */
class ParkingSystemTest {
    @Test
    void t1() {
        ParkingSystem parkingSystem = new ParkingSystem(1,1, 0);
        Assertions.assertTrue(parkingSystem.addCar(1));
        Assertions.assertTrue(parkingSystem.addCar(2));
        Assertions.assertFalse(parkingSystem.addCar(3));
        Assertions.assertFalse(parkingSystem.addCar(1));
    }
}
