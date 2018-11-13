package network.udp;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;

public class UDPServer {
	public static void main(String[] args) throws IOException {
		onServer();
	}

	private static void onServer() throws IOException {
		DatagramSocket socket = new DatagramSocket(10010);
		// 创建数据报，用于接收客户端发送的数据
		byte[] data = new byte[1024];
		DatagramPacket packet = new DatagramPacket(data, data.length);
		socket.receive(packet);
		String info = new String(data, 0, data.length);
		System.out.println("i am server terminal， client said:" + info);

		// 向客户端发送数据
		// 定义客户端的地址，端口号，数据
		InetAddress address = packet.getAddress();
		int port = packet.getPort();
		byte[] data2 = "思域欢迎您!".getBytes();
		DatagramPacket packet2 = new DatagramPacket(data2, data2.length, address, port);
		socket.send(packet2);
		socket.close();
	}
}
