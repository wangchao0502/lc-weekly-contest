package com.raphael.lc.p1603;

import java.util.HashMap;
import java.util.Map;

/**
 * @author Raphael
 * @date 2021-03-19 10:21:35
 */
class ParkingSystem {
    /**
     * Description for ParkingSystem:
     * 设计停车系统
     */

    Map<Integer, Integer> pool;

    public ParkingSystem(int big, int medium, int small) {
        pool = new HashMap<>();
        pool.put(1, big);
        pool.put(2, medium);
        pool.put(3, small);
    }

    public boolean addCar(int carType) {
        int rest = pool.get(carType);
        if (rest == 0) {
            return false;
        }
        pool.put(carType, rest - 1);
        return true;
    }
}
