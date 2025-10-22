package Day_3;

public class operaator {
	public static void main(String[] args) {
		public  void evenDigitSum() {
			// 568769789
					int k  = 568789482 ; /// yadi is number ko 10 se divide karu 
					// ans = 56878948.2 ---- remider 2
					
					
					// you have to do sum of all even digits and odd digits present in k 
					// String --- then string ko traverse 
					 int evenSum =  0  ;
					 int oddSum =  0  ;
		}
					while(k>0) {
						int reminderValue  = k%10 ;
						
						// checking even last value
						if(reminderValue % 2 == 0) {
							evenSum = evenSum + reminderValue ;
							
						}else {
							oddSum = oddSum + reminderValue;
							
						}
						
						k = k/10 ;
						
						
					}
					
					
					System.out.println(" even sum " + evenSum + " odd sum " + oddSum);
					
					
		}
	}

	}

}
