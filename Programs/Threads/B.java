package Threads;

public class B extends Thread{
	public void run(){
		for(int i=1000;i<2000;i++){
		System.out.println("Thread2 value iif i ="+i);
		//Thread.currentThread()
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		}
	}

}
