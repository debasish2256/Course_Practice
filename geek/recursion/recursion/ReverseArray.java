package recursion;

import java.util.Arrays;

public class ReverseArray {
	public static void main(String[] args) {
		System.out.println(Arrays.toString(displayArrayReverse(new int[] { 2, 3, 4, 5, 6, 7 }, 0)));
	}

	private static int[] displayArrayReverse(int[] arr, int idx) {
		int size = arr.length - 1;
		if (idx > size / 2) {
			return arr;
		}
		swap(arr, idx, size - idx);
		return displayArrayReverse(arr, idx + 1);
	}

	private static void swap(int arr[], int i, int j) {
		int temp = arr[i];
		arr[i] = arr[j];
		arr[j] = temp;
	}
}
