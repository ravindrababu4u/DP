package Threads;

public class YeildThread extends Thread {
	public void run(){
		while(true){
			System.out.println(Thread.currentThread().getName());
			Thread.yield();
		}
	}

}
