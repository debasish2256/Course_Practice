package geek;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;


/*"make an array with user inputs of size 10. , then find sum of all elements in array
make an array with user inputs of size 10. , then find midle element in an array
make an array with user inputs of size 10. then print all positive numbers in an array"
*/
/*	Given an array of integers a[n] and an integer number k as a target sum
Determine whether there is a pair of elements a[i] and a[j] that sums exactly to k
Eg.  [1, 3, 7] and k = 8 then the answer is true, but given k=5 then the answer is false*/

public class C18 {
	public static void main(String[] args) {
//		C/W
		int[] num1= {4,5,6};
		int[] num2= {4,5,6};
		System.out.println(Arrays.equals(num1, num2));
		System.out.println(compareArray(num1,num2)?"Equal":"Not Equal");
		int[] arr= new int[] {8,7,6,5,7,8,9};
		System.out.println("Min Val:"+maxMin(arr)[0]+" Max Val:"+maxMin(arr)[1]);
		System.out.println("Target Frequency: "+frequencyOfTargetElement(arr,7));
		frequencyOfElement(arr);
		System.out.println(findMissingElementFromArray(arr));
		System.out.println(findMissingUsingMath(arr));
		findPairSum_1(arr,14);
		findPairSumWithMap(arr,14);
		
		
//		H/W
		findArraySum();
		findMiddleOfArray();
		printPositiveNumber();

	}
	
	private static void printPositiveNumber() {
		String res="";
		Scanner sc=new Scanner(System.in);
		int size=sc.nextInt();
		int[] arr=new int[size];
		for(int i=0;i<size;i++) {
			arr[i]=sc.nextInt();
			if(arr[i]>0)
				res+=arr[i]+",";
		}
		System.out.println(res);
	}

	private static void findMiddleOfArray() {
		Scanner sc=new Scanner(System.in);
		int size=sc.nextInt();
		int[] arr=new int[size];
		for(int i=0;i<size;i++) {
			arr[i]=sc.nextInt();
		}
		System.out.println("Middle Array Is: "+arr[(size/2)-1]);
		
	}

	private static void findArraySum() {
		Scanner sc=new Scanner(System.in);
		int size=sc.nextInt();
		int sum=0;
		for(int i=0;i<size;i++) {
			sum+=sc.nextInt();
		}
		System.out.println("Array Sum Is: "+sum);
	}

	private static void findPairSumWithMap(int[] nums, int target) {
		Map<Integer, Integer> numMap = new HashMap<>();
		for (int i = 0; i < nums.length; i++) {
			int complement = target - nums[i];
			if (numMap.containsKey(complement)) {
				System.out.println(nums[numMap.get(complement)]+","+ nums[i] );
			} else {
				numMap.put(nums[i], i);
			}
		}
	}

	private static void findPairSum_1(int[] arr, int target) {
		Arrays.sort(arr);
		int low=0;
		int high=arr.length-1;
		while(low<high) {
			if(arr[low]+arr[high]>target) {
				high--;
			}else if(arr[low]+arr[high]<target) {
				low++;
			}else {
				System.out.println(arr[low]+","+arr[high]);
				low++;high--;
			}
		}
	}

	private static void findPairSum(int[] arr, int target) {
		for(int i=0;i<arr.length;i++) {
			for(int j=i+1;j<arr.length;j++) {
				if(arr[i]+arr[j]==target) {
					System.out.println(arr[i]+","+arr[j]);
				}
			}
		}
	}


	
	
	
	
	
	
	
	private static int findMissingUsingMath(int[] arr) {
		for(int i=0;i<arr.length;i++) {
			if(arr[i]!=i+1) {
				return i+1;
			}
		}
		return 0;
	}

	private static int findMissingElementFromArray(int[] arr) {
		int target=arr[0];
		for(int val:arr) {
			if(val!=target) {
				return target;
			}
			target++;
		}
		return 0;
	}

	private static int frequencyOfTargetElement(int[] arr,int target) {
		int count=0;
		for(int val:arr) {
			if(val==target) 
				count++;
		}
		return count;
	}

	private static void frequencyOfElement(int[] arr) {
		for(int i=0;i<arr.length;i++) {
			int count=0;
			for(int val:arr) {
				if(val==arr[i])
					count++;
			}
			System.out.print(arr[i]+"--->"+count+"\n");
		}
	}

	private static int[] maxMin(int[] arr) {
		int min=Integer.MAX_VALUE;
		int max=Integer.MIN_VALUE;
		for(int val:arr) {
			min=Math.min(val, min);
			max=Math.max(val, max);
		}
		return new int[]{min,max};
	}

	private static boolean compareArray(int[] num1,int[] num2) {
		int i=0;
		if(num1.length!=num2.length)
			return false;
		while(i<num1.length) {
			if(num1[i]!=num2[i]) {
				return false;
			}
			i++;
		}
		return true;
	}
}
