package leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * 有序数组中的单一元素
 */
public class LeetCode540 {
    public static void main(String[] args) {
        System.out.println(System.currentTimeMillis());
        int[] param = new int[] { 3, 3, 8, 8, 9, 13, 13, 16, 16 };
        System.out.println(singleNonDuplicate(param) + "!");
        System.out.println(System.currentTimeMillis());
    }

    public static int singleNonDuplicate(int[] nums) {
        for (int i = 0; i < nums.length - 1; i += 2) {
            if (nums[i] != nums[i + 1]) {
                return nums[i];
            }
        }
        return nums[nums.length - 1];
    }
}
