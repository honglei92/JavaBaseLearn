package String;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class StringTest {
	public static void main(String[] args) {
		System.out.println(toDate("20170329 132324"));
		System.out.println("abc".intern());
		String str = "123456789";
		System.out.println(str.substring(0, 3));// 截取索引0到2的char
		int a = 10;
		int b = -5;
		System.out.println(String.format("a = %s,b = %s", a, b));// 取值加字符串拼接
	}

	/**
	 * 字符串转成想要的日期格式
	 * 
	 * @param str
	 * @return
	 */
	public static String toDate(String str) {
		SimpleDateFormat sdf = new SimpleDateFormat("yyyyMMdd HHmmss");
		SimpleDateFormat sdf1 = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		Date date = new Date();
		try {
			date = sdf.parse(str);
		} catch (ParseException e) {
			e.printStackTrace();
		}
		String str1 = sdf1.format(date);
		return str1;
	}
}
