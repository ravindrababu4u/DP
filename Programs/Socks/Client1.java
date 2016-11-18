package Socks;

import java.io.DataInputStream;
import java.io.IOException;
import java.net.Socket;
import java.net.UnknownHostException;

public class Client1 {

	public static void main(String[] args) throws UnknownHostException, IOException {
    Socket sock=new Socket("127.0.0.1",3003);
    //sock.connect(127.0.0.1, timeout);
    System.out.println("Connected to Server");
    DataInputStream doi= new DataInputStream(sock.getInputStream());
	String mes=doi.readUTF();
	System.out.println("Received Message:"+mes);
	}

}
