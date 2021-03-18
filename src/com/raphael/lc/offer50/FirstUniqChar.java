package com.raphael.lc.offer50;

import java.util.HashMap;
import java.util.Map;

/**
 * @author Raphael
 * @date 2021-03-18 11:27:08
 */
class FirstUniqChar {
    /**
     * Description for FirstUniqChar:
     * 第一个只出现一次的字符
     */
    public char firstUniqChar(String s) {
        // code
        Map<Character, Boolean> dic = new HashMap<>();
        char[] sc = s.toCharArray();
        for (char c : sc)
            dic.put(c, !dic.containsKey(c));
        for (char c : sc)
            if (dic.get(c)) return c;
        return ' ';
    }
}
