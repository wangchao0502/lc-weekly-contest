package com.raphael.lc.p125;

/**
 * @author raphael
 * @date 2021-02-05 10:22:36
 */
class IsPalindrome {
    /**
     * Description for IsPalindrome:
     * 验证回文串
     */
    private boolean isDigitOrLetter(char c) {
        return Character.isLetter(c) || Character.isDigit(c);
    }

    @SuppressWarnings("AlibabaUndefineMagicConstant")
    public boolean isPalindrome(String s) {
        // code
        if (s.length() < 2) {
            return true;
        }
        int n = s.length();
        int left = 0, right = n - 1;

        s = s.toLowerCase();

        while (left < right) {
            while (left < right && !isDigitOrLetter(s.charAt(left))) {
                left++;
            }
            while (left < right && !isDigitOrLetter(s.charAt(right))) {
                right--;
            }
            if (s.charAt(left) != s.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }

        return true;
    }
}
