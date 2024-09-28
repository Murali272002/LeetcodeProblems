package com.strings;

import java.util.Stack;

public class ValidParentheses {
    public static void main(String[] args){
        ValidParentheses solution = new ValidParentheses();
        String input = "({})(";
        System.out.println(solution.checkValidString(input));
    }
    public boolean checkValidString(String inputStr) {
        Stack<Character> stk = new Stack<Character>();

        for (char ch : inputStr.toCharArray())
        {
// for any type of opening bracket
// the same type of closing bracket should
// be present
            if (ch == '(')
            {
                stk.push(')');
            }
            else if (ch == '{')
            {
                stk.push('}');
            }
            else if (ch == '[')
            {
                stk.push(']');
            }

            else if (stk.isEmpty() || stk.pop() != ch)
            {
// if the control reaches here
// then it means that either there is some extra
// opening or closing brackets
                return false;
            }
        }
        return stk.isEmpty();
    }
}
