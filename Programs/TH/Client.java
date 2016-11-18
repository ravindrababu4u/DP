package TH;

import java.util.Date;

public class Client {

	public static void main(String[] args) {
//		Thread1 t1= new Thread1("S1");
//		Thread1 t2= new Thread1("S2");
//		Date d1=new Date();
//		Date d11=new Date();
//		System.out.println("Starting Tme"+d11);
//		t1.start();
//		t2.start();
//	
//		System.out.println("ending Tme"+d11);
		RT1 r11= new RT1();
		RT2 r21= new RT2();
		Thread t1 = new Thread(r11,"ss1");
		Thread t2 = new Thread(r21,"ss2");
		t1.start();
		t2.start();
	}

}
