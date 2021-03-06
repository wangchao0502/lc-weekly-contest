package com.raphael.lc.p67;

/**
 * @author Raphael
 * @date 2021-03-06 22:07:40
 */
class AddBinary {
    /**
     * Description for AddBinary:
     */
    public String addBinary(String a, String b) {
        // code
        StringBuilder sb = new StringBuilder();
        if (a.length() < b.length()) {
            String tmp = a;
            a = b;
            b = tmp;
        }

        int n = a.length();
        int m = b.length();
        int carry = 0;

        for (int i = 0; i < m; i++) {
            int x = (a.charAt(n - i - 1) - '0') + (b.charAt(m - i - 1) - '0') + carry;
            sb.append(x % 2);
            carry = x / 2;
        }
        for (int i = 0; i < n - m; i++) {
            int x = a.charAt(n - m - i - 1) - '0' + carry;
            sb.append(x % 2);
            carry = x / 2;
        }
        if (carry == 1) {
            sb.append('1');
        }
        sb.reverse();
        return sb.toString();
    }
}
