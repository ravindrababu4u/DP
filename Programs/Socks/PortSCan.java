package Socks;

import java.io.IOException;
import java.net.Socket;
import java.net.UnknownHostException;

public class PortSCan {

	public static void main(String[] args) throws UnknownHostException, IOException {
		for(int i=0;i<65535;i++){
		try{Socket sock= new Socket("127.0.0.1",i);
		System.out.println("Open Port: "+i);
		}
		catch(Exception e){}
		}
	}

}
