package RaceCondition;

public class T1 extends Thread {
	public void run(){
		C1 c1= new C1();
		System.out.println(c1.incrementX());
	}

}
