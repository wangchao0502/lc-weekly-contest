package com.raphael.lc.weekly236.p5727;

/**
 * @author Raphael
 * @date 2021-04-11 10:40:25
 */
class FindTheWinner {
    /**
     * Description for FindTheWinner:
     * 找出游戏的获胜者
     */
    public int findTheWinner(int n, int k) {
        // code
        boolean[] vis = new boolean[n];
        int count = n;
        int ptr = 0;

        while (count > 1) {
            int c = 1;
            while (c != k) {
                if (!vis[ptr]) {
                    c++;
                }
                ptr++;
                ptr %= n;
            }
            while (vis[ptr]) {
                ptr++;
                ptr %= n;
            }
            vis[ptr] = true;
            count--;
        }

        for (int i = 0; i < n; i++) {
            if (!vis[i]) {
                return i + 1;
            }
        }

        return 0;
    }
}
