package Socketpogramming;

import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.Scanner;

public class Client {

	public static void main(String[] args) throws UnknownHostException, IOException {
      while(true){
	  Socket s= new Socket("127.0.0.1",9999);
      DataOutputStream dos= new DataOutputStream(s.getOutputStream());
	  //String mes1="This message is from G3 and G4 groups";
	  Scanner sc= new Scanner(System.in);
	  String mes1=sc.nextLine();
      dos.writeUTF(mes1);
      }
	}

}
