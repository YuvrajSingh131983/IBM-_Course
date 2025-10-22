package Day_3;

public class Demo3 {
	public static void main(String[] args) {
		// + * - /  %
		int a =5;
		int b=6;
		
		System.out.println(a++);//5 then value will get increase 6
		//a++;// post increment ----first operator will perform incre by 1
		
		System.out.println(a);
		System.out.println(++a ); //pre increment
		int aa=5;
		System.out.println((--aa+--aa)*(++aa-aa--)+(--aa+aa--)*(++aa+aa++));
		// assigning operators
		// = += -=  /= %=
		int k =12;
		k+=12;//k+k+12 boyh are the same
		int q=12;
		int p=12;
		// == >= <=
		if (p==12) {
			System.out.println("yes it is equal");
		
		}
		if (p>=12) {
			System.out.println("yes it is equal");
		
		}
		if (p<=12) {
			System.out.println("yes it is equal");
		
		}
		//   || --> or , & --> and
		boolean kl=true;
		boolean jh =false;
		// if there is only one true then or operator will give true and if there is only one false the you get false
		if (kl || jh || p==12 ||q <12) {
			System.out.println("if any one is true");
		}
		if (kl &&jh) {
			System.out.println("both are true");
			
		}
		else {
			System.out.println("may be one value is false");
		}
		
		
		//what is statements?
		//statement is the collection of expression 
		
		// Conditional statement 
		// if else if, else , switch
		
		int age =18;
		if (age<18) {
			System.out.println("age is less then 18");
		}
		else if (age>18) {
			System.out.println("age is greater than 18");
		}
		else {
			System.out.println("age is 18");
		}
		 // switch 
		int day =5;
		if (day==1) {
			System.out.println("Mon");
		}
		else if (day==2) {
			System.out.println("Tue");
	}
		else if (day==3) {
			System.out.println("Wed");
	}
		else if (day==4) {
			System.out.println("Thu");
	}else if (day==5) {
		System.out.println("Fri");
}
		
		switch(day) {
		case 1:
			System.out.println("mon");
			break;
		case 2:
			System.out.println("tue");
			break;
		case 3:
			System.out.println("wed");
			break;
		case 4:
			System.out.println("thu");
			break;
		case 5:
			System.out.println("fri");
			break;
		default:
			System.out.println(" you have a wrong value");
		
	}
		// loop statement
		// for , while ,do while
		for (int i=0;i<5;i++)
		{
			System.out.println("welcome");
		}
		/*
		 * for(int j=1; j>11;j++)
		{
			System.out.println(2*j);
		}
		
		// continue 
		for(int j=1; j>11;j++) {
			System.out.println(j);
			if (j==3) {
				continue;
			}
			if (j==7) {
				break;
			}
		}
		
		// while 
		int kk=5;
		while(kk>10) {
			System.out.println("home");
			kk=kk+2;}*/
		
		
		for(int i=0;i<10;i++)
			{System.out.println("this no. is -->"+i);}
		
		int kll=2;
		do {
			System.out.println("do");
			kll++;
		}while(kll<1);
		
		for(int h=)
}
}
