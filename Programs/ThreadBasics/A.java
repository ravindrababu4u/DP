package ThreadBasics;

public class A extends Thread{
	A(String s){
		super(s);
	}
	public void run(){
		
		int i=0;
		while(i<10){
			System.out.println(Thread.currentThread().getName()  +"  Value of i is " +i);
			i++;
			
			
		}
	}

}
