package ProducerAndConsumer;

public class Producer extends Thread  {

	public void run(){
		for(int i=0;i<10;i++){
			System.out.println("Producer producing number :"+i);
			Thread.yield();
		}
	}
}
