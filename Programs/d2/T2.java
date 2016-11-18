package d2;

public class T2 extends Thread{
	C1 c1;
	C2 c2;
	public void run(){
		while(true){
			try {
				C2.m2();
				C1.m1();	
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	public static void main(String []args){
		T1 t1=new T1();
		T2 t2=new T2();
		t1.start();
		t2.start();
		
	}
	}
