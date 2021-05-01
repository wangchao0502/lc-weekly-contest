package com.raphael.lc.biweekly51.p5731;

import java.util.PriorityQueue;

/**
 * @author Raphael
 * @date 2021-05-01 23:00:22
 */
@SuppressWarnings("ConstantConditions")
class SeatManager {
    /**
     * Description for SeatManager:
     */
    PriorityQueue<Integer> available;

    public SeatManager(int n) {
        available = new PriorityQueue<>();

        for (int i = 1; i <= n; i++) {
            available.add(i);
        }
    }

    public int reserve() {
        return available.poll();
    }

    public void unreserve(int seatNumber) {
        available.add(seatNumber);
    }
}
