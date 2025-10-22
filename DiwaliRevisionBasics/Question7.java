package DiwaliRevisionBasics;

public class Question7 {
//Relation and logical operator
	public void check(int a) {
		if(a>10 && a<50) {
			System.out.println(a+" is between 10 and 50");
		}
		else {
			System.out.println(a+" is not between 10 and 50");
		}
	}
public static void main(String[] args) {
	Question7 q=new Question7();
	q.check(15);
	q.check(65);
	
}

}
