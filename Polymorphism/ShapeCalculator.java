package Polymorphism;

public class ShapeCalculator {

	public double calculateArea( double radius) {
		return radius*radius*3.14;
	}
	public double calculateArea(double l,double b) {
		return l*b;
	}
	public double calculateArea(double base,double hight,double dummy ) {
		return 0.5*base*hight;
	}
	public static void main(String[] args) {
		ShapeCalculator s= new ShapeCalculator();
		System.out.println("Circle  :"+s.calculateArea(21));
		System.out.println("Rectangle :"+s.calculateArea(23,21));
		System.out.println("Triangel  :"+s.calculateArea(22, 10, 10));
	}
}
