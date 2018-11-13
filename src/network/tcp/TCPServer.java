package network.tcp;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * 服务端
 */
public class TCPServer {
    public static void main(String[] args) throws IOException {
        for (int i = 0; i < 10; i++) {
            onServer(i);
        }
    }

    private static void onServer(int i) throws IOException {
        ServerSocket serverSocket = new ServerSocket(13982);
        Socket socket = serverSocket.accept();
        //收消息
        InputStream is = socket.getInputStream();
        InputStreamReader isr = new InputStreamReader(is);
        BufferedReader br = new BufferedReader(isr);
        String info;
        while ((info = br.readLine()) != null) {
            System.out.println("我是服务器,收到信息:" + i + "==" + info);
        }
        socket.shutdownInput();
        //发消息
        OutputStream os = socket.getOutputStream();
        PrintWriter pw = new PrintWriter(os);
        pw.write("现在是："+System.currentTimeMillis());
        pw.flush();
        //关闭连接
        pw.close();
        os.close();
        br.close();
        isr.close();
        is.close();
        socket.close();
        serverSocket.close();
    }
}
