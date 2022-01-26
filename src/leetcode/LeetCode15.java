package leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * 三数之和
 */
public class LeetCode15 {
    public static void main(String[] args) {
        System.out.println(System.currentTimeMillis());
        // int[] param = new int[] { -2, -1, 0, 1, 2 };
        int[] param = new int[] { -1, 0, 1, 2, -1, -4 };
        for (int i = 0; i < threeSum(param).size(); i++) {
            for (int j = 0; j < threeSum(param).get(i).size(); j++) {
                System.out.print(threeSum(param).get(i).get(j) + ",");
            }
            System.out.println(" ");
        }
        System.out.println(System.currentTimeMillis());
    }

    public static List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> list = new ArrayList<>();
        int length = nums.length;
        if (nums == null || length < 3) {
            return list;
        }
        Arrays.sort(nums);
        for (int i = 0; i < length; i++) {
            if (nums[i] > 0) {
                break;
            }
            if (i > 0 && nums[i] == nums[i - 1]) {// 去重
                continue;
            }
            int L = i + 1;
            int R = length - 1;
            while (L < R) {
                int sum = nums[i] + nums[L] + nums[R];
                if (sum == 0) {
                    list.add(Arrays.asList(nums[i], nums[L], nums[R]));
                    while (L < R && nums[L] == nums[L + 1]) {
                        L++;
                    }
                    while (L < R && nums[R] == nums[R - 1]) {
                        R--;
                    }
                    L++;
                    R--;
                } else if (sum < 0) {
                    L++;
                } else if (sum > 0) {
                    R--;
                }
            }
        }
        return list;
    }
}
