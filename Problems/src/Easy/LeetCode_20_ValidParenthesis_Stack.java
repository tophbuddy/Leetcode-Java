package Easy;

import java.util.*;

public class LeetCode_20_ValidParenthesis_Stack {
    public boolean isValid(String s) {
        if (s.length() == 1) return false;

        Stack<Character> stack = new Stack<>();
        stack.push(s.charAt(0));
        for (int i = 1; i < s.length(); i++) {
            char cur = s.charAt(i);
            if (!stack.isEmpty()) {
                if ((cur == ')' && stack.peek() == '(') || (cur == ']' && stack.peek() == '[') || (cur == '}' && stack.peek() == '{')) {
                    stack.pop();
                } else {
                    stack.push(cur);
                }
            } else {
                stack.push(cur);
            }
        }
        return stack.isEmpty();
    }
}
