package com.raphael.lc.p150;

import java.util.Stack;

/**
 * @author Raphael
 * @date 2021-03-20 10:53:23
 */
@SuppressWarnings("AlibabaLowerCamelCaseVariableNaming")
class EvalRPN {
    /**
     * Description for EvalRPN:
     * 逆波兰表达式求值
     */

    private Integer parseNumber(String token) {
        try {
            return Integer.parseInt(token);
        } catch (Exception e) {
            return null;
        }
    }

    public int evalRPN(String[] tokens) {
        // code
        Stack<Integer> stack = new Stack<>();

        for (String token : tokens) {
            Integer num = parseNumber(token);
            if (num != null) {
                stack.push(num);
            } else {
                int a = stack.pop();
                int b = stack.pop();

                switch (token) {
                    case "+":
                        stack.push(a + b);
                        break;
                    case "-":
                        stack.push(b - a);
                        break;
                    case "*":
                        stack.push(a * b);
                        break;
                    case "/":
                        stack.push(b / a);
                        break;
                    default:
                }
            }
        }

        return stack.pop();
    }
}
