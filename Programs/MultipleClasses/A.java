package MultipleClasses;

public class A {
private String id;
private String name;
private String desig;

public void setId(String id) {
	this.id = id;
}
public void setName(String name) {
	this.name = name;
}
public void setDesig(String desig) {
	this.desig = desig;
}
public void show(){
	System.out.println("Details of A id -->"+id+" Name:  "+name +"  Designation:  "+desig);
}
}
