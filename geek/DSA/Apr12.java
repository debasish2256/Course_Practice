package DSA;

import java.util.Arrays;

/*"1. Cyclically rotate an array n number of times
Time Complexity can be O(n2)

A[] = {1, 2, 3, 4, 5}
N = 1

Output; 5 1 2 3 4


A[] = {1, 2, 3, 4, 5}
N = 2

Output;  4 5 1 2 3 


A[] = {1, 2, 3, 4, 5}
N = 3

Output: 3 4 5 1 2



2. Search Insert Position 

Given a sorted array of distinct integers and a target value, return the index if the target is found. If not, return the index where it would be if it were inserted in order.

You must write an algorithm with O(log n) runtime complexity.

Input: nums = [1,3,5,6], target = 5
Output: 2


Input: nums = [1,3,5,6], target = 2
Output: 1

Input: nums = [1,3,5,6], target = 7
Output: 4

https://leetcode.com/problems/search-insert-position/description/"
*/
public class Apr12 {
	public static void main(String[] args) {
		System.out.println(Arrays.toString(rotateArray(new int[] {1, 2, 3, 4, 5},3)));
		System.out.println(searchInsert(new int[] {1,3,5,6},6));
		
	}

	private static int searchInsert(int[] arr, int target) {
		int start = 0;
        int end = arr.length - 1;
        int ans = -1;
        while(start <= end){
            int mid = start + (end - start)/2;
            
            if(arr[mid] == target){
                return mid;
            }
            else if(arr[mid] < target){
                ans = mid;
                start = mid + 1;
            }
            else{
                end = mid - 1;
            }
        }
        return ans+1;
    }
	
	
	private static int[] rotateArray(int[] arr, int rot) {
		while(rot>0) {
			int lastEle=arr[arr.length-1];
			for(int i=arr.length-1;i>0;i--) {
				arr[i]=arr[i-1];
			}
			arr[0]=lastEle;
			rot--;
		}
		return arr;		
	}

}
