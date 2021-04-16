package com.raphael.lc.lcp01;

/**
 * @author Raphael
 * @date 2021-04-16 15:01:54
 */
class Game {
    /**
     * Description for Game:
     * 猜数字
     */
    public int game(int[] guess, int[] answer) {
        // code
        int i = 0;
        int ans = 0;

        while (i < 3) {
            if (guess[i] == answer[i]) ans++;
            i++;
        }

        return ans;
    }
}
