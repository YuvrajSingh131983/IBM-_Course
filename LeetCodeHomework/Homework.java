package LeetCodeHomework;

public class Homework {
	//leetcode1
	public void leetcode1( int target) {
		int []nums= {12,25,32,2,14};
		int len=nums.length;
		for(int i=0,j=i+1;i<len && j<len;i++,j++) {
			int sum=nums[i]+nums[j];
				if(sum==target)
				{
					System.out.println("["+i+","+j+"]");
				}
		}
		
	}
	
	//leetcode26
	public void removeDuplicate() {
		int []num= {12,41,55,12,23,52,14,22,23,55};
		int len=num.length;
		for(int i=0;i<len ;i++)
		{
			for(int j=i+1;j<len;j++) {
			if(num[j]<=num[i])
			{
				int k=num[i];
				num[i]=num[j];
				num[j]=k;
			}
			}
		}
		int t=0;
		for(int i=0,g=i+1;i<len-1 && g<len+1;i++,g++)
		{
			
		 if(num[i]==num[g])
		 {
			 System.out.println("index :"+g+" value :"+num[g]);
			t+=1;
			int k=num[g];
			for(int j=g;j<len-1;j++)
			{
			num[j]=num[j+1];
			}
			
			num[len-1]=k;
		 }
		}
		System.out.println();
		for(int i=0;i<len-3;i++) {
			System.out.print(num[i]+",");
		}
	}
	
	
	//move zeros
	public void leetcode283() {
		int []num= {0,1,2,0,35,0,35,4,4};
		int len=num.length;
		for(int i=0;i<len;i++) {
			
			if (num[i]==0) {
				int k=num[i];
				for(int j=i;j<len-1;j++)
				{
				num[j]=num[j+1];
				}
				
				num[len-1]=k;
			
		}
		
			}
		for(int i=0;i<len;i++) {
			System.out.print(num[i]+",");
		}
	}
	
	
	//Maximum Subarray
	public void leetcode53() {
		int []num= {-2,5,-2,4,-1,-7,1,-2,6};
		int len=num.length;
		int sum=0;
		for(int i=0;i<len;i++) {
			
			sum+=num[i];
			if (sum<0) {
				sum=0;
			}
			//System.out.println("num :"+num[i]+"   "+sum);
			}
		System.out.println("Sum:"+sum);
	}
	
	// Contain duplicate
	public void leetcode217() {
		int []num= {12,14,25,22,11,4};
		int result=0;
		for(int i=0;i<num.length;i++)
		{
			for(int j=i+1;j<num.length;j++) {
			if(num[i]==num[j])
			{
				result=1;
				break;
			}
			}
			
		}
		if(result==1) {
			System.out.println("True");
		}
		else {
			System.out.println("False");
		}
	}
	
	//Search insert position
	public void leetcode35(int search) {
		int []num= {12,25,26,55,35};
		int len=num.length;
		int result=0;
		for(int i=0;i<num.length;i++)
		{
			if(num[i]==search) {
				System.out.println("index : "+i);
				result=1;
				break;
			}
			
			}
		if(result==0) {
				int [] newnum= new int[len+1];
				for(int i=0;i<newnum.length;i++)
				{
					int t=i;
					if(t!=len)
					{
						newnum[i]=num[i];
					}
					else {
						newnum[num.length]=search;
						System.out.println("index : "+i);
					}
				}
			}
		}
	
	//square of sorted array
	
	public void leetcode977() {
		int []num= {12,41,55,23,52,14,22,2,3,11};
		int len=num.length;
		for(int i=0;i<len ;i++)
		{
			for(int j=i+1;j<len;j++) {
			if(num[j]<=num[i])
			{
				int k=num[i];
				num[i]=num[j];
				num[j]=k;
			}
			}
	}
		for(int i=0;i<len ;i++) {
			num[i]=num[i]*num[i];
		}
		for(int i=0;i<len ;i++) {
			System.out.print(num[i]+",");
		}
	}
}
	

	


