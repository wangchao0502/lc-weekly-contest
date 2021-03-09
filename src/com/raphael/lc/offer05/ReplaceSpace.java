package com.raphael.lc.offer05;

/**
 * @author Raphael
 * @date 2021-03-09 14:08:48
 */
class ReplaceSpace {
    /**
     * Description for ReplaceSpace:
     * 替换空格
     */
    public String replaceSpace(String s) {
        // code
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            sb.append(c == ' ' ? "%20" : c);
        }
        return sb.toString();
    }
}
