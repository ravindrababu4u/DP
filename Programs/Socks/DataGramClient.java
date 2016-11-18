package Socks;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.SocketException;
import java.net.UnknownHostException;

public class DataGramClient {

	public static void main(String[] args) throws IOException {
		DatagramSocket ds=new DatagramSocket();
		byte[] mes="This is from Client Datagram345".getBytes();
		InetAddress ip=InetAddress.getByName("localhost");
		DatagramPacket dp=new DatagramPacket(mes, 0,mes.length, ip, 5000);
		ds.send(dp);
	}

}
