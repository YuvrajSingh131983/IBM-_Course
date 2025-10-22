package Inheritance.isA;

public class Developer extends Employee{
public int bonus;

public void totalSalary() {
	System.out.println("Total Salary: "+(bonus+salary));
	}

@Override
public String toString() {
	return "Developer [bonus=" + bonus + ", name=" + name + ", salary=" + salary + "]";
}
public Developer(int bonus, String name, int salary) {
	super();
	this.bonus = bonus;
	this.name = name;
	this.salary = salary;
}
public Developer() {
	super();
}

}
