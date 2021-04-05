package com.raphael.lc.p1598;

import java.util.Stack;

/**
 * @author Raphael
 * @date 2021-04-05 10:46:15
 */
class MinOperations {
    /**
     * Description for MinOperations:
     * 文件夹操作日志搜集器
     */
    public int minOperations(String[] logs) {
        // code
        Stack<String> stack = new Stack<>();

        for (String log: logs) {
            if ("./".equals(log)) {
                continue;
            }
            if (!stack.isEmpty()) {
                if ("../".equals(log)){
                    stack.pop();
                } else {
                    stack.push(log);
                }
            } else if (!"../".equals(log)) {
                stack.push(log);
            }
        }

        return stack.size();
    }
}
