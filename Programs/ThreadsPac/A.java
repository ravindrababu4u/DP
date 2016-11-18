package ThreadsPac;

public class A extends Thread{
	public void run(){
		int i=0;
		while(true){
			System.out.println(Thread.currentThread().getName()+"Value of i : "+i);
		i++;
		}
	}

}
