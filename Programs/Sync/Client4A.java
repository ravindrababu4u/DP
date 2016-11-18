package Sync;

import java.util.Scanner;

public class Client4A {

	public static void main(String[] args) {
     A a = new A();
     a.start();
     System.out.println("Press the return Keys......");
     Scanner sc=new Scanner(System.in);
		sc.nextLine();
      a.exitMethod();
	}

}
