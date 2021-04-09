package com.raphael.lc.p944;

/**
 * @author Raphael
 * @date 2021-04-09 18:08:56
 */
class MinDeletionSize {
    /**
     * Description for MinDeletionSize:
     * 删列造序
     */
    public int minDeletionSize(String[] strs) {
        // code
        int ans = 0;
        for (int c = 0; c < strs[0].length(); ++c)
            for (int r = 0; r < strs.length - 1; ++r)
                if (strs[r].charAt(c) > strs[r + 1].charAt(c)) {
                    ans++;
                    break;
                }

        return ans;
    }
}
