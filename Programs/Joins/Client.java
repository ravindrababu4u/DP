package Joins;

public class Client {

	public static void main(String[] args) throws InterruptedException {
   //  long beofreStart= System.currentTimeMillis();
	  A t1= new A("t1");
	  A t2 = new A("t2");
	  A t3 = new A("t3");
	  A t4 = new A("t4");
	
	 
	 t2.start();
	 t2.join();
	 
	
	 t4.start();
	 t4.join();
	 t1.start();
	 t1.join();
	 t3.start();
	 t3.join();
	 
	 
	}
	

}
