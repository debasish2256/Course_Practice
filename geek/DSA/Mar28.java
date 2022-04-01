package geek;

import java.util.ArrayList;
import java.util.List;

/*1. WAP for searching a number using binary search. Return the index of the num if exists else return -1
2. Find the cube root of a number using binary search
3. Find the intersection elements of two sorted arrays
	A[] = { 3,6,8}   B[] ={1,2,3,5,6,90,789}
	Output = 3,6
*/
public class Mar28 {
	public static void main(String[] args) {
		System.out.println(searchUsingBinarySearch(new int[] { 3, 4, 5, 6, 7, 8, 9 },4));
		System.out.println(findCubeRoot(27));
		int a[]= {3,6,8},b[]= {1,2,3,4,5,6,90,789};
		System.out.println(findIntersection(a,b));
	}

	private static List<Integer> findIntersection(int[] a, int[] b) {
		List<Integer> result=new ArrayList<>();//to restrict duplicate we can store the result in HashSet
		for(int val:a) {
			if(searchUsingBinarySearch(b,val)!=-1) {
				result.add(val);
			}
		}
		return result;
	}

	private static int findCubeRoot(int num) {
		int low = 1, high = num;
		int mid = (low + high) / 2;
		while (mid != low && Math.pow(mid, 3) != num) {
			if (Math.pow(mid, 3) > num) {
				high = mid;
			} else {
				low = mid;
			}
			mid = (low + high) / 2;
		}
		return mid;
	}

	private static int searchUsingBinarySearch(int[] array, int key) {
		int low = 0, high = array.length - 1;
		while (low <= high) {
			int mid = low + (high - low) / 2;

			if (array[mid] == key)
				return mid + 1;
			else if (array[mid] < key)
				low = mid + 1;
			else
				high = mid - 1;
		}
		return -1;
	}
}
