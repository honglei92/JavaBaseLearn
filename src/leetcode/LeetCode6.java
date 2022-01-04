package leetcode;

/**
 * Z字形转换
 */
public class LeetCode6 {
    public static void main(String[] args) {
        System.out.println(System.currentTimeMillis());
        System.out.println(convert("PAYPALISHARING", 3));
        System.out.println(System.currentTimeMillis());
    }

    public static String convert(String s, int numRows) {
        if (numRows == 1) {
            return s;
        }
        String[] rows = new String[numRows];
        for (int i = 0; i < numRows; i++) {
            rows[i] = "";
        }
        boolean down = true;
        int location = 0;
        for (int i = 0; i < s.length(); i++) {
            if (location == 0) {
                down = true;
            }
            if (location == numRows - 1) {
                down = false;
            }
            rows[location] += s.charAt(i);
            if (down) {
                location++;
            } else {
                location--;
            }

        }
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < numRows; i++) {
            stringBuilder.append(rows[i]);
        }
        return stringBuilder.toString();
    }
}
