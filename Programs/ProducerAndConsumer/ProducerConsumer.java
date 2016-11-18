package ProducerAndConsumer;

public class ProducerConsumer {
	static private int message;
	public void  produce() throws InterruptedException{
		synchronized (this) {
		for(int i=0; i< 10;i++){
			message=i;
			System.out.println("Producer produced item value: "+message);
			notify();
			//return messsage;
			//Thread.yield();
			//wait();
		}
		
		}
	}
	public void consumer() throws InterruptedException {
		synchronized (this) {
			
		for(int i=0;i<10;i++){
			//wait();
			System.out.println("Value of the consumed item:  "+message);
			notify();
			//Thread.yield();
		}
	}
	}

}
