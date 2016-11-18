package Joins;

public class A extends Thread {
	public A(String name)
	{
		super(name);
	}
 public void run(){
	 for(int i=0;i<10;i++){
		 System.out.println("Thread Name: "+Thread.currentThread().getName()+" Value of i is : "+i);
	    
	 }
	 System.out.println("Thread waiting finished");
 }
 
}
