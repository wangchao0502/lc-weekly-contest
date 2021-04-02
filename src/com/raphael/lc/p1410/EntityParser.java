package com.raphael.lc.p1410;

import java.util.HashMap;
import java.util.Map;

/**
 * @author Raphael
 * @date 2021-04-02 11:53:41
 */
class EntityParser {
    /**
     * Description for EntityParser:
     * HTML实体解释器
     */
    public String entityParser(String text) {
        if (text == null || text.length() < 4) return text;

        Map<String, String> match = getMap();
        StringBuilder result = new StringBuilder();

        char[] arr = text.toCharArray();
        int k = 0, n = text.length();

        while (k < n) {
            while (k < n && arr[k] != '&') result.append(arr[k++]);
            if (k == n) break;

            int begin = k;
            while (k < n && arr[k] != ';') k++;

            // k==n,则表示没有找到';',直接拼接
            if (k == n) {
                result.append(text, begin, k);
                break;
            }

            // 是否与能在match中找到对应的转换字符，若能则转换并拼接
            // 否则，直接拼接
            String element = match.get(text.substring(begin, k + 1));
            if (element == null) result.append(text, begin, k + 1);
            else result.append(element);
            k++;
        }

        return result.toString();
    }

    public Map<String, String> getMap() {
        Map<String, String> result = new HashMap<>(16);
        result.put("&quot;", "\"");
        result.put("&apos;", "'");
        result.put("&amp;", "&");
        result.put("&gt;", ">");
        result.put("&lt;", "<");
        result.put("&frasl;", "/");
        return result;
    }
}
