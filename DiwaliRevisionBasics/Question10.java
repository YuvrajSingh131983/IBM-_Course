package DiwaliRevisionBasics;

public class Question10 {
public static void main(String[] args) {
	int a=16;
	float b=25.1f;
	double c=1534.15;
	System.out.println("Addition of "+a+","+b+" and "+c+" :"+(a+b+c));
	/*
	 * Output of this expression is double 
	 * This happened due to a process called numeric promotion, which is an automatic   type conversion performed by Java. When different number types are mixed in an arithmetic expression, Java promotes the smaller, less-precise types to the largest, most-precise type in the expression to prevent data loss.
	 */
}
}
