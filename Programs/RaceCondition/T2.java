package RaceCondition;

public class T2 extends Thread{
	public void run(){
		C1 cc1= new C1();
		System.out.println(cc1.incrementX());
	}
public static void main(String[] args){
	T1 t1= new T1();
	T2 t2= new T2();
	t1.start();
	t2.start();
	
}
}
