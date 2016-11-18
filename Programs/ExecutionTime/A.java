package ExecutionTime;

import java.util.concurrent.TimeUnit;

public class A implements Runnable {

	@Override
	public void run() {
		synchronized (A.class) {
		for(int i=0;i<5;i++){
			//System.out.println("Waiting one Second Thread"+Thread.currentThread().getName());
			try {
				//TimeUnit.SECONDS.sleep(1);
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		}
	}

	private void syncronization(Class<A> class1) {
		// TODO Auto-generated method stub
		
	}

}
