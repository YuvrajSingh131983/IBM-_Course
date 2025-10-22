package oops;

public class ExampleCar {
	public static void main(String[] args) {
		Engin e1= new Engin("Petro",200);
		Engin e2= new Engin("Desiel",150);
		Car c1=new Car("TATA","First",e1);
		System.out.println(c1);
		Car c2=new Car("TATA","Second",e2);
		System.out.println(c2);
		
	}

}
