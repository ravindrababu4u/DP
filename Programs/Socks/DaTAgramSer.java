package Socks;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.SocketException;

public class DaTAgramSer {

	public static void main(String[] args) throws IOException {
		DatagramSocket dsock=new DatagramSocket(5000);
		byte[] mes=new byte[200];
		DatagramPacket dp=new DatagramPacket(mes, mes.length);
		dsock.receive(dp);
		String mesRec= new String(mes);
		System.out.println("Received Message: "+mesRec);
		
	
	}

}
