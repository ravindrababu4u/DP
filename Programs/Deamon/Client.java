package Deamon;

public class Client {
	public static void main(String[] args){
		A a1 = new A();
		a1.setName("A1");
		A a2 = new A();
		a2.setName("A2");
		a1.setDaemon(true);
		a1.start();
		//a2.start();
		System.out.println("Current Thread name:"+Thread.currentThread().getName());
		System.out.println("Is the deamon: "+a1.isDaemon() );
		System.out.println("Is the deamon live : "+a1.isAlive() );
		
		
	}

}
