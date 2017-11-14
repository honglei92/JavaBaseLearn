package String;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class StringTest {
	public static void main(String[] args) {
		System.out.println(toDate("20170329 132324"));
		System.out.println("abc".intern());
		String str = "123";
		System.out.println(str.substring(0, 2));// 截取第0,1位
		System.out.println(str.substring(2, 3));// 截取第2位
		int a = 10;
		int b = -5;
		System.out.println(String.format("a = %s,b = %s", a, b));// 字符串拼接
		String info = "jike://test/test1queryId=1503975930185&authId=eyJhbGciOiJIUzI1NiJ9.eyJqdGkiOiJqd3QiLCJpYXQiOjE1MDM5NzU5NDEsImlzcyI6IjE0MDMyMUMxNDk2NTcyNjMwMDAwQGppa2Vjb21wYW55IiwiZXhwIjoxNTA2NjU0MzQxfQ.KBsCFBeQ15YMbE83u_zCzSAcUttn8TEL7epcCdheOes";
		System.out.println(getQueryId(info));// 字符串截取
		System.out.println("比价:" + CompareUtil.compareDouble("2.35%", "10.87%"));
		String ab = "1.2234123";
		System.out.println(getPointLength(ab) + "");
		System.out.println("value of:" + String.valueOf(-5));
	}

	private static String getQueryId(String info) {
		String temp = "";
		temp = info.substring(25, 38);
		return temp;
	}

	/**
	 * 字符串转指定格式时间
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

	/**
	 * @param ab
	 * @return 获取小数点后位数
	 */
	private static int getPointLength(String ab) {
		int length = ab.split("\\.")[1].length();
		return length;
	}
}
