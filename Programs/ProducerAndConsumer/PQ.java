package ProducerAndConsumer;

import java.util.Random;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;

public class PQ {

	 private static BlockingQueue<Integer> queue = new ArrayBlockingQueue<>(10);

	    public static void main(String[] args) throws InterruptedException {

	        Thread t1 = new Thread(new Runnable() {
	            public void run() {
	                try {
	                    producer();
	                } catch (InterruptedException ignored) {}
	            }
	        });

	        Thread t2 = new Thread(new Runnable() {
	            public void run() {
	                try {
	                    consumer();
	                } catch (InterruptedException ignored) {}
	            }
	        });
	        t1.start();
	        t2.start();
      t1.join();
        t2.join();

	        // Pause for 30 seconds and force quitting the app (because we're
	        // looping infinitely)
	        Thread.sleep(30000);
	        System.exit(0);
	    }

	    private static void producer() throws InterruptedException {
	        Random random = new Random();
	        while (true) {//loop indefinitely
	        	int x=random.nextInt(100);
	        	System.out.println("Input Value into Q:"+x);
	            queue.put(x);//if queue is full (10) waits
	        }
	    }

	    private static void consumer() throws InterruptedException {
	        Random random = new Random();
	        while (true) {
	            Thread.sleep(100);
	            if (random.nextInt(10) == 0) {
	                Integer value = queue.take();//if queue is empty waits
	                System.out.println("Taken value: " + value + "; Queue size is: " + queue.size());
	            }
	        }
	    }

}
