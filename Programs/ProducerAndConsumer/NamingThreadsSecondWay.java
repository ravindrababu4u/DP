package ProducerAndConsumer;

public class NamingThreadsSecondWay {
	public static void main(String[] args) throws InterruptedException {
		String currentThreadName = Thread.currentThread().getName();
		
		System.out.println("[" + currentThreadName + "] Main thread starts here...");
		
		//new Thread(new LoopTaskC(), "MyThread-1").start();
		
		Thread t2 = new Thread();
		t2.setName("MyThread-2");
		t2.start();
		
		t2.setName("MyThread-2");
		
		System.out.println("[" + currentThreadName + "] Main thread ends here...");
	}
}
