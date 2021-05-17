package com.raphael.lc.p68;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author Raphael
 * @date 2021-05-17 11:10:42
 */
class FullJustify {
    /**
     * Description for FullJustify:
     * 文本左右对齐
     */
    public List<String> fullJustify(String[] words, int maxWidth) {
        List<Integer> index = new ArrayList<>();
        List<String> ans = new ArrayList<>();
        StringBuilder str = new StringBuilder();
        // 把单词挨个放到结果中去
        for (int i = 0; i < words.length; ++i) {
            if (str.length() + words[i].length() < maxWidth) {
                // 如果当前单词加入到当前的行中时，没有超过要求，直接放进来好了
                // 拼接当前行内容
                str.append(words[i]);
                // 然后记下来当前空格位置
                index.add(str.length());
                str.append(" ");
            } else if (str.length() + words[i].length() == maxWidth) {
                // 如果正好碰到了边界，那么就加进来当前单词后，放到最终的返回值中
                str.append(words[i]);
                ans.add(str.toString());
                // 然后清空当前的缓冲内容
                str = new StringBuilder();
                index.clear();
            } else {
                // 如果添加了当前单词后，超出了容量限制，就进行空格调整
                // 首先记录剩余多少空格
                int space = maxWidth - str.length();
                // 然后把最后一个空格去掉，把所有的空格放到中间去
                if (index.size() > 1) {
                    str.deleteCharAt(str.length() - 1);
                    index.remove(index.size() - 1);
                    space += 1;
                }
                // 计算每一个单词中间的空格基本个数（every），以及额外的空格 （remain）
                int every = 0, remain = 0;
                if (!index.isEmpty()) {
                    every = space / index.size();
                    remain = space % index.size();
                }
                // 从后往前进行空格插入，这样方便计算下标在哪里
                for (int j = index.size() - 1; j >= 0; --j) {
                    char[] cs = new char[every + (j < remain ? 1 : 0)];
                    Arrays.fill(cs, ' ');
                    str.insert(index.get(j), new String(cs));
                }
                // 然后放到返回值中
                ans.add(str.toString());
                str = new StringBuilder();
                index.clear();
                --i;
            }
        }
        // 对剩余的单词进行空格拼接
        if (str.length() > 0) {
            if (str.length() < maxWidth) {
                char[] cs = new char[maxWidth - str.length()];
                Arrays.fill(cs, ' ');
                str.append(new String(cs));
            }
            ans.add(str.toString());
        }
        return ans;
    }
}
