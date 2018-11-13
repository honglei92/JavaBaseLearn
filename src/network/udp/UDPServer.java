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
		// �������ݱ������ڽ��տͻ��˷��͵�����
		byte[] data = new byte[1024];
		DatagramPacket packet = new DatagramPacket(data, data.length);
		socket.receive(packet);
		String info = new String(data, 0, data.length);
		System.out.println("i am server terminal�� client said:" + info);

		// ��ͻ��˷�������
		// ����ͻ��˵ĵ�ַ���˿ںţ�����
		InetAddress address = packet.getAddress();
		int port = packet.getPort();
		byte[] data2 = "˼��ӭ��!".getBytes();
		DatagramPacket packet2 = new DatagramPacket(data2, data2.length, address, port);
		socket.send(packet2);
		socket.close();
	}
}
