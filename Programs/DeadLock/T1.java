package DeadLock;

public class T1 extends Thread {
C1 c;
public T1(C1 c1){
	this.c= c1;
	
}
public void run(){
	c.m1();
	c.m2();
}
}
