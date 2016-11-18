package Threads;

public class Client {

	public static void main(String[] args) {
     A a =new A();
     B b= new B();
     b.setPriority(10);
     a.setPriority(1);
     a.start();
     b.start();
	}

}
