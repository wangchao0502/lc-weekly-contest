package com.raphael.lc.p726;

import java.util.*;

/**
 * @author Raphael
 * @date 2021-03-25 12:39:52
 */
class CountOfAtoms {
    /**
     * Description for CountOfAtoms:
     * 原子的数量
     */

    private String getNextAtom(char[] chars, int start) {
        StringBuilder sb = new StringBuilder();

        do {
            sb.append(chars[start++]);
        } while (start < chars.length && chars[start] <= 'z' && chars[start] >= 'a');

        return sb.toString();
    }

    private int getNextInteger(char[] chars, int start) {
        int ans = 0;

        do {
            ans = (ans * 10 + chars[start++] - '0');
        } while (start < chars.length && Character.isDigit(chars[start]));

        return ans;
    }

    public String countOfAtoms(String formula) {
        // code
        int n = formula.length();
        char[] chars = formula.toCharArray();
        Stack<Map<String, Integer>> stack = new Stack<>();
        Map<String, Integer> curr = new HashMap<>(16);
        int i = 0;
        while (i < chars.length) {
            if (chars[i] == '(') {
                stack.push(curr);
                curr = new HashMap<>(16);
                i++;
            } else if (chars[i] == ')') {
                i++;
                // 先merge一下
                int multi = 1;
                if (i < n && Character.isDigit(chars[i])) {
                    multi = getNextInteger(chars, i);
                    i += String.valueOf(multi).length();
                }
                Map<String, Integer> lastMap = stack.pop();
                for (String key : curr.keySet()) {
                    lastMap.put(key, lastMap.getOrDefault(key, 0) + curr.get(key) * multi);
                }
                curr = lastMap;
            } else {
                String atom = getNextAtom(chars, i);
                // 至少加一个
                i += atom.length();
                int count = 1;
                if (i < n && Character.isDigit(chars[i])) {
                    count = getNextInteger(chars, i);
                    i += String.valueOf(count).length();
                }
                curr.put(atom, curr.getOrDefault(atom, 0) + count);
            }
        }

        List<String[]> list = new ArrayList<>();
        for (String key : curr.keySet()) {
            list.add(new String[]{key, curr.get(key).toString()});
        }

        list.sort(Comparator.comparing(o -> o[0]));

        StringBuilder sb = new StringBuilder();
        for (String[] item : list) {
            sb.append(item[0]);
            if (Integer.parseInt(item[1]) > 1) {
                sb.append(item[1]);
            }
        }
        return sb.toString();
    }
}
