package Inheritance.isA.Bank;

public class Demo {
public static void main(String[] args) {
	SavingsAccount sa=new SavingsAccount(564646646,20000.00,5);
	
	SavingsAccount sa1=new SavingsAccount(564655646,45.00,5.0);
	
	CurrentAccount ca=new CurrentAccount(564646646,20000.00,50000.00);
	sa.withdraw(8000.00);
	System.out.println();System.out.println();
	sa1.withdraw(80.00);
	System.out.println();System.out.println();
	ca.withdraw(40000.00);
}
}
