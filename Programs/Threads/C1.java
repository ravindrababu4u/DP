package Threads;

public class C1 implements Runnable {


	public void run() {
	for(int i=0; i<1000;i++){
		
		System.out.println("This is from C1 object value of i== "+i);
	}

	}

}
