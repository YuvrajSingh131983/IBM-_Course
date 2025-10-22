package DiwaliRevisionBasics;

public class Question4 {
//Wrapper Class Conversion
	public static void main(String[] args) {
		int a=15;
		System.out.println("Before Conversion to wrapper class");
		System.out.println("Output:"+a);
		Integer num=a;// Auto-boxing
		System.out.println("Before Conversion to wrapper class");
		System.out.println("Output:"+a);
		int b=(int) num;//un-boxing
		System.out.println("After Conversion back to int");
		System.out.println("Output:"+b);
	}
}
 