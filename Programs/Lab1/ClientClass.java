package Lab1;

public class ClientClass {

	public static void main(String[] args) {
      CCofA child= new CCofA();
      System.out.println("Addition of two numbers 400,200-> "+child.add(400, 200));
      System.out.println("Addition of Thress numbers 400,200 100-> "+child.add(400, 200,100));
      System.out.println("Subtraction of two numbers 400,200-> "+child.sub(400, 200));
      System.out.println("Multiplication of two numbers 400,200-> "+child.mul(400, 200));
      System.out.println("Division of two numbers 400,200-> "+child.div(400, 200));
	}

}
