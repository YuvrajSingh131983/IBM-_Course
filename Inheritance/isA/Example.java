package Inheritance.isA;

public class Example {
	public static void main(String[] args) {
		Student s=new Student("AB123","Ram",7.5);
		Professor p= new Professor("SA123","Kishan","CS");
		s.displayDetails();
		p.displayDetails();
	}

}
