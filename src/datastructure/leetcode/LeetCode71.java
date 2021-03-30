package datastructure.leetcode;

import java.util.Stack;

public class LeetCode71 {
    public static void main(String[] args) {
        String str = simplifyPath("/a/./b/../../c/");
        System.out.println(str);
    }

    public static String simplifyPath(String path) {
        Stack<String> stack = new Stack<>();
        String[] arr = path.split("/");
        for (int i = 0; i < arr.length; i++) {
            if (arr[i].equals("..")) {
                if (!stack.isEmpty())
                    stack.pop();
            } else {
                if (!"".equals(arr[i])&&!".".equals(arr[i]))
                    stack.push(arr[i]);
            }
        }
        StringBuffer stringBuffer = new StringBuffer();
        if (!stack.isEmpty()) {
            for (String string : stack) {
                stringBuffer.append("/");
                stringBuffer.append(string);
            }
            return stringBuffer.toString();
        } else {
            return "/";
        }
    }
}