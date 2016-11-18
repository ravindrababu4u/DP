package d2;

public class T1 extends Thread{
C1 c1;
C2 c2;
public void run(){
	while(true){
		try {
			C1.m1();
			C2.m2();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
}
