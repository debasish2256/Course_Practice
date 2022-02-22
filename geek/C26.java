package geek;

/*"
1.)  Write a program to check for lower triangular matrix
2.)  Find the sum of diagonal elements of a matrix
3.)  Check whether the matrix is sparse."
*/

public class C26 {
	public static void main(String[] args) {
		System.out.println(isLowerTriangularMatrix(new int[][] { 
			{ 1, 0, 0 }, 
			{ 4, 3, 0 }, 
			{ 6, 5, 6 } }));
		
		sumOfDiagonalMatrix(new int[][] { 
			 { 1, 2, 3, 4 },
			 { 5, 6, 7, 8 },
             { 1, 2, 3, 4 },
             { 5, 6, 7, 8 } });
		
		System.out.println(isMatrixSparse(new int[][] {
			{4, 0, 0},  
            {0, 5, 0},  
            {0, 0, 6} }));
		
	}

	private static boolean isMatrixSparse(int[][] mat) {
		int row=mat.length,col=mat[0].length;
		int count=0,size=row*col;
		for(int i=0;i<row;i++) {
			for(int j=0;j<col;j++) {
				if(mat[i][j]==0) {
					count++;
				}
			}
		}
		return count>(size/2);
	}

	private static void sumOfDiagonalMatrix(int[][] mat) {
		int row=mat.length,col=mat[0].length;
		int sum1=0,sum2=0;
		for(int i=0;i<col;i++) {
			sum1+=mat[i][i];
			sum2+=mat[i][col-i-1];
		}
		System.out.println("Sum Of Diagonal 1:"+sum1);
		System.out.println("Sum Of Diagonal 2:"+sum2);
	}
	
	
	private static boolean isLowerTriangularMatrix(int[][] mat) {
		if(mat.length!=mat[0].length) {
			return false;
		}
		for(int i=0;i<mat.length;i++) {
			for(int j=i+1;j<mat[0].length;j++) {
				if(mat[i][j]!=0) {
					return false;
				}
			}
		}
		return true;
	}
}
