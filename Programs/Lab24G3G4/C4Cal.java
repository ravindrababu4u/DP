package Lab24G3G4;

public class C4Cal {
   final static Cal c= new Cal();
	public static void main(String[] args) {
		Thread t1= new Thread(new Runnable() {
			
			@Override
			public void run() {
				System.out.println(Thread.currentThread().getName()+" "+
			c.add(100,200));
			}
		});
		Thread t2= new Thread(new Runnable() {
			
			@Override
			public void run() {
				System.out.println(Thread.currentThread().getName()+" "+c.mul(200, 100));
			}
		});
		Thread t3= new Thread(new Runnable() {
			
			@Override
			public void run() {
            System.out.println(Thread.currentThread().getName()+" "+c.sub(2000, 100))	;			
			}
		});
		t1.setName("Addition");
		t2.setName("Multiplication");
		t3.setName("Division");
		t1.start();
		t2.start();
		t3.start();
	}

}
