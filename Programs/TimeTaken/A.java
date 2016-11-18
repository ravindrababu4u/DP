package TimeTaken;

public class A extends Thread{
	A(String name){
		super(name);
		start();
	}
	
  public void run(){
	  synchronized (A.class) {
	  int i=0;
	  while(i<20){
		  try {
			  i++;
			Thread.sleep(1000);
			//System.out.println("Name of Thread: "+Thread.currentThread().getName() +"  value of i== " +i);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			
		}
	  }
		}
  }
	
	public static void main(String[] args) throws InterruptedException {
		long t1= System.currentTimeMillis();
		A a1= new A("A1");
		A a2= new A("A2");
		A a3= new A("A3");
		a1.join();
		a2.join();
		a3.join();
		long t2= System.currentTimeMillis();
		long diff= t2-t1;
		System.out.println("Execution time in seconds: "+diff/1000);

	}

}
