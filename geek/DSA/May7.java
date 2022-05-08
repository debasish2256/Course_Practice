package DSA;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
/*1. Check if an array is sorted
https://www.geeksforgeeks.org/program-check-array-sorted-not-iterative-recursive/

2. Find the leaders in the array
https://practice.geeksforgeeks.org/problems/leaders-in-an-array-1587115620/1

3. Mountain array
https://www.geeksforgeeks.org/find-whether-given-array-is-in-form-of-a-mountain-or-not/

4. Sum of Array without itself
https://www.geeksforgeeks.org/a-sum-array-puzzle/

5. Product of Array without itself
https://practice.geeksforgeeks.org/problems/product-array-puzzle4525/1/?page=1&difficulty[]=0&category[]=Arrays&sortBy=submissions

6. Find the majority element in an array
*/
public class May7 {
	public static void main(String[] args) {
//		System.out.println(leaders(new int[] {16,17,4,3,5,2}));
		System.out.println(isMountain(new int[] {1, 2,2, 3,3, 4, 9, 8, 7, 6, 5}));
//		System.out.println(Arrays.toString(sumArray(new int[] {4,5,7,3,10,1})));
		System.out.println(Arrays.toString(productExceptItself(new int[] {4,5,7,3,10,1})));
	}
	
	private static int[] productExceptItself(int[] nums) {
		int [] result=new int[nums.length];
        if(nums.length<=0){
            return result;
        }
        int i=0;
        int tmp=1;
        for(i=0;i<nums.length;i++){
            result[i]=tmp;
            tmp*=nums[i];
        }
        tmp=1;
        for(i=nums.length-1;i>=0;i--){
            result[i]=tmp*result[i];
            tmp*=nums[i];
        }
        return result;
	}

	private static int[] sumArray(int[] arr) {
		int sum=0;
		for(int val:arr){
		   sum+=val;
		}
		for(int i=0;i<arr.length;i++){
		   arr[i]=sum-arr[i];
		}
		return arr;
	}
	
	static boolean isMountain_1(int arr[])
	{
		int size = arr.length;
		int i = 0;
		while (i + 1 < size && arr[i] < arr[i + 1])
			i++;
		if (i == 0 || i == size - 1)
			return false;
		while (i + 1 < size && arr[i] > arr[i + 1])
			i++;
		return i == size - 1;
	}
	
	private static boolean isMountain(int[] arr) {
		int peak = 0;
		if (arr.length < 3) return false;
		for (int i = 0; i < arr.length - 1; i++) {
			if (arr[i + 1] <= arr[i]) {
				peak = i;
				break;
			}
		}
		if (peak == 0 || peak == arr.length - 1) return false;
		for (int i = peak; i < arr.length - 1; i++) {
			if (arr[i] <= arr[i + 1]) {
				return false;
			}
		}
		return true;
	}

	static ArrayList<Integer> leaders(int arr[]) {
		ArrayList<Integer> ans = new ArrayList<>();
		int size=arr.length;
		if (size <= 1)
			return ans;
		ans.add(arr[size - 1]);
		int temp = arr[size - 1];
		for (int i = size - 2; i >= 0; i--) {
			if (arr[i] >= temp) {
				ans.add(arr[i]);
				temp = arr[i];
			}
		}
		Collections.reverse(ans);
		return ans;
	}
}
