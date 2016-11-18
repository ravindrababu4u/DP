package DeadLock;

public class C1 {
public static synchronized void m1(){
	System.out.println("Printing started m1()  Thread Name "+Thread.currentThread().getName());
	m2();
	try {
		Thread.sleep(20000);
	} catch (InterruptedException e) {
		e.printStackTrace();
	}
	//m2();
	System.out.println("Printing Finised m1()   Thread Name "+Thread.currentThread().getName());
}

public static synchronized void m2(){
	m1();
	System.out.println("Scanning started m2()  Thread Name "+Thread.currentThread().getName());
	try {
		Thread.sleep(20000);
	} catch (InterruptedException e) {
		e.printStackTrace();
	}
	//m1();
	System.out.println("Scanning Finised m2()  Thread Name "+Thread.currentThread().getName());
}
	
}
