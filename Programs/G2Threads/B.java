package G2Threads;

public class B implements Runnable {

	public void run() {
      int i=0;
      while(i<10){
    	 
    	  System.out.println(Thread.currentThread().getName() +"      Value of i   :"+i);
    	  i++;
      }
	}

}
