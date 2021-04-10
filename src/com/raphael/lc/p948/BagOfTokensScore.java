package com.raphael.lc.p948;

import java.util.Arrays;

/**
 * @author Raphael
 * @date 2021-04-10 10:11:59
 */
class BagOfTokensScore {
    /**
     * Description for BagOfTokensScore:
     * 令牌放置
     */
    public int bagOfTokensScore(int[] tokens, int p) {
        // code
        Arrays.sort(tokens);
        if (tokens.length == 0 || tokens[0] > p) return 0;

        int n = tokens.length;
        int left = 0, right = n - 1;
        int ans = 0;

        while (left <= right) {
            if (tokens[left] <= p) {
                p -= tokens[left++];
                ans++;
            } else if (left < right && p + tokens[right] >= tokens[left]) {
                p += tokens[right--];
                ans--;
            } else {
                break;
            }
        }

        return ans;
    }
}
