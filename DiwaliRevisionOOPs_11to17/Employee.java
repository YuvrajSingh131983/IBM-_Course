package DiwaliRevisionOOPs_11to17;

public class Employee {
	protected String EmpID;
	protected String Name;
	protected double Salary;
	public String getEmpID() {
		return EmpID;
	}
	public void setEmpID(String empID) {
		EmpID = empID;
	}
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	public double getSalary() {
		return Salary;
	}
	public void setSalary(double salary) {
		Salary = salary;
	}

	public String Display_Details() {
		return "Employee [EmpID=" + EmpID + ", Name=" + Name + ", Salary=" + Salary + "]";
	}
	protected Employee(String empID, String name, double salary) {
		super();
		EmpID = empID;
		Name = name;
		Salary = salary;
	}
	protected Employee() {
		super();
	}
	
	
	
}
