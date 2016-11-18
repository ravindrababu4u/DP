package c1;

public class A {

	int n;
	String name;
	public A(){
		System.out.println("Message is from  default Constructor");
	}
	public A(int x,String nam){
		this.n=x;
		this.name=nam;
		System.out.println("This is from A(int x,String nam) value of n==" +n+ "Value of String"+nam );
	}
	public A (String nam,int x){
		this.n=x;
		this.name=nam;
		System.out.println("This is from public A (String nam,int x) value of n==" +n+ "Value of String"+nam );
	}
	
	public void m1(){
		System.out.println("This is from m1()");
	}
	
}
