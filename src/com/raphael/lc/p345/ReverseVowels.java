package com.raphael.lc.p345;

/**
 * @author raphael
 * @date 2021-02-07 21:44:32
 */
class ReverseVowels {
    /**
     * Description for ReverseVowels:
     */
    public String reverseVowels(String s) {
        // code
        char[] chars = s.toCharArray();
        int left = 0, right = s.length() - 1;

        while (left < right) {
            while (left < right && isVowel(chars[left])) {
                left++;
            }
            while (left < right && isVowel(chars[right])) {
                right--;
            }
            if (left < right) {
                char tmp = chars[left];
                chars[left] = chars[right];
                chars[right] = tmp;
            }
            left++;
            right--;
        }
        return String.valueOf(chars);
    }

    private boolean isVowel(char c) {
        switch (c) {
            case 'a':
            case 'e':
            case 'i':
            case 'o':
            case 'u':
            case 'A':
            case 'E':
            case 'I':
            case 'O':
            case 'U':
                return false;
            default:
                return true;
        }
    }
}
