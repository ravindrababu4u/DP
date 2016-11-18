package ProducerAndConsumer;

public class C4ProducerConsumer {

	public static void main(String[] args) throws InterruptedException {
       final ProducerConsumer p= new ProducerConsumer();
       Thread t1= new Thread(new Runnable() {
		
		@Override
		public void run() {
			try {
				p.produce();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}		
		}
	});
       Thread t2= new Thread(new Runnable() {
		
		@Override
		public void run() {
        try {
			p.consumer();
		
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}			
		}
	});
      t1.start();
     //t1.join();
      t2.start();
     // t2.join();
	}

}
