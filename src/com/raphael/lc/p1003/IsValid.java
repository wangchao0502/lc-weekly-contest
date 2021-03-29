package com.raphael.lc.p1003;

/**
 * @author Raphael
 * @date 2021-03-29 18:30:38
 */
class IsValid {
    /**
     * Description for IsValid:
     * 检查替换后的词是否有效
     */
    public boolean isValid(String s) {
        // code
        while (s.contains("abc")) {
            s = s.replace("abc", "");
        }
        return "".equals(s);
    }
}
