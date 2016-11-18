package ProducerAndConsumer;

public class Consumer extends Thread{
	public void run(){
		for(int i=0;i<10;i++){
		System.out.println("Consumer Consuming item  :"+i);
		Thread.yield();
		}
	}

}
