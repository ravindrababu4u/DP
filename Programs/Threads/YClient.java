package Threads;

public class YClient {

	public static void main(String[] args) {
		System.out.println(Thread.currentThread().getName());
   YeildThread yt1= new YeildThread();
   YeildThread yt2= new YeildThread();
   yt1.start();
   yt2.start();
   
	}

}
