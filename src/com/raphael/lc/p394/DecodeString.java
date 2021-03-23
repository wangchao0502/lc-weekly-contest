package com.raphael.lc.p394;

import java.util.LinkedList;

/**
 * @author Raphael
 * @date 2021-03-23 21:35:01
 */
class DecodeString {
    /**
     * Description for DecodeString:
     * 字符串解码
     */
    public String decodeString(String s) {
        // code
        StringBuilder res = new StringBuilder();
        int multi = 0;
        LinkedList<Integer> stackMulti = new LinkedList<>();
        LinkedList<String> stackRes = new LinkedList<>();
        for (Character c : s.toCharArray()) {
            if (c == '[') {
                stackMulti.addLast(multi);
                stackRes.addLast(res.toString());
                multi = 0;
                res = new StringBuilder();
            } else if (c == ']') {
                StringBuilder tmp = new StringBuilder();
                int curMulti = stackMulti.removeLast();
                for (int i = 0; i < curMulti; i++) tmp.append(res);
                res = new StringBuilder(stackRes.removeLast() + tmp);
            } else if (c >= '0' && c <= '9') {
                multi = multi * 10 + Integer.parseInt(c + "");
            } else {
                res.append(c);
            }
        }
        return res.toString();
    }
}
