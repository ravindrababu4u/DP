package TH;

public class RT1 implements Runnable {

	public void run() {
		for(int i=0;i<100;i++){
		System.out.println("Thread1");
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	}

}
