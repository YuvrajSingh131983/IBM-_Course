package Polymorphism;

public class paymentexample {
public static void main(String[] args) {
	Payment pc =new CreditCardPayment();
	Payment pu =new UPIPayment();
	Payment p =new Payment();
	p.processPayment();
	pu.processPayment();
	pc.processPayment();
	
	
}
}
