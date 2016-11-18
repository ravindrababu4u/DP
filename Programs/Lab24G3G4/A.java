package Lab24G3G4;

public class A  extends Thread{
	private boolean run=true;
	 public A(){
		start();
	}
	public void run(){
		int i=0;
		while(run){
			System.out.println(Thread.currentThread().getName()+" Value of i "+i);
		i++;
		  if(i==1000){
			  setflse();
		  }
		}
		}
	private void setflse(){
		this.run=false;
	}

}
