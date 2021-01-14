package com.raphael.lc.p38;

/**
 * @author raphael
 * @date 2021-01-14 19:43:27
 */
class CountAndSay {
    /**
     * Description for CountAndSay:
     * 给定一个正整数 n ，输出外观数列的第 n 项。
     */
    public String countAndSay(int n) {
        // code
        StringBuilder ans = new StringBuilder("1");
        if (n == 1) {
            return ans.toString();
        }

        for (int i = 2; i <= n; i++) {
            StringBuilder sb = new StringBuilder();
            char pre = ans.charAt(0);
            int count = 1;
            for (int j = 1; j < ans.length(); j++) {
                if (ans.charAt(j) != pre) {
                    sb.append(count);
                    sb.append(pre);
                    pre = ans.charAt(j);
                    count = 1;
                } else {
                    count++;
                }
            }
            sb.append(count);
            sb.append(pre);
            ans = sb;
        }

        return ans.toString();
    }
}
