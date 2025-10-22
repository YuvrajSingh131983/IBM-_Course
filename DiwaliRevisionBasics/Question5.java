package DiwaliRevisionBasics;

public class Question5 {
// String to Wrapper class
	public static void main(String[] args) {
		String s="123";
		System.out.println("Before Conversion:");
		System.out.println("String;"+s);
		Integer num=Integer.valueOf(s);
		System.out.println("After Conversion to integer wrapper class");
		System.out.println("Integer:"+num);
		System.out.println("Adding 10 to Number :"+(num+10));
	}
}
