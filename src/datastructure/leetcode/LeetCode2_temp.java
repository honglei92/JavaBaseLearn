package datastructure.leetcode;

import java.util.HashMap;

public class LeetCode2_temp {
    public static void main(String[] args) {
        System.out.println(lengthOfLongestSubstring("pwwkew"));
    }

    public static int lengthOfLongestSubstring(String s) {
        if (s.length() == 0) {
            return 0;
        }
        int max = 0;// 最长不重复子串的长度
        int left = 0;// 字符串中滑动窗口左边的下标
        HashMap<Character, Integer> hashMap = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            if (hashMap.containsKey(s.charAt(i))) {
                // 如果子串含有字符 就把left往当前子串首位+1
                left = Math.max(left, hashMap.get(s.charAt(i)) + 1);
            }
            hashMap.put(s.charAt(i), i);
            // 当前子串 串尾的下标减去串头的下标 比如 2-4 就是 234 应该是下标之差+1,这里取最大值的意思是 前面已经滑出一个子串长度
            // 后面又滑出了，这是就两两比较取较长比如pwwkew 这里 pw 和wek
            max = Math.max(max, i - left + 1);
        }
        return max;
    }
}