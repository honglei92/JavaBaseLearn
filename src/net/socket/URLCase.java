package net.socket;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.URL;

public class URLCase {
	public static void main(String[] args) throws Exception {
		// testURL();
		readWebpageContent();
	}

	/**
	 * URL读取网页内容
	 * 
	 * @throws IOException
	 */
	private static void readWebpageContent() throws IOException {
		URL url = new URL("http://developer.51cto.com/art/201509/490775.htm");
		InputStream is = url.openStream();// openStream方法获取字节输入流
		InputStreamReader isr = new InputStreamReader(is, "UTF-8");// 将字节输入流转换成字符输入流
		BufferedReader br = new BufferedReader(isr);// 为字符输入添加缓冲，提高效率
		String data = br.readLine();// 读取数据
		while (data != null) {
			System.out.println(data);// 输出数据
			data = br.readLine();
		}
		br.close();// 关闭缓冲
		isr.close();// 关闭字符流
		is.close();// 关闭字节流
	}

	/**
	 * 测试URL
	 * 
	 * @throws Exception
	 */
	private static void testURL() throws Exception {
		URL baidu = new URL("http://www.baidu.com");
		baidu = new URL(baidu, "/index.html?username=tom#test");
		System.out.println(baidu.getProtocol());
		System.out.println(baidu.getHost());
		System.out.println(baidu.getPort());
		System.out.println(baidu.getPath());
		System.out.println(baidu.getFile());
		System.out.println(baidu.getRef());
		System.out.println(baidu.getQuery());
	}
}
