package DSA;
/*"Trace the logic for Merge Sort algorithm
Input - {3,4,1,6,8}
*/

import java.util.Arrays;

public class Apr20 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a[] = { 3, 4, 1, 6, 8, 2 };

		int start = 0;
		int end = a.length - 1;

		System.out.println("Before : " + Arrays.toString(a));

		mergeSort(a, start, end);

		System.out.println("After : " + Arrays.toString(a));

	}

	private static void mergeSort(int[] a, int start, int end) {

		if (start < end) {
			int mid = (start + end) / 2;

			mergeSort(a, start, mid);
			mergeSort(a, mid + 1, end);
			merge(a, start, end, mid);
		}

	}

	private static void merge(int[] a, int start, int end, int mid) {

		int i = start;
		int j = mid + 1;
		int k = 0;

		int b[] = new int[a.length];

		while (i <= mid && j <= end) {
			if (a[i] <= a[j]) {
				b[k] = a[i];
				i++;
				k++;
			}

			else {
				b[k] = a[j];
				k++;
				j++;
			}
		}
		// If all the elements in the left array exhausts, then copy the remaining
		// values of right array
		while (i > mid && j <= end) {
			b[k] = a[j];
			k++;
			j++;
		}

		// If all the elements in the right array exhausts, then copy the remaining
		// values of left array
		while (j > end && i <= mid) {
			b[k] = a[i];
			k++;
			i++;
		}

		for (int m = start; m <= end; m++) {
			a[m] = b[m - start];
			// If start is 5, end is 8, then we have to pick the elements from 0 to 3 in the
			// temp array and place it accordingly. Hence m-start is used

		}

	}
}
