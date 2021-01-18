package com.raphael.lc.p43;

import java.util.Arrays;

/**
 * @author raphael
 * @date 2021-01-18 21:31:33
 */
class Multiply {
    /**
     * Description for Multiply:
     * 给定两个以字符串形式表示的非负整数 num1 和 num2，返回 num1 和 num2 的乘积，它们的乘积也表示为字符串形式。
     */
    public String multiply(String num1, String num2) {
        // code
        char[] n1 = num1.toCharArray();
        char[] n2 = num2.toCharArray();
        int len = n1.length + n2.length + 1;
        int[] n3 = new int[len];
        // make n1 is longer
        if (n1.length < n2.length) {
            char[] tmp = n1;
            n1 = n2;
            n2 = tmp;
        }

        for (int i = 1; i <= n2.length; i++) {
            int[] item = new int[len];
            int a = n2[n2.length - i] - '0';
            // 进位
            int c = 0;
            for (int j = 1; j <= n1.length; j++) {
                int b = n1[n1.length - j] - '0';
                int mul = a * b;
                item[len - i - j + 1] = (mul + c) % 10;
                c = (mul + c) / 10;
            }
            item[len - i - n1.length] = c;
            // sum with n3
            int k = len - 1;
            c = 0;
            while (k >= 0) {
                int sum = n3[k] + item[k] + c;
                c = sum / 10;
                n3[k] = sum % 10;
                k--;
            }
        }

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < len; i++) {
            if (sb.length() != 0 || n3[i] != 0) {
                sb.append(n3[i]);
            }
        }

        return sb.length() == 0 ? "0" : sb.toString();
    }
}
