package com.raphael.lc.p735;

import java.util.Stack;

/**
 * @author Raphael
 * @date 2021-03-26 10:36:20
 */
class AsteroidCollision {
    /**
     * Description for AsteroidCollision:
     * 行星碰撞
     */
    public int[] asteroidCollision(int[] asteroids) {
        // code
        if (asteroids.length < 2) return asteroids;

        Stack<Integer> stack = new Stack<>();

        for (int curr : asteroids) {
            if (stack.isEmpty()) {
                stack.push(curr);
                continue;
            }
            while (!stack.isEmpty() && stack.peek() > 0 && curr < 0) {
                int prev = stack.pop();
                if (prev == -curr) {
                    curr = 0;
                } else {
                    curr = prev > -curr ? prev : curr;
                }
            }
            if (curr != 0) {
                stack.push(curr);
            }
        }

        int[] ans = new int[stack.size()];
        for (int i = 0; i < stack.size(); i++) {
            ans[i] = stack.get(i);
        }

        return ans;
    }
}
