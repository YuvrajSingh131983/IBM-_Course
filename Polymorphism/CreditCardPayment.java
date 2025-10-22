package Polymorphism;

public class CreditCardPayment extends Payment {
	@Override
	public void processPayment() {
		System.out.println("Processing Credit Card Payment");
	}
}
