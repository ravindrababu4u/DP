package ExecutionTime;

public class Client {

	public static void main(String[] args) throws InterruptedException {
    long timeBeforeStarting=System.currentTimeMillis();
    A a1 = new A();
    A a2 = new A();
    Thread t1= new Thread(a1,"A1");
    Thread t2= new Thread(a2,"A2");
    Thread t3= new Thread(a1,"A3");
    Thread t4= new Thread(a2,"A4");
    t1.start();
    t2.start();
    t3.start();
    t4.start();
    long timeAfterFinished=System.currentTimeMillis();
    long executionTime=timeAfterFinished-timeBeforeStarting;
    System.out.println("Execution time in seconds:"+executionTime/1000);
	}

}
