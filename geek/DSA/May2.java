package DSA;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/*"1. Find the second minimum element in the array -> Come up with two appoaches and find which is best

2. Find the frequency of each String in the array
{""India"", ""Australia"",""India"",""Japan""}

Output 
India - 2
Australia - 1
Japan - 1"
*/public class May2 {
	public static void main(String[] args) {
		getFrequency(new String[] { "India", "Australia", "India", "Japan" });
		System.out.println("Second Min:"+ getSecondMinimum(new int[] { 2, 12, 3, 14, 5, 5, 6, 6, 7, 7, 7, 8, 8, 8, 9, 10, 13, 13, 11 }));
	}

	private static int getSecondMinimum(int[] arr) {
		int min1 = Integer.MAX_VALUE, min2 = Integer.MAX_VALUE;
		for (int val : arr) {
			min1 = Math.min(val, min1);
		}
		for (int val : arr) {
			min2 = min1 != val ? Math.min(val, min2) : min2;
		}
		return min2;
	}

	private static void getFrequency(String[] arr) {
		Map<String, Integer> map = new HashMap<>();
		for (String val : arr) {
			map.put(val, map.getOrDefault(val, 0) + 1);
		}
		System.out.println(map.toString().substring(1, map.toString().length() - 1).replaceAll(", ", "\n"));
	}
}
