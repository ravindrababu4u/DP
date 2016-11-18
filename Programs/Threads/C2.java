package Threads;

public class C2 implements Runnable {

	@Override
	public void run() {
		for(int i=1000; i<2000;i++){
			
			System.out.println("This is from C2 object value of i== "+i);
		}

	}

}
