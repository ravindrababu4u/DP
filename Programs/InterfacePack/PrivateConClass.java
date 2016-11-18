package InterfacePack;

public class PrivateConClass {
	
	private PrivateConClass(){
		System.out.println( "This is from defaulr construtor");
	}
	private PrivateConClass(String s){
		System.out.println( "This is from defaulr construtor ->"+s);
	}
	
	public void m1(){
		System.out.println("This is from method m1()");
	}
	public static  PrivateConClass getInstance(){
		return new PrivateConClass();
	}
	
	public static  PrivateConClass getInstance(String s){
		return new PrivateConClass(s);
	}
	public static void main(String[] args) {
	 
//		PrivateConClass pc=PrivateConClass.getInstance();
//		pc.m1();
		PrivateConClass pc=PrivateConClass.getInstance("Adama Astu");
		pc.m1();
		
		
		
	}

}
