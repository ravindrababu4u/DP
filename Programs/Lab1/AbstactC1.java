package Lab1;

public abstract class AbstactC1 {

	AbstactC1(){
		System.out.println("This is from AbstactC1()");
	}	
	AbstactC1(String s1){
		System.out.println("This is from AbstactC1(String) "+s1);
	}	
	AbstactC1(int n){
		System.out.println("This is from AbstactC1(int) "+n);
	}
	
	public void m1() {
		System.out.println("This is from m1() of AbstractC1");
	}
	abstract public int add(int x, int y);
	abstract public int add(int x, int y,int z);
	abstract public int mul(int x, int y);
	abstract public float div(float x,float y);
	abstract public int sub(int x, int y);
	
}
