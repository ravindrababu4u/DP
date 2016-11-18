package PrivateCon;

public class ClientCl {

	public static void main(String[] args) {
		A a =A.getInstance();
		a.display();
		A a1= A.getInstance("ASTU");
		a1.display();

	}

}
