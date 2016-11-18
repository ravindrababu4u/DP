package Threads;

public class C4Rinter {

	public static void main(String[] args) {
      C1 c1= new C1();
      C2 c2= new C2();
      Thread t1 = new Thread(c1);
      Thread t2= new Thread(c2);
      t1.start();
      t2.start();
	}

}
