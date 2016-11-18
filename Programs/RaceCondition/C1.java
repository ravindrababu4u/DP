package RaceCondition;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;


public class C1 {
	public   static   int  x = 10;
	ReentrantLock lock= new ReentrantLock();
	
	public C1(){
	}
    public static synchronized  int  incrementX(){

    	return x++; }
    }
