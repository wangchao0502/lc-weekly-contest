package com.raphael.lc.p93;

import java.util.ArrayList;
import java.util.List;

/**
 * @author raphael
 * @date 2021-02-16 12:27:21
 */
class RestoreIpAddresses {
    /**
     * Description for RestoreIpAddresses:
     * 复原IP地址
     */

    List<String> ans;

    private void backtracking(List<String> list, int start, char[] chars) {
        if (list.size() == 4) {
            if (start == chars.length && checkIp(list)) {
                ans.add(getIp(list));
            }
            return;
        }

        for (int i = start; i < chars.length; i++) {
            StringBuilder sb = new StringBuilder();
            for (int j = start; j <= i; j++) {
                sb.append(chars[j]);
            }
            if (sb.length() > 1 && sb.charAt(0) == '0') {
                continue;
            }
            list.add(sb.toString());
            backtracking(list, i + 1, chars);
            list.remove(list.size() - 1);
        }
    }

    private String getIp(List<String> list) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < list.size(); i++) {
            if (i != 0) {
                sb.append(".");
            }
            sb.append(list.get(i));
        }
        return sb.toString();
    }

    private boolean checkIp(List<String> list) {
        for (String s : list) {
            if (s.length() > 3 || Integer.parseInt(s) > 255) {
                return false;
            }
        }
        return true;
    }

    public List<String> restoreIpAddresses(String s) {
        // code
        ans = new ArrayList<>();
        if (s.length() > 16) {
            return ans;
        }
        char[] chars = s.toCharArray();
        List<String> list = new ArrayList<>();
        backtracking(list, 0, chars);
        return ans;
    }
}
