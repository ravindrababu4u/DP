package PC;

public class Consumer extends Thread {
	public void run(){
		for(int i=0;i<10;i++){
			System.out.println("Consumed Consuming Item is: " +i);
			Thread.yield();
		}
	}

}
