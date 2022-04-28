package DSA;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.apache.commons.lang3.ArrayUtils;

/*"""1.Given two arrays which are sorted in increasing order.
Find the Union of two arrays
A [3,5,6,8,9]
B [5,7,9]

Output - 3,5,6,8,9,7

2. Given an array of size N-1 such that it only contains distinct integers in the range of 1 to N. Find the missing element
https://practice.geeksforgeeks.org/problems/missing-number-in-array1416/1

3. Array Subset of another array 


Given two arrays: a1[0..n-1] of size n and a2[0..m-1] of size m. Task is to check whether a2[] is a subset of a1[] or not. 
Both the arrays can be sorted or unsorted. It may be assumed that elements in both array are distinct.

https://practice.geeksforgeeks.org/problems/array-subset-of-another-array2317/1"""
*/
public class Apr11 {
	public static void main(String[] args) {
		System.out.println(Arrays.toString(unionOfArray(new int[] {3,5,6,8,9},new int[] {5,7,9})));
		System.out.println(missingNumber(new int[] {6,1,2,8,3,4,7,10,5},10));
		System.out.println(isSubset(new int[] {11, 1, 13, 21, 3, 7},new int[] {11, 3, 7, 1}));
	}

	private static int missingNumber(int[] arr,int n) {
//		int sum = IntStream.of(arr).sum();
//		int nSum=n*(n+1)/2;
		return (n*(n+1)/2)-(Arrays.stream(arr).sum());
	}

	
	private static String isSubset(int a1[], int a2[]) {
//		List<Integer> list = Arrays.stream(a1).boxed().collect(Collectors.toList());
		List<Integer> list = Arrays.asList(ArrayUtils.toObject(a1));
		for (int val : a2) {
			if (!list.contains(val)) {
				return "No";
			}
		}
		return "Yes";
	}
	
	private static int[] unionOfArray(int[] arr1, int[] arr2) {
		ArrayList<Integer> list=new ArrayList<>();
		int i=0,j=0;
		while (i<arr1.length && j<arr2.length) {
			if (arr1[i] > arr2[j]) {
				list.add(arr2[j++]);
			} else if (arr2[j] > arr1[i]) {
				list.add(arr1[i++]);
			} else {
				list.add(arr1[i]);
				i++;
				j++;
			} 
		}
		while(i<arr1.length) {
			list.add(arr1[i++]);
		}
		while(j<arr2.length) {
			list.add(arr2[j++]);
		}
		return list.stream().mapToInt(Integer::intValue).toArray();
	}

}
