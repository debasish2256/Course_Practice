package DSA;

import java.util.Arrays;

/*" 1. Rotate a matrix in place by Anti-Clockwise by n times

If n = 1,

1  2  3
4  5  6
7  8  9


Output:
3  6  9 
2  5  8 
1  4  7 



If n = 2,

1  2  3
4  5  6
7  8  9

9 8 7 
6 5 4 
3 2 1


2. Find the number of rows which is sorted in increasing order in a given matrix

int a[][] = { { 1, 2, 3, 4 }, { 4, 6, 7, 1 }, { 2, 3, 7, 9 }, { 7, 12, 15, 7 } };

Count : 2

Explaination -> row 0 and row 2 are sorted in increasing order"
*/
public class Apr15 {
	static int mat[][] = { 
			{ 1, 2, 3 }, 
			{ 4, 5, 6 }, 
			{ 7, 8, 9 }};
	public static void main(String[] args) {
		int rot=2;
		while(rot>0) {
			rotateMatrixBy90Degree();
			rot--;
		}
		print2DMatrix(mat);

		int mat1[][] = { 
				{ 1, 2, 3, 4 }, 
				{ 4, 6, 7, 1 },
				{ 2, 3, 7, 9 }, 
				{ 7, 21, 15, 7 } };
		System.out.println(validateRowWise(mat1));
	}

	private static int validateRowWise(int[][] mat) {
		int res=mat.length;
		for(int[] arr:mat) {
			for(int i=1;i<arr.length;i++) {
				if(arr[i]<arr[i-1]) {
					res--;
					break;
				}
			}
		}
		return res;
	}

	private static void rotateMatrixBy90Degree() {
		int row = mat.length, col = mat[0].length;
		for (int i = 0; i < row/2; i++) {
			for (int j = 0; j < col-i-1; j++) {
				int temp=mat[i][j];
				mat[i][j]=mat[j][col-1-i];
				mat[j][col-1-i]=mat[col-1-i][col-1-j];
				mat[col-1-i][col-1-j]=mat[col-1-j][i];
				mat[col-1-j][i]=temp;
			}
		}
	}
	
	private static void print2DMatrix(int[][] mat) {
		for (int[] val: mat) {
            System.out.println(Arrays.toString(val));
        }
	}
}
