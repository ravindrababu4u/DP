package Race1;

public class R11 extends Thread {
	C11 c11= null;
	public R11(C11 c){
		c11=c;
	}
	public void run(){
		System.out.println(c11.nextN());
	}
    
	public static void main(String[] args) {
     // while(true){
	  C11 c1= new C11();
      R11 r1= new R11(c1);
      r1.start();
      R11 r2= new R11(c1);
      r2.start();
      System.out.println("------------------");
      //}
	}

}
