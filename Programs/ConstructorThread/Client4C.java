package ConstructorThread;

public class Client4C {

	public static void main(String[] args) {
      final C c= new C();
//      System.out.println("SUM :"+c.add(10,20));
//      System.out.println("Mul :"+c.mul(10, 20));
//      System.out.println("DIV :"+c.div(10, 5));
//      System.out.println("SUB :"+c.sub(100,10));
	 Thread t1= new Thread(new Runnable() {
		
		@Override
		public void run() {
			System.out.println(c.add(10,20));
		}
	});
	 Thread t2= new Thread(new Runnable() {
		
	
		public void run() {
			System.out.println(c.div(200, 100));
		}
	});
	Thread t3= new Thread(new Runnable() {
		
		public void run() {
			System.out.println(c.mul(200,300));
		}
	});
    t1.start();
    t2.start();
    t3.start();
}
}
