package StaticLib;

public class StaticClass {
	private  static int sId=1000;
	
	public void displaySid(){
		System.out.println("Value of Student id: "+sId);
	}
	 public static int incrementSid(){
		 return sId++;
	 }
	
	

	public static void main(String[] args) {
	//	System.out.println("Student id,before any object creation: "+StaticClass.sId);

		StaticClass ob1= new StaticClass();
		StaticClass ob2= new StaticClass();
		StaticClass ob3= new StaticClass();
		StaticClass ob4= new StaticClass();
	//	System.out.println("Student id,after four objects creation: "+StaticClass.sId);
		
		System.out.println("Student id value using object1 reference: "+ob1.sId);
		System.out.println("Student id value using object2 reference: "+ob2.sId);
		System.out.println("Student id value using object3 reference: "+ob3.sId);
		System.out.println("Student id value using object4 reference: "+ob4.sId);
		StaticClass.incrementSid();
		StaticClass.incrementSid();
		System.out.println("Student id value After invoking incrementSid using object1: "+ob1.sId);
		System.out.println("Student id value of Ob2 After invoking incrementSid using object2: "+ob2.sId);
		System.out.println("Student id value of Ob3 invoking incrementSid using object4: "+ob3.sId);
		System.out.println("Student id value of Ob4 invoking incrementSid using object4: "+ob4.sId);
	//	System.out.println("Student id using class reference,after incrementing: "+StaticClass.sId);
	}

}
