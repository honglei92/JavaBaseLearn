
package net.socket.tcp;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.net.Socket;

public class TCPClient {
	public static void main(String[] args) throws IOException {
		for (int i = 0; i < 10; i++) {
			onClient(i);
		}
	}

	private static void onClient(int i) throws IOException {
		Socket socket = new Socket("localhost", 13982);
		OutputStream os = socket.getOutputStream();
		PrintWriter pw = new PrintWriter(os);
		pw.write("用户名:admin密码:123");
		pw.flush();
		socket.shutdownOutput();
		InputStream is = socket.getInputStream();
		BufferedReader br = new BufferedReader(new InputStreamReader(is));
		String info = null;
		while ((info = br.readLine()) != null) {
			System.out.println("���ǿͻ��ˣ�������˵:" + "==" + i + "==" + info);
		}
		br.close();
		is.close();
		pw.close();
		os.close();
		socket.close();
	}

}
