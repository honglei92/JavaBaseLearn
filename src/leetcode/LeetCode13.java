/*
 * @Author: honglei92 
 * @Date: 2021-08-01 16:08:16 
 * @Last Modified by: mikey.zhaopeng
 * @Last Modified time: 2021-08-01 16:40:14
 * 罗马数字转整数
 */
package leetcode;

import java.util.HashMap;
import java.util.Map;

import javax.lang.model.element.Element;

public class LeetCode13 {
    public static void main(String[] args) {
        System.out.println(romanToInt("XLXIVII"));
    }

    static Map<String, Integer> symbolValues = new HashMap<>() {
        {
            put("I", 1);
            put("V", 5);
            put("X", 10);
            put("L", 50);
            put("C", 100);
            put("D", 500);
            put("M", 1000);
        }
    };

    public static int romanToInt(String s) {
        int ans = 0;
        for (int i = 0; i < s.length(); i++) {
            int value = symbolValues.get(s.charAt(i) + "");
            if (i < s.length() - 1 && value < symbolValues.get(s.charAt(i + 1) + "")) {
                ans -= value;
            } else {
                ans += value;
            }
        }
        return ans;
    }
}
