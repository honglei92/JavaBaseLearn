package leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * 四数之和
 */
public class LeetCode18 {
    public static void main(String[] args) {
        System.out.println(System.currentTimeMillis());
        int[] param = new int[] { 0, -1, -3, -5, 5 };//1
        // int[] param = new int[] { 0, 0, 0, 1000000000, 1000000000, 1000000000,
        // 1000000000 };// 1000000000
        // int[] param = new int[] { 0, 0, 0, -1000000000, -1000000000, -1000000000,
        // -1000000000 };// -1000000000
        // int[] param = new int[] { 2, 1, 0, -1 };// 2
        List<List<Integer>> result = fourSum(param, 1);
        for (int i = 0; i < result.size(); i++) {
            for (int j = 0; j < result.get(i).size(); j++) {
                System.out.print(result.get(i).get(j) + ",");
            }
            System.out.println("  ");
        }
        System.out.println(System.currentTimeMillis());
    }

    public static List<List<Integer>> fourSum(int[] nums, int target) {
        List<List<Integer>> list = new ArrayList<>();
        int length = nums.length;
        if (nums == null || length < 4) {
            return list;
        }
        Arrays.sort(nums);// 数组排序
        for (int i = 0; i < length - 3; i++) {
            System.out.println("1");
            if (i > 0 && nums[i] == nums[i - 1]) {// 去重
                System.out.println("2");
                continue;
            }
            // 获取当前最小值
            int min = getSum(nums[i], nums[i + 1], nums[i + 2], nums[i + 3]);
            if (min > target) {
                System.out.println("3");
                break;
            }
            // 获取当前最大值
            long max = getSum(nums[i], nums[length - 3], nums[length - 2], nums[length - 1]);
            if (max < target) {
                System.out.println("4" + max);
                continue;
            }
            // 第二层循环，初始值指向i+1
            for (int j = i + 1; j < length - 2; j++) {
                // 当j的值与前面的值相等时忽略
                if (j > i + 1 && nums[j] == nums[j - 1]) {
                    System.out.println("5");
                    continue;
                }
                // 定义直针k指向j+1
                int k = j + 1;
                // 定义指针h指向length-1
                int h = length - 1;
                // 获取当前最小值
                int min1 = getSum(nums[i], nums[k], nums[j], nums[k + 1]);
                if (min1 > target) {
                    System.out.println("6");
                    break;
                }
                // 获取当前最大值
                int max1 = getSum(nums[i], nums[j], nums[h], nums[h - 1]);
                if (max1 < target) {
                    System.out.println("7");
                    continue;
                }
                while (k < h) {
                    int sum = getSum(nums[i], nums[j], nums[k], nums[h]);
                    if (sum == target) {
                        list.add(Arrays.asList(nums[i], nums[j], nums[k], nums[h]));
                        k++;
                        while (k < h && nums[k] == nums[k - 1]) {
                            k++;
                        }
                        h--;
                        while (k < h && j < h && nums[h] == nums[h + 1]) {
                            h--;
                        }
                    } else if (sum < target) {
                        k++;
                    } else if (sum > target) {
                        h--;
                    }
                }
            }
        }
        return list;
    }

    private static int getSum(int num1, int num2, int num3, int num4) {
        int sum1 = 0, sum2 = 0, sum3 = 0;
        if (num1 <= 0 && num2 <= 0) {
            if (Integer.MIN_VALUE - num1 - num2 > 0) {
                sum1 = Integer.MIN_VALUE;
            } else {
                sum1 = num1 + num2;
            }
        }
        if (num1 <= 0 && num2 >= 0) {
            sum1 = num1 + num2;
        }
        if (num1 > 0 && num2 >= 0) {
            if (Integer.MAX_VALUE - num1 - num2 < 0) {
                return Integer.MAX_VALUE;
            } else {
                sum1 = num1 + num2;
            }
        }

        if (sum1 <= 0 && num3 <= 0) {
            if (Integer.MIN_VALUE - sum1 - num3 > 0) {
                sum2 = Integer.MIN_VALUE;
            } else {
                sum2 = sum1 + num3;
            }
        }
        if (sum1 <= 0 && num3 >= 0) {
            sum2 = sum1 + num3;
        }
        if (sum1 > 0 && num3 >= 0) {
            if (Integer.MAX_VALUE - sum1 - num3 < 0) {
                return Integer.MAX_VALUE;
            } else {
                sum2 = sum1 + num3;
            }
        }

        if (sum2 <= 0 && num4 <= 0) {
            if (Integer.MIN_VALUE - sum2 - num4 > 0) {
                sum3 = Integer.MIN_VALUE;
            } else {
                sum3 = sum2 + num4;
            }
        }
        if (sum2 <= 0 && num4 >= 0) {
            sum3 = sum2 + num4;
        }
        if (sum2 > 0 && num4 >= 0) {
            if (Integer.MAX_VALUE - sum2 - num4 < 0) {
                return Integer.MAX_VALUE;
            } else {
                sum3 = sum2 + num4;
            }
        }

        return sum3;
    }
}
