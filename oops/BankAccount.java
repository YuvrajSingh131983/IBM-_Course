package oops;

public class BankAccount {
private String accountNumber;
private String accountHolderName;
private double balance;
public String getAccountNumber() {
	return accountNumber;
}
public void setAccountNumber(String accountNumber) {
	this.accountNumber = accountNumber;
}
public String getAccountHolderName() {
	return accountHolderName;
}
public void setAccountHolderName(String accountHolderName) {
	this.accountHolderName = accountHolderName;
}
public double getBalance() {
	return balance;
}
public void setBalance(double balance) {
	this.balance = balance;
}

// deposit method
public void deposit(double amount) {
	double newBalance=getBalance()+amount;
	System.out.println("Balance = "+newBalance);
}
public void withdrow(double amount) {
	double newBalance=getBalance()-amount;
	System.out.println("Balance = "+newBalance);
}
@Override
public String toString() {
	return "BankAccount [accountNumber=" + accountNumber + ", accountHolderName=" + accountHolderName + ", balance="
			+ balance + "]";
}
public BankAccount(String accountNumber, String accountHolderName, double balance) {
	super();
	this.accountNumber = accountNumber;
	this.accountHolderName = accountHolderName;
	this.balance = balance;
}
public BankAccount() {
	super();
}


}
