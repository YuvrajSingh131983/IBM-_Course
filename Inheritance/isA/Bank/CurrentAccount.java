package Inheritance.isA.Bank;

public class CurrentAccount extends BankAccount {
public double overdraftLimit;
public void withdraw(double money) {
	balance =balance+overdraftLimit;
	double remain=balance -money;
	System.out.println("AccountNumber:"+this.accountNumber+" Before Withdraw Balance:"+balance);
	System.out.println("AccountNumber:"+this.accountNumber+" After Withdraw Balance:"+remain);
}
CurrentAccount(int accountNumber, double balance, double overdraftLimit) {
	super(accountNumber, balance);
	this.overdraftLimit = overdraftLimit;
}
	
}
