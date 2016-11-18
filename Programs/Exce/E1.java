package Exce;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

import Threads.A;

public class E1 {

	public static void main(String[] args) {
   ExecutorService eser=Executors.newFixedThreadPool(4);
   eser.execute(new A());
   eser.execute(new A());
   eser.execute(new A());
   eser.execute(new A());
   eser.execute(new A());
   eser.execute(new A());
   eser.execute(new A());
   eser.execute(new A());
   eser.execute(new A());
   eser.execute(new A());
   eser.execute(new A());
   eser.execute(new A());
   eser.execute(new A());
   eser.execute(new A());
   eser.execute(new A());
   eser.execute(new A());
   eser.execute(new A());
   eser.execute(new A());
   eser.shutdown();
   
	}

}
