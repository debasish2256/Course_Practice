package DSA;

import java.util.Arrays;

/*"1. Find the maximum element in each row and each column in a matrix
2. Search a sorted 2D Matrix
https://leetcode.com/problems/search-a-2d-matrix-ii/

3. Find the duplicate number

https://leetcode.com/problems/find-the-duplicate-number/

Given an array of integers nums containing n + 1 integers where each integer is in the range [1, n] inclusive.

There is only one repeated number in nums, return this repeated number.

You must solve the problem without modifying the array nums and uses only constant extra space.

 
Input: nums = [1,3,4,2,2]
Output: 2

Input: nums = [3,1,3,4,2]
Output: 3"
*/
public class Apr13 {
	public static void main(String[] args) {
		int[][] arr = new int[][] { { 3, 4, 1, 8 }, { 1, 4, 9, 11 }, { 76, 34, 21, 1 }, { 2, 1, 4, 5 } };
		findRowNColMax(arr);

		int[][] matrix = { 
				{ 1, 4, 7, 11, 15 }, 
				{ 2, 5, 8, 12, 19 }, 
				{ 3, 6, 9, 16, 22 },
				{ 10, 13, 14, 17, 24 },
				{ 18, 21, 23, 26, 30 } };
		int target = 5;
		System.out.println(searchMatrix(matrix, target));
		System.out.println(findDuplicate(new int[] {2,1,3,4,2}));
	}

	//range constraint [0-n]
	private static int findDuplicate(int[] nums) {
		int slow = nums[0];
        int fast = nums[0];
        do {
            slow = nums[slow];
            fast = nums[nums[fast]];
        } while (slow != fast);

        slow = nums[0];
        
        while (slow != fast) {
            slow = nums[slow];
            fast = nums[fast];
        }
        return fast;
	}

	public static boolean searchMatrix(int[][] matrix, int target) {
		for (int i = 0; i < matrix.length; i++) {
			int[] currentRow = matrix[i];
			if (target < currentRow[0])
				return false;
			if (Arrays.binarySearch(currentRow, target) >= 0)
				return true;
		}
		return false;
	}
	

	private static void findRowNColMax(int[][] arr) {
		for (int[] val : arr) {
			int max = Integer.MIN_VALUE;
			for (int value : val) {
				max = Math.max(max, value);
			}
			System.out.println("Maximun Of Each Row: " + max);
		}
		for (int i = 0; i < arr.length; i++) {
			int max = Integer.MIN_VALUE;
			for (int j = 0; j < arr[0].length; j++) {
				max = Math.max(max, arr[j][i]);
			}
			System.out.println("Maximun Of Each Col: " + max);
		}
	}
}
