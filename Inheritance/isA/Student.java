package Inheritance.isA;

public class Student extends Person{
public double cgpa;


public void displayDetails() {
	System.out.println("Student[ID:"+this.id+", Name:"+this.name+", CGPA:"+this.cgpa+"]");
}

public Student(String id,String name,double cgpa) {
	super();
	this.name=name;
	this.id=id;
	this.cgpa = cgpa;
}

public Student() {
	super();
}

}
