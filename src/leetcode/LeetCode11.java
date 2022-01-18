package leetcode;

/**
 * 盛水最多的容器
 */
public class LeetCode11 {
    public static void main(String[] args) {
        System.out.println(System.currentTimeMillis());
        int res = maxArea(new int[] { 1, 8, 6, 2, 5, 4, 8, 3, 2 });
        System.out.println(res);
        System.out.println(System.currentTimeMillis());
    }

    public static int maxArea(int[] height) {
        int res = 0;
        int i = 0, j = height.length - 1;
        while (i < j) {
            res = height[i] < height[j] ? Math.max(res, (j - i) * height[i++]) : Math.max(res, (j - i) * height[j--]);
            System.out.println(res);
        }
        return res;
    }
}
