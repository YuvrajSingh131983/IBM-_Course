package Inheritance.isA;

public class Professor extends Person {
	public String department;

	
	public void displayDetails() {
		System.out.println("Professor[ID:"+this.id+", Name:"+this.name+", Department:"+this.department+"]");
	}

	public Professor() {
		super();
	}

	public Professor(String id ,String name,String department) {
		super();
		this.department = department;
		this.id=id;
		this.name=name;
	}

}
