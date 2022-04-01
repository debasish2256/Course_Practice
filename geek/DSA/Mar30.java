package geek;

import java.util.Arrays;

/*"1. Finding Missing Number in an array binary search
2. https://leetcode.com/problems/two-sum-ii-input-array-is-sorted/"
*/

public class Mar30 {
	public static void main(String[] args) {
		System.out.println(findMissingUsingBinary(new int[] {0,1,2,3,4,5,6,7,8,9,10,11,13}));
		System.out.println(Arrays.toString(twoSum(new int[] {2,7,8,11,15},9)));
	}
	
	public static int[] twoSum(int[] numbers, int target) {
	    int left=0, right=numbers.length-1;
	    while(left<right){
	        if(numbers[left]+numbers[right] == target){
	            return new int[]{left+1, right+1};
	        }else if(numbers[left]+numbers[right] > target){
	            right--;
	        }else{
	            left++;
	        }
	    }
	    return new int[2];
	}
	
	private static int findMissingUsingBinary(int[] arr) {
		int start=0;
		int end=arr.length-1;
		while(start<=end) {
			int mid=(start+end)/2;
			if( mid==0 || (mid!=arr[mid] && arr[mid-1]==mid-1)) {
				return mid;
			}else if(mid==arr[mid]) {
				start=mid+1;
			}else {
				end=mid-1;
			}	
		}
		return -1;
	}
}
