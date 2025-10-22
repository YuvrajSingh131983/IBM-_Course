package Polymorphism;

public class UPIPayment extends Payment {
	
	@Override
	public void processPayment() {
		System.out.println("Processing UPI Payment");
	}
}
