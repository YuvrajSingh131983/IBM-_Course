package DiwaliRevisionLoopAndArray;

public class Question1to20 {
	//Question1: Even Odd
	public void checkEvenOdd(int a) {
		if(a%2==0) {
			System.out.println(a+" is an even no.");
		}
		else {
			System.out.println(a+" is an odd no.");
		}
	}
	//Question2:Largest of two no.
	public void LargestOfTwo(double a,double b) {
		if(a>b) {
			System.out.println(a+" is grater then "+b);
		}
		else {
			System.out.println(b+" is greater than "+a);
		}
	}
	//Question3:Check Leap Year
	public void LeapYear(int a) {
		if(a%4==0) {
			System.out.println(a+" is a leap year");
		}
		else {
			System.out.println(a+" is not a leap year");
		}
	}
	//Question4:Print 1 to 10 with loop
	public void print_1to10() {
		for(int i=1;i<11;i++) {
			System.out.print(i+" ,");
		}
	}
	//Question5:Sum of First N Natural No.
	public void N_NaturalNo(int n) {
		int sum=0;
		for(int i=1;i<=n;i++) {
			sum+=i;
		}
		System.out.println("Sum of first "+n+" Natural No. :"+sum);

	}
	//Question6:Print table of a no.
	public void Table(int a) {
		for(int i=1;i<=10;i++) {
			System.out.println(a+"x"+i+" :"+(a*i));
		}
	}
	//Question7: count no. of digits in a number
	public void CountDigits(int a) {
		int i=0;
		int original=a;
		while(a>0) {
			a/=10;
			i++;
		}
		System.out.println("No. of digits in "+original+" :"+i);
	}
	//Question8: Check Vowel and consonant
	public void checkVowelConsonant(char a) {
		switch(a) {
		case 'a':
			System.out.println(a+" is a vowel");
			break;
		case 'A':
			System.out.println(a+" is a vowel");
			break;
		case 'e':
			System.out.println(a+" is a vowel");
			break;
		case 'E':
			System.out.println(a+" is a vowel");
			break;
		case 'i':
			System.out.println(a+" is a vowel");
			break;
		case 'I':
			System.out.println(a+" is a vowel");
			break;
		case 'o':
			System.out.println(a+" is a vowel");
			break;
		case 'O':
			System.out.println(a+" is a vowel");
			break;
		case 'u':
			System.out.println(a+" is a vowel");
			break;
		case 'U':
			System.out.println(a+" is a vowel");
			break;
		default:
			System.out.println(a+" is a Consonant");
		}
	}
	//Question 9: Find Factorial
	public void Factorial(int a) {
		int fact=1;
		int original=a;
		while(a>0) {
			fact*=a;
			a--;
		}
		System.out.println("Factorial of "+original+" :"+fact);
	}
	//Question 10:Reverse a no.
	public void Reverse_No(int a) {
		int original=a;//creating a copy value of given no.
		int i=0;
		while(a>0) {
			a/=10;
			i++;
		}
		int reverse=0;
		int r=original;
		while(r>0) {
			int digit = r%10;
			reverse=reverse*10+digit;
			r/=10;
		}
		System.out.println("Reverse of "+original+" :"+reverse);
		
	}
	//Question 11: Sum of Elements of array
	public void SumOfArray() {
		int [] arr= {45,41,52,65,25,22,33,21,1,2,13,5,1,4};
		int size=arr.length;
		System.out.print("Array :");
		for(int i =0;i<size;i++) {
			System.out.print(arr[i]+" ");
		}
		System.out.println();
		int sumofarray=0;
		for(int i =0;i<size;i++) {
			sumofarray+=arr[i];
		}
		System.out.println("Sum of an Array :"+sumofarray);
	}
	//Question 12:Maximum and minimum
	public void MaxMini() {
		int [] arr= {45,41,52,65,25,22,33,21,1,2,13,5,1,4};
		int size=arr.length;
		System.out.print("Array :");
		for(int i =0;i<size;i++) {
			System.out.print(arr[i]+" ");
		}
		System.out.println();
		for(int i=0;i<size;i++) {
			for(int j=i;j<size;j++) {
			  if(arr[i]>arr[j]) {
				  int a=arr[i];
				  arr[i]=arr[j];
				  arr[j]=a;
				  
			  }
			}
		}
		System.out.println("Largest  of Array :"+arr[size-1]);
		System.out.println("Smallest of Array :"+arr[0]);
	}
	//Question 13:Search a no. in Array
	public void SearchNo(int a) {
		int [] arr= {45,41,52,65,25,22,33,21,1,2,13,5,1,4};
		int size=arr.length;
		System.out.print("Array :");
		for(int i =0;i<size;i++) {
			System.out.print(arr[i]+" ");
		}
		System.out.println();
		int x=0;
		int index=0;
		for(int i=0;i<size;i++) {
			if(a==arr[i]) {
				index=i;
				x=1;
				break;
			}
		}
		if(x==1) {
			System.out.println(a+" is in the array position :"+index);
		}
		else {
			System.out.println(a+" is not in the array ");
		}
	}
	//Question 14:Sort an array
	public void SortanArray() {
		int [] arr= {45,41,52,65,25,22,33,21,1,2,13,5,1,4};
		int size=arr.length;
		System.out.println("Array :");
		for(int i =0;i<size;i++) {
			System.out.print(arr[i]+" ");
		}
		System.out.println();
		for(int i=0;i<size;i++) {
			for(int j=i;j<size;j++) {
			  if(arr[i]>arr[j]) {
				  int a=arr[i];
				  arr[i]=arr[j];
				  arr[j]=a;
				  
			  }
			}
		}
		System.out.println("Sorted Array :");
		for(int i =0;i<size;i++) {
			System.out.print(arr[i]+" ");
		}
		System.out.println();
	}
	//Question 15: Count Even and Odd in an array
	public void CountEvenOdd() {
		int [] arr= {45,41,52,65,25,22,33,21,1,2,13,5,1,4};
		int size=arr.length;
		System.out.println("Array :");
		for(int i =0;i<size;i++) {
			System.out.print(arr[i]+" ");
		}
		System.out.println();
		int even=0;
		int odd=0;
		for(int i=0;i<size;i++) {
			if(arr[i]%2==0) {
				even++;
			}
			else {
				odd++;
			}
		}
		System.out.println("No. of odd  :"+odd);
		System.out.println("No. of even :"+even);
	}
	//Question16: Copy an Array
	public void CopyArray() {
		int [] arr= {45,41,52,65,25,22,33,21,1,2,13,5,1,4};
		int size=arr.length;
		int [] copy_arr=new int[size];
		
		System.out.println("Array :");
		for(int i =0;i<size;i++) {
			copy_arr[i]=arr[i];
			System.out.print(copy_arr[i]+" ");
		}
		System.out.println();
	}
	//Question 17: Add to Matrices
	public void addMatrix() {
		int[][] mat_1= {{12,25,32},{15,24,35},{21,33,22}};
		int[][] mat_2= {{14,15,36},{25,14,37},{10,29,19}};
		int row=mat_1.length;
		int col=mat_1[0].length;
		int [][]Sum_Mat= new int[row][col];//new Matrix
		for(int i=0;i<row;i++) {
			for(int j=0;j<col;j++) {
				Sum_Mat[i][j]=mat_1[i][j]+mat_2[i][j];
			}
		}
		//Print Matrix 1
		System.out.println("Matrix 1:");
		int a=0;
		for(int i=0;i<row;i++) {
			for(int j=0;j<col;j++) {
				System.out.print(mat_1[i][j]+" ");
				if(a==i && j==2) {
					System.out.println();
					a++;
				}
			}
		}
		//Print Matrix 2
		System.out.println("Matrix 2:");
		int b=0;
		for(int i=0;i<row;i++) {
			for(int j=0;j<col;j++) {
				System.out.print(mat_2[i][j]+" ");
				if(b==i && j==2) {
					System.out.println();
					b++;
				}
			}
		}
		//Print Sum of Matrices
		System.out.println("Sum Matrices:");
		int c=0;
		for(int i=0;i<row;i++) {
			for(int j=0;j<col;j++) {
				System.out.print(Sum_Mat[i][j]+" ");
				if(c==i && j==2) {
					System.out.println();
					c++;
				}
			}
		}
		
	}
	//Question18: Transpose of Matrix
	public void Tran_mat() {
		int[][] mat= {{12,25,32},{15,24,35},{21,33,22}};
		int row=mat.length;
		int col=mat[0].length;
		int [][] tran_mat= new int[row][col];
		for(int i=0;i<row;i++) {
			for(int j=0;j<col;j++) {
				tran_mat[j][i]=mat[i][j];
			}
		}
		//Print Matrix 
		System.out.println("Original Matrix :");
		int a=0;
		for(int i=0;i<row;i++) {
			for(int j=0;j<col;j++) {
				System.out.print(mat[i][j]+" ");
				if(a==i && j==2) {
					System.out.println();
					a++;
				}
			}
		}
		//Print Transpose of Matrix
		System.out.println("Tranpose of Matrix :");
		int b=0;
		for(int i=0;i<row;i++) {
			for(int j=0;j<col;j++) {
				System.out.print(tran_mat[i][j]+" ");
				if(b==i && j==2) {
					System.out.println();
					b++;
				}
			}
		}

	}
	//Question 19: Sum of Diagonals 
	public void SumOfDiagonals() {
		int[][] mat= {{12,25,32},{15,24,35},{21,33,22}};
		int row=mat.length;
		int col=mat[0].length;
		int sum_dig=0;
		for(int i=0;i<row;i++) {
			sum_dig+=mat[i][i];
			sum_dig+=mat[i][row-1-i];
			
		}
		sum_dig-=mat[row/2][col/2];
		System.out.println("Sum of diagonals of a square matrix : "+sum_dig);
		
	}
	//Question 20: Multiplication of two matrices
	public void Product_Matrix() {
		int[][] mat_1= {{12,25,32},{15,24,35},{21,33,22}};
		int[][] mat_2= {{14,15,36},{25,14,37},{10,29,19}};
		int row=mat_1.length;
		int col=mat_1[0].length;
		int [][]Pro_Mat= new int[row][col];//new Matrix
		for(int i=0;i<row;i++) {
			for(int j=0;j<col;j++) {
				Pro_Mat[i][j]=mat_1[i][j]*mat_2[i][j];
			}
		}
		//Print Matrix 1
		System.out.println("Matrix 1:");
		int a=0;
		for(int i=0;i<row;i++) {
			for(int j=0;j<col;j++) {
				System.out.print(mat_1[i][j]+" ");
				if(a==i && j==2) {
					System.out.println();
					a++;
				}
			}
		}
		//Print Matrix 2
		System.out.println("Matrix 2:");
		int b=0;
		for(int i=0;i<row;i++) {
			for(int j=0;j<col;j++) {
				System.out.print(mat_2[i][j]+" ");
				if(b==i && j==2) {
					System.out.println();
					b++;
				}
			}
		}
		//Print Sum of Matrices
		System.out.println("Product of  Matrices:");
		int c=0;
		for(int i=0;i<row;i++) {
			for(int j=0;j<col;j++) {
				System.out.print(Pro_Mat[i][j]+" ");
				if(c==i && j==2) {
					System.out.println();
					c++;
				}
			}
		}
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
