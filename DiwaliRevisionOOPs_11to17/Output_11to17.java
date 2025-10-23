package DiwaliRevisionOOPs_11to17;

public class Output_11to17 {
public static void main(String[] args) {
	//Question 11
	System.out.println("Question 11");
	System.out.println();
	BankAccount bank_acc=new BankAccount();
	bank_acc.setAccount_No("AVD54545");
	bank_acc.setBank_Name("SBI");
	bank_acc.setAcc_Holder_Name("Ram");
	bank_acc.setBalance(155445.26);
	System.out.println(bank_acc.Display_Details());
	System.out.println();
	
	//Question 12
	System.out.println("Question 12");
	System.out.println();
	Shape s_c=new Circle();
	Shape s_r=new Rectangle();
	System.out.println(s_c.draw());
	System.out.println(s_r.draw());
	System.out.println();
	
	//Question 13
	System.out.println("Question 13");
	System.out.println();
	Playable p_g=new Guitar();
	Playable p_p=new Piano();
	System.out.println(p_g.play());
	System.out.println(p_p.play());
	System.out.println();
	
	//Question 14
	System.out.println("Question 14");
	System.out.println();
	Document doc=new Document();
	System.out.println(doc.Print());
	System.out.println(doc.Show());
	System.out.println();
	
	//Question 15
	System.out.println("Question 15");
	System.out.println();
	A obj=new B();// Up-casting 
	System.out.println("Calling overriden method Display");
	System.out.println(obj.Display());
	System.out.println();
	
	//Question 16
	System.out.println("Question 16");
	System.out.println();
	A parent=new B();// Up-casting 
	// Down-Casting 
	if (parent instanceof B) {
		B child = (B) parent;
		System.out.println(child.Display_details());// accessing parent methods
		System.out.println(child.Display());// accessing child method
	}
	else {
		System.out.println(" Object is not instance of B");
	}
	System.out.println();
	
	
	//Question 17
	System.out.println("Question 17");
	System.out.println();
	Employee mng=new Manager("SD4545","Ram",50000.00);
	Employee dlp=new Developer("DS4548","Kishan",400000.00);
	System.out.println(mng.Display_Details());
	System.out.println(dlp.Display_Details());
	System.out.println();
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
}
