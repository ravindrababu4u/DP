package c1;

public class D implements I1 {

	@Override
	public void m1() {
		System.out.println("This is from m1()");

	}

	public int add(int x, int y) {
		return x+y;
	}

	public int mul(int x, int y) {
		return x*y;
	}

	public static void main(String[] args) {

		 D d = new D();
		 d.m1();
		 System.out.println("Add method"+d.add(10, 20));
		 System.out.println("Multiplication method"+d.mul(10, 20));
		 
	}

}
