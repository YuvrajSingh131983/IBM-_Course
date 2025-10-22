package Inheritance.isA.Bank;

public class SavingsAccount extends BankAccount{
	public double interestRate;
	public void withdraw(double money) {
		 balance=balance+((balance*interestRate)/100);
		if (balance>100) {
			System.out.println(" Yes Balance is grater than 100");
			double remain=balance -money;
			System.out.println("AccountNumber:"+this.accountNumber+" Before Withdraw Balance:"+balance);
			System.out.println("AccountNumber:"+this.accountNumber+" After Withdraw Balance:"+remain);
			
			
		}
		else {
			System.out.println(" No Withdrawal: Balance is less than 100");
			System.out.println("AccountNumber:"+this.accountNumber+" Before Withdraw Balance:"+balance);
		}
	}
	SavingsAccount(int accountNumber, double balance, double interestRate) {
		super(accountNumber, balance);
		this.interestRate = interestRate;
	}
	

}
