package geek;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

/*https://github.com/geeksterin/Jan22-Java-Fundamentals/blob/main/Arrays%20Questions.pdf
*/
public class C20 {
	public static void main(String[] args) {
		System.out.println(Arrays.toString(maxProductOfTwoIntegers(new int[] {10,20,30,40,50})));
		System.out.println(Arrays.toString(maxProductOfTwoIntegers_1(new int[] {10,20,30,40,50})));
		System.out.println(isArrayUnique(new int[] {1,2,3,4,5,6}));
		System.out.println(isArrayUnique_1(new int[] {1,2,3,4,5,6}));
		System.out.println(permute(new int[]{5,1,2,3,4},new int[] {1,2,3,4,5},0));		
		System.out.println(Arrays.toString(middle(new int[] {1,2,3,4})));
	}

	private static boolean permute(int[] array1, int[] array2, int start) {
		if(start==array2.length-1) {
//			System.out.println(Arrays.toString(array2));
		}
		for(int i=start;i<array2.length;i++) {
			int temp=array2[start];
			array2[start]=array2[i];
			array2[i]=temp;
			permute(array1,array2,start+1);
			if(Arrays.toString(array1).equals(Arrays.toString(array2)))
				return true;
			array2[i]=array2[start];
			array2[start]=temp;
		}
		return false;
	}

	private static int[] middle(int[] arr) {
		int temp[]=new int[arr.length-2];
		int count=0;
		for(int i=1;i<=arr.length-2;i++) {
			temp[count++]=arr[i];
		}
		return temp;
	}

	public static boolean isArrayUnique_1(int arr[])
    {
	    Integer[] aInt = new Integer[arr.length];
	    Arrays.setAll(aInt, i -> arr[i]); //int array to integer array
		return (new HashSet<Integer>(Arrays.asList(aInt)).size() == aInt.length);
    }
	
	
	private static boolean isArrayUnique(int[] arr) {
		int temp[]=new int[arr.length+1];
		for(int i=0;i<arr.length;i++) {
			temp[arr[i]]=temp[arr[i]]+1;
		}
		for(int val:temp) {
			if(val>1)	return false;
		}
		return true;
	}

	//TC:O(NlogN)
	private static int[] maxProductOfTwoIntegers(int[] arr) {
		Arrays.sort(arr);
		int num1,num2;
		int product1=arr[0]*arr[1];
		int product2=arr[arr.length-1]*arr[arr.length-2];
		num1=product1>product2?arr[0]:arr[arr.length-2];
		num2=product1>product2?arr[1]:arr[arr.length-1];
		return new int[] {num1,num2,num1*num2};
	}
	
//	TC:O(N)
	private static int[] maxProductOfTwoIntegers_1(int[] arr) {
		//keep track of min,max
		int size=arr.length;
		int max1=arr[0],max2=Integer.MIN_VALUE;
		int min1=arr[0],min2=Integer.MAX_VALUE;
		for(int i=1;i<size;i++) {
			if(arr[i]>max1) {
				max2=max1;
				max1=arr[i];
			}else if(arr[i]>max2) {
				max2=arr[i];
			}
			if(arr[i]<min1) {
				min2=min1;
				min1=arr[i];
			}else if(arr[i]<min2) {
				min2=arr[i];
			}
		}
		if(max1*max2>min1*min2)
			return new int[]{max2,max1,max1*max2};
		else
			return new int[]{min2,min1,min1*min2};
	}
}
