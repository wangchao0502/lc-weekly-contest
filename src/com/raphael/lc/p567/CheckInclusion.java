package com.raphael.lc.p567;

/**
 * @author raphael
 * @date 2021-02-10 10:08:45
 */
class CheckInclusion {
    /**
     * Description for CheckInclusion:
     * 字符串排列
     */
    public boolean checkInclusion(String s1, String s2) {
        // code
        char[] parttern = s1.toCharArray();
        char[] text = s2.toCharArray();

        int pLen = s1.length();
        int tLen = s2.length();

        int[] pFreq = new int[26];
        int[] winFreq = new int[26];

        for (int i = 0; i < pLen; i++) {
            pFreq[parttern[i] - 'a']++;
        }

        int pCount = 0;
        for (int i = 0; i < 26; i++) {
            if (pFreq[i] > 0) {
                pCount++;
            }
        }

        int left = 0, right = 0;
        int winCount = 0;
        while (right < tLen) {
            int rc = text[right] - 'a';
            if (pFreq[rc] > 0) {
                winFreq[rc]++;
                if (winFreq[rc] == pFreq[rc]) {
                    winCount++;
                }
            }
            right++;

            while (pCount == winCount) {
                int lc = text[left] - 'a';
                // 中间可能有其他字符
                if (right - left == pLen) {
                    return true;
                }
                if (pFreq[lc] > 0) {
                    winFreq[lc]--;
                    if (winFreq[lc] < pFreq[lc]) {
                        winCount--;
                    }
                }
                left++;
            }
        }
        return false;
    }
}
