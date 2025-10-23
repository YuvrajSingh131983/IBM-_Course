package DiwaliRevisionOOPs_11to17;

public class Manager extends Employee{
	protected String Post="Manager";// Default post 

	@Override
	public String Display_Details() {
		return "Manager [Post=" + Post + ", EmpID=" + EmpID + ", Name=" + Name + ", Salary=" + Salary + "]";
	}


	Manager(String empID, String name, double salary, String post) {
		super(empID, name, salary);
		Post = post;
	}


	Manager(String empID, String name, double salary) {
		super(empID, name, salary);
	}


	



	
	

}
