package leetcode;

public class LeetCode9 {
    public static void main(String[] args) {
        System.out.println(isPalindrome(-412214));
    }

    public static boolean isPalindrome(int x) {
        if (x > 0) {
            String s = String.valueOf(x);
            for (int i = 0; i < s.length() / 2; i++) {
                if (s.charAt(i) != s.charAt(s.length() - 1 - i)) {
                    return false;
                }
            }
            return true;
        } else if (x == 0) {
            return true;
        } else {
            return false;
        }
    }
}