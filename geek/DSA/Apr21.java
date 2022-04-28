package DSA;

import java.util.ArrayList;
import java.util.Arrays;

/*"1. Given two sorted arrays, the task is to merge them in a sorted manner.

Input: arr1[] = { 1, 3, 4, 5}, arr2[] = {2, 4, 6, 8} 
Output: arr3[] = {1, 2, 3, 4, 4, 5, 6, 8}

Input: arr1[] = { 5, 8, 9}, arr2[] = {4, 7, 8} 
Output: arr3[] = {4, 5, 7, 8, 8, 9} 1.

2. In which scenario do you use linked list and arraylist?
Ans: LinkedList should be used where modifications to a collection are frequent like addition/deletion operations.LinkedList is much faster as compare to ArrayList in such cases.
	 ArrayList we can use for searching while it is more frequent operation than add and remove operation.


3. Given an array of both positive and negative integers ‘arr[]’ which are sorted. The task is to sort the square of the numbers of the Array. 
Time complexity: O(n) 
space complexity: O(n) "
*/
public class Apr21 {
	public static void main(String[] args) {
		int arr1[] = { 1, 3, 4, 5}, arr2[] = {2, 4, 6, 8};
		System.out.println(Arrays.toString(mergeTwoSortedArray(arr1,arr2)));
		ArrayList<Integer> list=new ArrayList<>(Arrays.asList(-7,-3,2,3,11));
		list.stream().map(i->i*i).sorted().forEach(x->System.out.print(x+" "));
	}

	private static int[] mergeTwoSortedArray(int[] arr1, int[] arr2) {
		int res[]=new int[arr1.length+arr2.length];
		int i=0,j=0,k=0;
		while(i<arr1.length && j<arr2.length)
			if(arr1[i]<arr2[j])
				res[k++]=arr1[i++];
			else
				res[k++]=arr2[j++];
		while (i < arr1.length)
			res[k++] = arr1[i++];
		while (j < arr2.length)
			res[k++] = arr2[j++];
		return res;		
	}
}
