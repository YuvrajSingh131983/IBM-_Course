package basicquestion;

public class basic {
public static void main(String[] args) {
	checkPrime(9);

	public void checkPrime(int k) {
	if (k==1) {
		System.out.println("not prime");
	}
	boolean flg=false;
	for (int i=2;i<k;i++)
	{
		if (k%i==0)
		{
		System.out.println("not prime");
		flg= true;
			break;
				}
		if (!flg) {
			System.out.println("Prime");
		}
	}
	
	
}
}

