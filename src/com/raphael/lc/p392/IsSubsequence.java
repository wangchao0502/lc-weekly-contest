package com.raphael.lc.p392;

/**
 * @author Raphael
 * @date 2021-03-05 16:49:34
 */
class IsSubsequence {
    /**
     * Description for IsSubsequence:
     * 判断子序列
     */
    public boolean isSubsequence(String s, String t) {
        // code
        int ptrS = 0, ptrT = 0;
        int slen = s.length(), tlen = t.length();

        while (ptrS < slen && ptrT < tlen) {
            if (s.charAt(ptrS) == t.charAt(ptrT)) {
                ptrS++;
            }
            ptrT++;
        }

        return ptrS == slen;
    }
}
