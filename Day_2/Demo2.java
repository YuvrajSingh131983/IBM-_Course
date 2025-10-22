package Day_2;



public class Demo2 {
	public static void main(String[] args) {
		
	

	//what are wrapper classess
	//int char boolean double float long byte short 
	
	/*int z=5;
	Integer s =20;
	int ll=Integer.MAX_VALUE;
	int leastValue =Integer.MIN_VALUE;
	System.out.println(ll);
	System.out.println(leastValue);
	*/
	Boolean h=true;
	Integer pp =78;//obj
	int aa =45;// not obj
	Integer s2=Integer.max(pp,aa);
	System.out.println(s2);
	
	/* Double l=90.0;
	Short kl=79;
	Long op=7791;
	*/
	
	//casting // it is process to convert one data type into another
	 byte oi=45;
	 int kj =oi;// there is example of casting here byte is getting convert into integer 
	 //and here small data type is converted into big one so
	 // 
	 
	 int uppi= 48744;
	 //byte kh = ui; here there will be issue because u r converting into small data type so you neeed to do explicitly like this
	 byte kls =(byte)uppi;
	 //left to right ---> widening implicit
	 //right to left ---->narrow -->explicit
	
	
	// object vo hota hai jo kisi class se ara hai
	//class--- is judt blue print of an object
	
	//* Integer is a class under Lang package which is automsticly imported when java coder is open
	}
}
