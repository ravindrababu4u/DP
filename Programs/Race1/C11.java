package Race1;

public class C11 {
private int n=10;
public static Object ob= new Object();
public  int nextN(){
	//synchronized(ob){
 try {
	Thread.sleep(1000);
} catch (InterruptedException e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
}
	return n++;

}
//}
}
