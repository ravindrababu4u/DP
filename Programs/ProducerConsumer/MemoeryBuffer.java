package ProducerConsumer;

public class MemoeryBuffer {
private int x;
boolean valueSet= false;
public MemoeryBuffer(){
	this.x=0;	
	}
public synchronized void put(int n){
	if(valueSet)
	{  try {
		wait();
	} catch (InterruptedException e) {
		e.printStackTrace();
	} 
	}
	//else{
		 this.x=n;
		System.out.println("Value of i placed by Producer is  "+x);
		
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		valueSet=true;
		notify();
	//	}
	}
 
public synchronized void get(){
	if(!valueSet){
		try {
			wait();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
		//else{
	 System.out.println("Value of i read by Consumer       "+x);
	//System.out.println("Square Value of i read by Consumer"+x*x*x);
	valueSet=false;
	notify();
	//}
}
}
