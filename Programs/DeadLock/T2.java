package DeadLock;

public class T2 extends Thread {
	C1 c;
	public T2(C1 c1){
		this.c= c1;
		
	}
	public void run(){
		C1.m2();
		C1.m1();
	}
	public static void main(String args[] ) throws InterruptedException{
		C1 c= new C1();
		T1 t1= new T1(c);
		T2 t2= new T2(c);
		t1.setName("T1");
		t2.setName("T2");
		t1.start();
		t2.start();
	}
}
