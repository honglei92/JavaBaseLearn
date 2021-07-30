package datastructure.leetcode;

public class LeetCode7 {
    public static void main(String[] args) {
        System.out.println(code(-123));
    }

    public static int code(int x) {
        StringBuffer stringBuffer = new StringBuffer();
        String resource = String.valueOf(x);
        if (x < 0) {
            for (int j = 1; j < resource.length(); j++) {
                if (j > 1 && (Integer.parseInt(stringBuffer.toString()) > Integer.MAX_VALUE / 10
                        || Integer.parseInt(stringBuffer.toString()) * 10 + Integer.parseInt(
                                String.valueOf(resource.charAt(resource.length() - j))) > Integer.MAX_VALUE)) {
                    return 0;
                }
                stringBuffer.append(resource.charAt(resource.length() - j));
            }
            return -Integer.parseInt(stringBuffer.toString());
        } else if (x == 0) {
            return 0;
        } else {
            for (int j = 0; j < resource.length(); j++) {
                if (j > 0 && (Integer.parseInt(stringBuffer.toString()) > Integer.MAX_VALUE / 10
                        || Integer.parseInt(stringBuffer.toString()) * 10 + Integer.parseInt(
                                String.valueOf(resource.charAt(resource.length() - 1 - j))) > Integer.MAX_VALUE)) {
                    return 0;
                }
                stringBuffer.append(resource.charAt(resource.length() - 1 - j));
            }
            return Integer.parseInt(stringBuffer.toString());
        }
    }
}
