package Socketpogramming;

import java.io.DataInputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {

	public static void main(String[] args) throws IOException {
		
	 System.out.println("Server is being started"); 
	 ServerSocket ss= new ServerSocket(9999);
     System.out.println("Waiting for Clinet Request");
     while(true) {
     Socket s=ss.accept();
	 DataInputStream di= new DataInputStream(s.getInputStream());
     String mes=di.readUTF();
     System.out.println("Received Message from Client:"+mes);
     }
	}

}
