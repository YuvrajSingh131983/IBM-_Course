package LeetCodeHomework;

public class Homework1 {
//leetcode54
	public void leetcode54() {
		int [][] mat= {{1,2,3},{4,5,6},{7,8,9}};
		int row=mat.length;
		int col=mat[0].length;
		int top=0,bottom=row-1,left=0,right=col-1;
		while(top<=bottom && left<=right) {
			//left to right
			for (int i =left;i<=right;i++) {
				System.out.print(mat[top][i]+",");
				
			}top++;
			//top to bottom
			for (int i =top;i<=bottom;i++) {
				System.out.print(mat[top][right]+",");
			}
			right--;
			if(top<=bottom) {
				for (int i= right;i>=left;i--) {
					System.out.print(mat[bottom][i]+",");
				}bottom--;
			}
			if(left<=right) {
				for(int i=bottom;i>=top;i--) {
				 System.out.print(mat[i][left]+",");
				}
			}left++;
			
		}
	}
	
	//
}
