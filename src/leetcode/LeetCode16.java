package leetcode;

import java.util.Arrays;

/**
 * 最接近的三数之和
 */
public class LeetCode16 {
    public static void main(String[] args) {
        System.out.println(System.currentTimeMillis());
        // int[] param = new int[] { -2, -1, 0, 1, 2 };
        int[] param = new int[] { -1, 0, 1, 2, -1, -4 };
        System.out.println(threeSumClosest(param, 1));
        System.out.println(System.currentTimeMillis());
    }

    public static int threeSumClosest(int[] nums, int target) {
        int length = nums.length;
        if (nums == null || length < 3) {
            return 0;
        }
        Arrays.sort(nums);
        int answer = nums[0] + nums[1] + nums[2];
        for (int i = 0; i < length; i++) {
            int start = i + 1;
            int end = length - 1;
            while (start < end) {
                int sum = nums[i] + nums[start] + nums[end];
                if (Math.abs(target - sum) < Math.abs(target - answer)) {
                    answer = sum;
                }
                if (sum > target) {
                    end--;
                } else if (sum < target) {
                    start++;
                } else {
                    return sum;
                }
            }
        }
        return answer;
    }
}
