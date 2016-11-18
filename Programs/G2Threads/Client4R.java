package G2Threads;

public class Client4R {

	public static void main(String[] args) {
     B b= new B();
     new Thread(b,"T1").run();;
     
     
     Thread t2= new Thread(b,"T2");
     t2.run();
     
     Thread t3= new Thread(b,"T3");
     t3.run();
     
     Thread t4= new Thread(b,"T4");
     t4.run();
     
	}

}
