package leetcode;

/**
 * 实现strStr()
 */
public class LeetCode28 {

    public static void main(String[] args) {
        System.out.println(System.currentTimeMillis());

        System.out.println(strStr("hello", "ll") + ",");
        System.out.println(System.currentTimeMillis());
    }

    public static int strStr(String haystack, String needle) {
        return haystack.indexOf(needle);
    }
}
