package d2;

public class C1 {
public static  void m1() throws InterruptedException{
	System.out.println(Thread.currentThread().getName());
	System.out.println("From C1--m1");
	C2.m2();
	Thread.sleep(2000);
}
}
