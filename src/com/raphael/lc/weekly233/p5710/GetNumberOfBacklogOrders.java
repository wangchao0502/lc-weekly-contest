package com.raphael.lc.weekly233.p5710;

import java.util.Comparator;
import java.util.PriorityQueue;

/**
 * @author Raphael
 * @date 2021-03-21 10:35:07
 */
class GetNumberOfBacklogOrders {
    /**
     * Description for GetNumberOfBacklogOrders:
     * 积压订单中的订单总数
     */
    public int getNumberOfBacklogOrders(int[][] orders) {
        // code
        PriorityQueue<int[]> buyBacklog = new PriorityQueue<>((o1, o2) -> o2[0] - o1[0]);
        PriorityQueue<int[]> sellBacklog = new PriorityQueue<>(Comparator.comparingInt(o -> o[0]));

        int n = orders.length;

        for (int[] order : orders) {
            int price = order[0];
            int amount = order[1];

            if (order[2] == 0) {
                // buy
                if (sellBacklog.isEmpty()) {
                    buyBacklog.offer(order);
                } else {
                    while (amount > 0 && !sellBacklog.isEmpty()) {
                        int[] sellOrder = sellBacklog.peek();
                        if (sellOrder[0] <= price) {
                            if (sellOrder[1] <= amount) {
                                amount -= sellOrder[1];
                                sellBacklog.poll();
                            } else {
                                sellOrder[1] -= amount;
                                amount = 0;
                                break;
                            }
                        } else {
                            break;
                        }
                    }
                    if (amount > 0) {
                        buyBacklog.add(new int[]{price, amount, 0});
                    }
                }
            } else {
                // sell
                if (buyBacklog.isEmpty()) {
                    sellBacklog.offer(order);
                } else {
                    while (amount > 0 && !buyBacklog.isEmpty()) {
                        int[] buyOrder = buyBacklog.peek();
                        if (buyOrder[0] >= price) {
                            if (buyOrder[1] <= amount) {
                                amount -= buyOrder[1];
                                buyBacklog.poll();
                            } else {
                                buyOrder[1] -= amount;
                                amount = 0;
                                break;
                            }
                        } else {
                            break;
                        }
                    }
                    if (amount > 0) {
                        sellBacklog.add(new int[]{price, amount, 1});
                    }
                }
            }
        }

        long ans = 0;
        for (int[] order : sellBacklog) {
            ans += order[1];
        }
        for (int[] order : buyBacklog) {
            ans += order[1];
        }

        return (int) (ans % 1000000007);
    }
}
