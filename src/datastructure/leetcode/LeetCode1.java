package datastructure.leetcode;

public class LeetCode1 {
    public static void main(String[] args) {
        System.out.println(System.currentTimeMillis());
        twoSum(new int[] { 1, 3, 5, 6, 2, 4, 3, 7 }, 10);
        System.out.println(System.currentTimeMillis());
    }

    public static int[] twoSum(int[] is, int target) {
        for (int j = 0; j < is.length; j++) {
            for (int j2 = 0; j2 < is.length; j2++) {
                if (j != j2 && is[j] + is[j2] == target) {
                    System.out.println(j + ":" + is[j] + ";  " + j2 + ":" + +is[j2]);
                    return new int[] { j, j2 };
                }
            }
        }
        return new int[] { 0 };
    }
}
