package DiwaliRevisionOOPs_11to17;

public class BankAccount {
private String Account_No;
private String Bank_Name;
private String Acc_Holder_Name;
private double Balance;
public String getAccount_No() {
	return Account_No;
}
public void setAccount_No(String account_No) {
	Account_No = account_No;
}
public String getBank_Name() {
	return Bank_Name;
}
public void setBank_Name(String bank_Name) {
	Bank_Name = bank_Name;
}
public String getAcc_Holder_Name() {
	return Acc_Holder_Name;
}
public void setAcc_Holder_Name(String acc_Holder_Name) {
	Acc_Holder_Name = acc_Holder_Name;
}
public double getBalance() {
	return Balance;
}
public void setBalance(double balance) {
	Balance = balance;
}

public String Display_Details() {
	return "BankAccount [Account_No=" + Account_No + ", Bank_Name=" + Bank_Name + ", Acc_Holder_Name=" + Acc_Holder_Name
			+ ", Balance=" + Balance + "]";
}
BankAccount(String account_No, String bank_Name, String acc_Holder_Name, double balance) {
	super();
	Account_No = account_No;
	Bank_Name = bank_Name;
	Acc_Holder_Name = acc_Holder_Name;
	Balance = balance;
}
BankAccount() {
	super();
}

}
