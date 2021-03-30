package datastructure.leetcode;

import java.util.Stack;
import java.util.Vector;


public class LeetCode20 {
    public static void main(String[] args) {
        System.out.println(isValid("{{}{}[]"));
    }

    public static boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '{' || s.charAt(i) == '[' || s.charAt(i) == '(') {// 左括弧进栈
                stack.push(s.charAt(i));
            }
            if (s.charAt(i) == '}' || s.charAt(i) == ']' || s.charAt(i) == ')') {// 右括弧进栈
                if (stack.empty()) {
                    return false;
                } else {
                    if (match(s.charAt(i), stack.lastElement())) {
                        stack.pop();
                    } else {
                        return false;
                    }
                }
            }
        }
        if (stack.isEmpty())
            return true;
        else
            return false;
    }

    private static boolean match(char charAt, Character firstElement) {
        if (charAt == ')' && firstElement.charValue() == '(') {
            return true;
        }
        if (charAt == '}' && firstElement.charValue() == '{') {
            return true;
        }
        if (charAt == ']' && firstElement.charValue() == '[') {
            return true;
        }
        return false;
    }
}