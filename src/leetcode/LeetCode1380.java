package leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * 矩阵中的幸运数
 */
public class LeetCode1380 {
    public static void main(String[] args) {
        System.out.println(System.currentTimeMillis());
        int[][] param = new int[][] { { 3, 7, 8 }, { 9, 11, 13 }, { 15, 16, 17 } };

        List<Integer> result = luckyNumbers(param);
        for (int i = 0; i < result.size(); i++) {
            System.out.print(result.get(i) + ",");
        }
        System.out.println(System.currentTimeMillis());
    }

    public static List<Integer> luckyNumbers(int[][] matrix) {
        List<Integer> list = new ArrayList<>();
        int[] row = new int[matrix.length];
        int[] column = new int[matrix[0].length];
        for (int i = 0; i < matrix.length; i++) {
            row[i] = 10001;
            for (int j = 0; j < matrix[0].length; j++) {
                row[i] = Math.min(row[i], matrix[i][j]);
                column[j] = Math.max(column[j], matrix[i][j]);
            }
        }
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                if (matrix[i][j] == row[i] && matrix[i][j] == column[j]) {
                    list.add(matrix[i][j]);
                }
            }
        }
        return list;
    }
}
