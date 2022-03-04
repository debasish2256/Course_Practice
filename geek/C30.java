package geek;

import java.util.Arrays;
import java.util.Scanner;

public class C30 {
	public static void main(String[] args) {
//		findAverageTemp();
//		System.out.println(checkPermute(new int[] {2,1,3,5,5,6},new int[] {1,3,2,4,6,5}));
		rotateMatrixBy90Degree(new int[][] {
			{1, 2, 3, 7, 67,99},
			{4, 5, 6, 78,89,98},
			{7, 8, 9, 10,11,77}});
			
	}

	private static void rotateMatrixBy90Degree(int[][] mat) {
		int row = mat.length, col = mat[0].length;
		int diff=Math.abs(col-row);
		int[][] resMat=new int[col][row];
		for (int i = 0; i < row; i++) {
			for (int j = 0; j < col; j++) {
				resMat[j][row-i-1]=mat[i][j];
//				if(j-diff==mat.length) break;
			}
		}
		print2DMatrix(resMat);
	}
	
	private static void print2DMatrix(int[][] mat) {
		for (int[] val: mat) {
            System.out.println(Arrays.toString(val));
        }
	}

	private static boolean checkPermute(int[] arr1, int[] arr2) {
		int sum1=0,sum2=0,mul1=1,mul2=1;
		for(int val:arr1) {
			sum1+=val;
			mul1*=val;
		}
		for(int val:arr2) {
			sum2+=val;
			mul2*=val;
		}
		return (sum1==sum2 && mul1==mul2)?true:false;
	}

	private static void findAverageTemp() {
		System.out.print("Enter No. Of Days:");
		int size=new Scanner(System.in).nextInt();
		double temp[]=new double[size];
		double sum=0;
		for(int i=0;i<size;i++) {
			temp[i]=new Scanner(System.in).nextDouble();
			sum+=temp[i];
		}
		System.out.println("Average of Temp:"+(sum/size));
		System.out.println("Days Greater then average temp:");
		int count=0;
		for(double val:temp) {
			if((sum/size)<val) {
				count++;
			}
		}
// 		System.out.print(count); 
	}
}
