package PC;

public class Producer extends Thread{
	public void run(){
		for(int i=0;i<10;i++){
			System.out.println("Producer Produced number :"+i);
			Thread.yield();
		}
	}

}
