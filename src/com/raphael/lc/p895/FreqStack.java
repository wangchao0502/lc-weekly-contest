package com.raphael.lc.p895;

import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

/**
 * @author Raphael
 * @date 2021-04-06 11:43:32
 */
class FreqStack {
    /**
     * Description for FreqStack:
     * 最大频率栈
     */

    Map<Integer, Integer> freq;
    Map<Integer, Stack<Integer>> group;
    int maxFreq;

    public FreqStack() {
        freq = new HashMap<>(16);
        group = new HashMap<>(16);
        maxFreq = 0;
    }

    public void push(int val) {
        int f = freq.getOrDefault(val, 0) + 1;
        freq.put(val, f);
        if (f > maxFreq) maxFreq = f;
        group.computeIfAbsent(f, x -> new Stack<>()).push(val);
    }

    public int pop() {
        int val = group.get(maxFreq).pop();
        freq.put(val, freq.get(val) - 1);
        if (group.get(maxFreq).size() == 0) maxFreq--;
        return val;
    }
}
