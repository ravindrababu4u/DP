package TH;

public class RT2 implements Runnable{
	public void run() {
		for(int i=0;i<100;i++){
		System.out.println("Thread2");
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		}
		
	}
}
