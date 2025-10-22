package DiwaliRevisionOOPs;

public class Output1 {
public static void main(String[] args) {
	//Question 1
	System.out.println("Question 1");
	System.out.println();
	Student student=new Student("Ram",22);
	System.out.println(student);
	System.out.println();
	//Question 2
	System.out.println("Question 2");
	System.out.println();
	Car car=new Car("TATA","Xuv");
	System.out.println(car);
	System.out.println();
	//Question 3
	System.out.println("Question 3");
	System.out.println();
	Book book =new Book();
	System.out.println(book);
	System.out.println();
	//Question 4
	System.out.println("Question 4");
	System.out.println();
	Calculator cal=new Calculator();
	System.out.println("45+35="+cal.add(45, 35));
	System.out.println("59-36="+cal.sub(59, 36));
	System.out.println("15*25="+cal.mul(15,25));
	System.out.println("90/15="+cal.div(90, 15));
	//Question 5
	System.out.println("Question 5");
	System.out.println();
	Object_Ref obj1=new Object_Ref();
	//First reference object obj1 
	obj1.age=25;
	//Second reference object via first reference object
	Object_Ref obj2=obj1;
	System.out.println("Before any Change");
	System.out.println();
	System.out.println("Output through  first  reference object :" +obj1.age);
	System.out.println("Output through seecond reference object :" +obj1.age);
	System.out.println();
	//Changing age through second reference object
	System.out.println("After changing age through second refernce object");
	obj2.age=35;
	System.out.println();
	System.out.println("Output through  first  reference object :" +obj1.age);
	System.out.println("Output through seecond reference object :" +obj1.age);
	System.out.println();
	
	//Question 6
	System.out.println("Question 6");
	System.out.println();
	Employee emp=new Employee();
	emp.getName("Ram");
	emp.getSalary(4854855);
	System.out.println(emp.Display());
	System.out.println();
	
	//Question 7
	System.out.println("Question 7");
	System.out.println();
	Animal animal=new Animal();
	Animal dog =new Dog();
	System.out.println(animal.display());
	System.out.println(dog.display());
	System.out.println();
	
	//Question 8
	System.out.println("Question 8");
	System.out.println();
	ElectricCar e_car=new ElectricCar();
	System.out.println(e_car.Parts());
	System.out.println(e_car.Fuel());
	System.out.println(e_car.Details());
	System.out.println();
	
	//Question 9
	System.out.println("Question 9");
	System.out.println();
	MathOperation Math=new MathOperation();
	System.out.println("458+65="+Math.add(458, 65));
	System.out.println("4845l+659l="+Math.add(4845l, 659l));
	System.out.println("485.2f+155.25f="+Math.add(485.2f, 155.25f));
	System.out.println("545457.25+3534.25="+Math.add(545457.25, 3534.25));
	System.out.println("458+655+256="+Math.add(458, 655, 256));
	System.out.println();
	
	//Question 10
	System.out.println("Question 10");
	System.out.println();
	Circle circle=new Circle();
	System.out.println("Area of Circle :"+circle.area(14));
	
	
	
	
	
	
	
	
	
	
	
	
















}	
}
