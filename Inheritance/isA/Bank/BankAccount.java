package Inheritance.isA.Bank;

public class BankAccount {
protected int accountNumber;
protected double balance;

public void deposit(double money) {
	double total=balnce+money;
	return "Current balance:"+total;
}
public void withdraw(double money) {
	double remain=balance -money;
	return "Current balance:"+remain;
}
BankAccount(int accountNumber, double balance) {
	super();
	this.accountNumber = accountNumber;
	this.balance = balance;
}
public int getAccountNumber() {
	return accountNumber;
}
public void setAccountNumber(int accountNumber) {
	this.accountNumber = accountNumber;
}
public double getBalance() {
	return balance;
}
public void setBalance(double balance) {
	this.balance = balance;
}
}
