package com.raphael.lc.p936;

import java.util.*;

/**
 * @author Raphael
 * @date 2021-04-21 11:13:18
 */
class MovesToStamp {
    /**
     * Description for MovesToStamp:
     * 戳印序列
     */
    public int[] movesToStamp(String stamp, String target) {
        // code
        int m = stamp.length();
        int n = target.length();
        int countDown = n * 10;
        List<Integer> ansList = new ArrayList<>();
        StringBuilder content = new StringBuilder(target);
        StringBuilder allMark = new StringBuilder();

        for (int i = 0; i < n; i++) {
            allMark.append('?');
        }

        Set<Integer> vis = new HashSet<>();
        int[] nextLetter = new int[n];

        for (int i = 0; i < n; i++) {
            nextLetter[i] = i + 1;
        }

        while (countDown >= 0 && !content.toString().equals(allMark.toString())) {
            // match
            int i = 0;
            for (; i <= n - m; i++) {
                if (vis.contains(i)) continue;
                boolean hasLetter = false;
                int j = content.charAt(i) == '?' ? nextLetter[i] - i : 0;
                while (j < m) {
                    char cs = stamp.charAt(j);
                    char cc = content.charAt(i + j);
                    if (cs != cc) break;
                    hasLetter = true;
                    j = nextLetter[i + j] - i;
                }
                if (j >= m && hasLetter) {
                    vis.add(i);
                    ansList.add(i);
                    break;
                }
            }
            if (i != n - m + 1) {
                for (int j = i; j < i + m; j++) {
                    content.setCharAt(j, '?');
                    nextLetter[j] = nextLetter[i + m - 1];
                }
                if (i != 0) {
                    nextLetter[i - 1] = nextLetter[i + m - 1];
                }
            }
            countDown--;
        }

        if (countDown < 0) {
            return new int[]{};
        }

        Collections.reverse(ansList);
        int[] ans = new int[ansList.size()];

        for (int i = 0; i < ansList.size(); i++) {
            ans[i] = ansList.get(i);
        }

        return ans;
    }
}
