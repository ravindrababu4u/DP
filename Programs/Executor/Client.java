package Executor;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Client {

	public static void main(String[] args) {
    ExecutorService eser= Executors.newCachedThreadPool();
    eser.execute(new A());
    eser.execute(new A());
    eser.execute(new A());
    eser.execute(new A());
    eser.execute(new A());
    eser.shutdown();
    //eser.execute(new A());
	}

}
