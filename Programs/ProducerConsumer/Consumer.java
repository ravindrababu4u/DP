package ProducerConsumer;

public class Consumer extends Thread {
private MemoeryBuffer buf;
	
	public Consumer(MemoeryBuffer b) {
		this.buf=b;
	}
	public void run(){
		while(true){
       buf.get();
		}
			
	}

}
