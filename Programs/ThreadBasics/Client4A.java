package ThreadBasics;

import java.io.*;
import java.util.Scanner;

public class Client4A {

	public static void main(String[] args) throws InterruptedException {
	 
     A a1= new A("a1");
     A a2= new A("a2");
     A a3= new A("a3");
     A a4= new A("a4");
     a2.start();
     a2.join();
     a4.start();
    a4.join();
     a1.start();
    // a1.join();
     a3.start();
    // a2.join();
     
	}

}

