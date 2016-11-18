package Deamon;

public class A extends Thread{

	public void run(){
		for(int i=0;i<100;i++){
			System.out.println(Thread.currentThread().getName()+" value of i: "+i);
		}
		
	}
}
