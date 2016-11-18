package d2;

public class C2 {
	public static  void m2() throws InterruptedException{
		System.out.println(Thread.currentThread().getName());
		System.out.println("From C2--m2");
		C1.m1();
		Thread.sleep(2000);
	}
}
