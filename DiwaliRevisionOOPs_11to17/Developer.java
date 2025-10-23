package DiwaliRevisionOOPs_11to17;

public class Developer extends Employee{

	protected String Post="Developer";

	@Override
	public String Display_Details() {
		return "Developer [Post=" + Post + ", EmpID=" + EmpID + ", Name=" + Name + ", Salary=" + Salary + "]";
	}

	Developer(String empID, String name, double salary, String post) {
		super(empID, name, salary);
		Post = post;
	}

	Developer(String empID, String name, double salary) {
		super(empID, name, salary);
	}

	
	
	
	
}
