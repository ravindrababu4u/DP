package Sync;

import java.util.Scanner;

public class A extends Thread{
	private boolean running= true;
	public void run(){
		int i=0;
		while(running){
			System.out.println("value of i :"+i);
			i++;
		}
	}
		public void exitMethod(){
			
			running=false;
			
		}
	

}
