package com.raphael.lc.weekly234.p5714;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author Raphael
 * @date 2021-03-28 10:52:29
 */
class Evaluate {
    /**
     * Description for Evaluate:
     * 替换字符串中的括号内容
     */
    public String evaluate(String s, List<List<String>> knowledge) {
        // code
        Map<String, String> map = new HashMap<>(16);
        for (List<String> item : knowledge) {
            map.put(item.get(0), item.get(1));
        }

        StringBuilder sb = new StringBuilder();
        int i = 0;

        while (i < s.length()) {
            char c = s.charAt(i);
            if (c == '(') {
                // get key
                StringBuilder key = new StringBuilder();
                i++;
                while (s.charAt(i) != ')') {
                    key.append(s.charAt(i));
                    i++;
                }

                sb.append(map.getOrDefault(key.toString(), "?"));
            } else {
                sb.append(c);
            }
            i++;
        }

        return sb.toString();
    }
}
