package TH;

public class Thread1 extends Thread{
	public Thread1(String s){ 
		super(s);
		
	}
	
	public void run(){
		for(int i=0;i<100;i++)
		System.out.println("Name of ThreadName  "+getName() +" i   ="+i);
		
	}

}
