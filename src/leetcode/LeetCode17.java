package leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * 电话号码的字母组合
 */
public class LeetCode17 {
    public static void main(String[] args) {
        System.out.println(System.currentTimeMillis());
        String param = "23";
        for (int i = 0; i < letterCombinations(param).size(); i++) {
            System.out.println(letterCombinations(param).get(i));
        }
        System.out.println(System.currentTimeMillis());
    }

    static String letterMap[] = {
            " ",
            "",
            "abc",
            "def",
            "ghi",
            "jkl",
            "mno",
            "pqrs",
            "tuv",
            "wxyz"
    };
    static List<String> list = new ArrayList<>();

    public static List<String> letterCombinations(String digits) {

        if (digits == null || "".equals(digits.trim())) {
           return list;
        }
        findConbination(digits, 0, "");// 首次为空字符串
        return list;
    }

    private static void findConbination(String digits, int index, String s) {
        if (index == digits.length()) {
            list.add(s);
            return;// 已追加最后一位
        }
        Character character = digits.charAt(index);
        String letters = letterMap[character - '0'];
        for (int i = 0; i < letters.length(); i++) {
            findConbination(digits, index + 1, s + letters.charAt(i));
        }
        return;
    }
}
