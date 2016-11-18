package ProducerAndConsumer;

public class Client {

	public static void main(String[] args) throws InterruptedException {
    Producer p= new Producer();
    Consumer c= new Consumer();
    p.setPriority(10);
    c.setPriority(1);
    p.start();
   // p.join();
    c.start();
	}

}
