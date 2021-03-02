package com.raphael.lc.p168;

/**
 * @author Raphael
 * @date 2021-03-02 08:30:05
 */
class ConvertToTitle {
    /**
     * Description for ConvertToTitle:
     * Excel表列名称
     */
    public String convertToTitle(int n) {
        // code
        if (n <= 0) {
            return "";
        }
        StringBuilder sb = new StringBuilder();

        while (n > 0) {
            n--;
            sb.append((char) (n % 26 + 'A'));
            n /= 26;
        }

        return sb.reverse().toString();
    }
}
