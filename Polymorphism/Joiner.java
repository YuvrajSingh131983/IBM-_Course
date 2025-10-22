package Polymorphism;

public class Joiner {
public void join(String a,String b) {
	System.out.println(a+b);
}
public void join(String a,String b,String c) {
	System.out.println(a+" "+b+" "+c);
}
public void join(String [] a) {
	for(int i=0;i< a.lenght;i++) {
		System.out.print(a[i]+",");
	}
}
public static void main(String[] args) {
	Joiner j= new Joiner();
	j.join("hello","java");
	j.join("Hello", "to", "Java");
	/*String [] a={"Hello","to","java","language"};
	j.join(a);*/
}
}
