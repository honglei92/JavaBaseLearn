/*
 * @Author: honglei92 
 * @Date: 2021-08-01 16:40:22 
 * @Last Modified by: mikey.zhaopeng
 * @Last Modified time: 2021-08-01 17:04:34
 * 最长公共前缀 
 */
package leetcode;

public class LeetCode14 {
    public static void main(String[] args) {
        System.out.println(getMaxLongSuff(new String[] { "abds", "abdsqwqwe", "abdsqweqwe" }));
    }

    public static String getMaxLongSuff(String[] strings) {
        StringBuilder suffix = new StringBuilder();
        for (int i = 1; i < Integer.MAX_VALUE; i++) {
            for (int j = 0; j < strings.length; j++) {
                if (strings[j].length() < i) {
                    return suffix.toString();
                }
            }
            char c = strings[0].charAt(i-1);
            for (int j = 0; j < strings.length; j++) {
                if (strings[j].charAt(i-1) != c) {
                    return suffix.toString();
                }
            }
            suffix.append(c);
        }
        return suffix.toString();
    }

}
