package DiwaliRevisionBasics;

public class Question9 {
//Compound Operation
	public static void main(String[] args) {
		int a=1535;
		System.out.println("Compound Addition of "+a+" and 15:"+(a+=15));
		System.out.println("Compound Subtraction of "+a+" and 15:"+(a-=15));
		System.out.println("Compound Multiplication of "+a+" and 35:"+(a*=35));
		System.out.println("Compound Division of "+a+" and 15:"+(a/=15));
		System.out.println("Final number :"+a);
	}
}
