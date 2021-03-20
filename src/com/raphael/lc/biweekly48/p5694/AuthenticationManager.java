package com.raphael.lc.biweekly48.p5694;

import java.util.HashMap;
import java.util.Map;

/**
 * @author Raphael
 * @date 2021-03-20 22:43:12
 */
class AuthenticationManager {
    /**
     * Description for AuthenticationManager:
     */

    Map<String, Integer> cache;
    int timeToLive;

    public AuthenticationManager(int timeToLive) {
        this.timeToLive = timeToLive;
        cache = new HashMap<>(16);
    }

    public void generate(String tokenId, int currentTime) {
        cache.put(tokenId, currentTime);
    }

    public void renew(String tokenId, int currentTime) {
        Integer generateTime = cache.get(tokenId);
        if (generateTime != null && generateTime + this.timeToLive > currentTime) {
            cache.put(tokenId, currentTime);
        }
    }

    public int countUnexpiredTokens(int currentTime) {
        int count = 0;
        for (String key : cache.keySet()) {
            Integer generateItme = cache.get(key);
            if (generateItme != null && generateItme + this.timeToLive > currentTime) {
                count++;
            }
        }
        return count;
    }
}
