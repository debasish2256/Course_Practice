package geek;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/*"1.WAP to reverse an array	
2.Given a random set of numbers, Print them in sorted order.
3. WAP to find first index at which element is present in array 
4. WAP to find last index at which element is present in array "
*/

public class C19 {
	public static void main(String[] args) {
//		 C/W
		 System.out.println(Arrays.toString(matrixSum(new int[] {10,20,30,40,50},new int[] {9,18,27,36})));
		 System.out.println(Arrays.toString(findDuplicateInArray(new int[] {1,2,3,1,2,3,4,5,5,6})));
		 findDuplicateInArray(new int[] {0,0,1,2,3,1,2,3,4,5,5,6,7,7});
		 System.out.println(Arrays.toString(reverStringArray(new
		 String[]{"Hello","Jack","Johny","Jimmy","Ram"})));
		 System.out.println(findTrailingZeros(4));
		 System.out.println(countDer(4));
		 
//		 H/W
		System.out.println(Arrays.toString(reverseArray(new int[] {1,2,3,4,5,6,7,8,9,11})));
		System.out.println(Arrays.toString(sortRandomSetOfNumbers(new int[] {54,63,14,78,2,3})));
		//merged 3 and 4
		int[] arr=new int[] {23,56,67,89,90,92,67,98,93,78,67,98,89,41};
		System.out.println(findLastAndFirstIndex(arr,67));
		//Efficient Way to find last and first index with sorted Array,TC: log N
		/*Arrays.sort(arr);
		System.out.println(findFirstAndLastIndex(arr,67));*/
	}

	private static String findFirstAndLastIndex(int[] arr, int target) {
		int[] res= {-1,-1};
		int low=0,high=arr.length-1;
		//use two bs for finding both
		while(low<=high) {
			int mid=(low+high)/2;
			if(arr[mid]==target) {
				res[0]=mid+1;
				high=mid-1;
			}else if(arr[mid]<target) {
				low=mid+1;
			}else {
				high=mid-1;
			}
		}
		low=0;high=arr.length-1;
		while(low<=high) {
			int mid=(low+high)/2;
			if(arr[mid]==target) {
				res[1]=mid+1;
				low=mid+1;
			}else if(arr[mid]<target) {
				low=mid+1;
			}else {
				high=mid-1;
			}
		}
		return new String("First Found Index:"+res[0]+" ,Last Found Index:"+res[1]);
	}

	private static String findLastAndFirstIndex(int[] arr, int target) {
		int[] res= {-1,-1};
		for(int i=0;i<arr.length;i++) {
			if(arr[i]==target) {
				res[0]=i+1;
				break;
			}
		}
		for(int i=arr.length-1;i>=0;i--) {
			if(arr[i]==target) {
				res[1]=i+1;
				break;
			}
		}
		return new String("First Found Index:"+res[0]+" ,Last Found Index:"+res[1]);
	}

	private static int[] sortRandomSetOfNumbers(int[] a) {
		for(int i=0;i<a.length-1;i++) {
			for(int j=i+1;j<a.length;j++) {
				if(a[i]>a[j]) {
					int temp=a[i];
					a[i]=a[j];
					a[j]=temp;
				}
			}
		}
		return a;		
	}

	private static int[] reverseArray(int[] arr) {
		for(int i=0;i<arr.length/2;i++) {
			int temp=arr[i];
			arr[i]=arr[arr.length-1-i];
			arr[arr.length-1-i]=temp;
		}
		return arr;
	}

	static int countDer(int n) {
		if (n == 1)
			return 0;
		if (n == 2)
			return 1;
		return (n - 1) * (countDer(n - 1) + countDer(n - 2));
	}

	static int findTrailingZeros(int n) {
		if (n < 0)
			return -1;

		int count = 0;

		for (int i = 5; n / i >= 1; i *= 5)
			count += n / i;

		return count;
	}

	private static String[] reverStringArray(String[] strArray) {
		for (int i = 0; i < strArray.length / 2; i++) {
			String temp = strArray[strArray.length - 1 - i];
			strArray[strArray.length - 1 - i] = strArray[i];
			strArray[i] = temp;
		}
		return strArray;
	}

	private static Integer[] findDuplicateInArray(int[] arr) {
		List<Integer> res = new ArrayList<>();
		int tempArray[] = new int[arr.length];
		for (int i = 0; i < arr.length; i++) {
			tempArray[arr[i]] = tempArray[arr[i]] + 1;
		}
		for (int i = 0; i < tempArray.length; i++) {
			if (tempArray[i] > 1) {
				res.add(i);
			}
		}
		return res.stream().toArray(Integer[]::new);
	}

	private static int[] matrixSum(int[] mat1, int[] mat2) {
		int size = Math.min(mat1.length, mat2.length);
		int i = 0;
		int res[] = new int[size];
		while (i < size) {
			res[i] = mat1[i] + mat2[i];
			i++;
		}
		return res;
	}
}
