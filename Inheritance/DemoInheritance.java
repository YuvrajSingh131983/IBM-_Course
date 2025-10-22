package Inheritance;

public class DemoInheritance {
	public String name;
	public int age;
	
}
class Child extends DemoInheritance{
	public int rollno;

	@Override
	public String toString() {
		return "child [rollno=" + rollno + ", name=" + name + ", age=" + age + "]";
	}

	public Child(String name,int age,int rollno) {
		super();
		this.rollno = rollno;
		this.age = age;
		this.name = name;
	}
	
}

	
