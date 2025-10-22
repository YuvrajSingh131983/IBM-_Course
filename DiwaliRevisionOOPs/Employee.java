package DiwaliRevisionOOPs;

public class Employee {
	public String name;
	public double salary;
	public void getName(String name) {
		this.name=name;
	}
	public void getSalary(double salary) {
		this.salary=salary;
	}

	public String Display() {
		return "Employee [Name=" + name + ", Salary=" + salary + "]";
	}
	

}
