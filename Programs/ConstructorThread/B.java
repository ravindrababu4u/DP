package ConstructorThread;

public class B extends Thread{
	public void run(){
		for(int i=0;i<10;i++){
			System.out.println("Current Thread Name:"+Thread.currentThread().getName() + " Value of i:"+i);
		}
	}
	

}
