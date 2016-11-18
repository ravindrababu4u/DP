package Socks;

import java.io.DataOutputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class Server1 {

	public static void main(String[] args) throws IOException {
		ServerSocket sock= new ServerSocket(3003);
		Socket sock1=sock.accept();
		System.out.println(sock1.getLocalAddress());
		System.out.println("Connected");
		DataOutputStream dos=new DataOutputStream(sock1.getOutputStream());
		dos.writeUTF("Welcome to socket");
		
		
	}

}
