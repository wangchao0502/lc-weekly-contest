package com.raphael.lc.p71;

import java.util.ArrayList;
import java.util.Stack;

/**
 * @author raphael
 * @date 2021-02-01 13:37:58
 */
class SimplifyPath {
    /**
     * Description for SimplifyPath:
     * 简化路径
     */
    public String simplifyPath(String path) {
        // "/a/./b/../../c/"
        Stack<String> stack = new Stack<>();

        // split by /
        String[] strs = path.split("/");
        for (String s : strs) {
            if ("..".equals(s)) {
                if (!stack.isEmpty()) {
                    stack.pop();
                }
            } else if (!"".equals(s) && !".".equals(s)) {
                stack.push(s);
            }
        }

        return "/" + String.join("/", stack);
    }
}
