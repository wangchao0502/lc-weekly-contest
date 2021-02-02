package com.raphael.lc.p151;

/**
 * @author raphael
 * @date 2021-02-02 16:15:57
 */
class ReverseWords {
    /**
     * Description for ReverseWords:
     * 翻转字符串里的单词
     */
    public String reverseWords(String s) {
        // code 两次翻转
        String[] strs = s.trim().split(" ");
        int n = strs.length;
        int left = 0, right = n - 1;

        while (left < right) {
            String tmp = strs[left];
            strs[left] = strs[right];
            strs[right] = tmp;
            left++;
            right--;
        }

        StringBuilder sb = new StringBuilder();
        for (String str : strs) {
            if (!"".equals(str)) {
                sb.append(sb.length() > 0 ? " " + str : str);
            }
        }

        return sb.toString();
    }
}
