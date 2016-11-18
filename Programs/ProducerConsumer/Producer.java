package ProducerConsumer;

public class Producer extends Thread{
	private MemoeryBuffer buf;
	
	
	public Producer(MemoeryBuffer b) {
		this.buf=b;
	}
	public void run(){
		int i=1;
		
		while(true){
			
			buf.put(i++);
			
			
			}
		}
	}

