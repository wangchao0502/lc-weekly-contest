package com.raphael.lc.offer20;

/**
 * @author Raphael
 * @date 2021-03-15 14:45:48
 */
class IsNumber {
    /**
     * Description for IsNumber:
     * 表示数值的字符串
     */
    int index = 0;

    private boolean scanUnsignedInteger(String str) {
        int before = index;
        while (str.charAt(index) >= '0' && str.charAt(index) <= '9')
            index++;
        return index > before;
    }

    private boolean scanInteger(String str) {
        if (str.charAt(index) == '+' || str.charAt(index) == '-')
            index++;
        return scanUnsignedInteger(str);
    }

    public boolean isNumber(String s) {
        if (s == null || s.length() == 0)
            return false;
        index = 0;
        s = s + '|';
        while (s.charAt(index) == ' ')
            index++;
        boolean numeric = scanInteger(s);
        if (s.charAt(index) == '.') {
            index++;
            numeric = scanUnsignedInteger(s) || numeric;
        }
        if ((s.charAt(index) == 'E' || s.charAt(index) == 'e')) {
            index++;
            numeric = numeric && scanInteger(s);
        }
        while (s.charAt(index) == ' ')
            index++;
        return numeric && s.charAt(index) == '|';
    }
}
