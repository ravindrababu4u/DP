package PrivateCon;

public class A {
private A(){
	System.out.println("This is from private default constructor ");
}
private A(String name){
	System.out.println("This is from private constructor(String) Value of parameter"+name);
}
public static A getInstance(){
	return new A();
}

public static A getInstance(String s){
	return new A(s);
}
public void display(){
	
	System.out.println("This is from display function");
}
}
