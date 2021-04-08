package com.raphael.lc.p874;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/**
 * @author Raphael
 * @date 2021-04-08 11:57:29
 */
class RobotSim {
    /**
     * Description for RobotSim:
     * 模拟行走机器人
     */
    public int robotSim(int[] commands, int[][] obstacles) {
        // code
        Map<Integer, Set<Integer>> obs = new HashMap<>();
        for (int[] o : obstacles) {
            obs.computeIfAbsent(o[0], x -> new HashSet<>()).add(o[1]);
        }

        int[][] directions = {{0, 1}, {1, 0}, {0, -1}, {-1, 0}};
        int dir = 0;
        int ans = 0;
        int[] cur = {0, 0};

        for (int cmd : commands) {
            if (cmd == -2) {
                dir = dir == 0 ? 3 : --dir;
            } else if (cmd == -1) {
                dir = dir == 3 ? 0 : ++dir;
            } else {
                for (int i = 0; i < cmd; i++) {
                    cur[0] += directions[dir][0];
                    cur[1] += directions[dir][1];
                    if (obs.containsKey(cur[0]) && obs.get(cur[0]).contains(cur[1])) {
                        cur[0] -= directions[dir][0];
                        cur[1] -= directions[dir][1];
                        break;
                    } else {
                        ans = Math.max(ans, cur[0] * cur[0] + cur[1] * cur[1]);
                    }
                }
            }
        }

        return ans;
    }
}
