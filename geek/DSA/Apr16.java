package DSA;

import java.util.Stack;

/*"Solve the programs using recursion -
1. Find the maximum number in an array
a[] = { 3,5,7,1,0};

Output - 7

2. Find the sum of all numbers in an array
3. Print the negative numbers in an array
4. Print the reverse of a number"
*/
public class Apr16 {
	public static void main(String[] args) {
		System.out.println(maximumNumber(new int[] {3,5,7,1,0},5));
		System.out.println(reverseNumber(234567,0));
		printNegative(new int[] {2,3,34,-9,8,-7,-6,0,-1,-2},0);
		sumOfAllNumbers(new int[] {2,3,34,9,8,7,6,0,1,2},0,0);
	}

	
	
	
	private static void sumOfAllNumbers(int[] arr, int n, int sum) {
		if(arr.length==n) {
			System.out.println(sum);
			return;
		}
		sum+=arr[n];
		sumOfAllNumbers(arr,n+1,sum);	
	}

	private static void printNegative(int[] arr,int n) {
		if(arr.length==n) {
			return;
		}
		if(arr[n]<0) {
			System.out.print(arr[n]+" ");
		}
		printNegative(arr,n+1);
	}

	private static int maximumNumber(int[] arr,int n) {
		if(n == 1)
			return arr[n];     
		return Math.max(arr[n-1], maximumNumber(arr, n-1));
	}

	private static int reverseNumber(int num,int rev) {
		if(num==0) {
			return rev;
		}
		rev=10*rev+num%10;
		return reverseNumber(num/10,rev);
	}

	
	
}
