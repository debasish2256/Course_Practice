package DSA;
/*"Find the squares of a sorted array
https://www.geeksforgeeks.org/sort-array-converting-elements-squares/

Sum of Unique elements
https://leetcode.com/problems/sum-of-unique-elements/"
*/
import java.util.Arrays;

public class May4 {
	static int distance(String[] s, String word1, String word2) {
		int count1 = -1, count2 = -1, minDis = Integer.MAX_VALUE;
		for (int i = 0; i < s.length; i++) {
			if (s[i].equals(word1))
				count1 = i;
			if (s[i].equals(word2))
				count2 = i;
			if (count1 != -1 && count2 != -1)
				minDis = Math.min(minDis, Math.abs(count1 - count2));
		}
		return minDis == Integer.MAX_VALUE ? -1 : minDis;
	}

	public static int sumOfUnique(int[] nums) {
		int[] freq = new int[101];
		int sum = 0;
		for (int num : nums) {
			freq[num]++;
		}
		for (int i = 0; i < freq.length; i++) {
			if (freq[i] == 1) {
				sum += i;
			}
		}
		return sum;
	}

	private static int[] sortArrayByParity_II(int[] nums) {
		int i = 0;
		int j = 1;
		while (i < nums.length && j < nums.length) {
			if (nums[i] % 2 == 1 && nums[j] % 2 == 0)
				swap(nums, i, j);
			else if (nums[i] % 2 == 0)
				i += 2;
			else
				j += 2;
		}
		return nums;
	}

	public static int[] sortArrayByParityII(int[] nums) {
		int even = 0, odd = 1;
		while (even < nums.length - 1) {
			if (nums[even] % 2 == 0) {
				even += 2;
			} else {
				while (odd < nums.length && nums[odd] % 2 != 0) {
					odd += 2;
				}
				swap(nums, even, odd);
				odd += 2;
				even += 2;
			}
		}
		return nums;
	}

	public static void swap(int[] arr, int i, int j) {
		int temp = arr[i];
		arr[i] = arr[j];
		arr[j] = temp;
	}

	private static int[] printSquare(int[] arr) {
		return Arrays.stream(arr).map(i -> i * i).sorted().toArray();
	}

	private static int pivotIndex(int[] arr) {
		int sumRight = Arrays.stream(arr).sum();
		int sumLeft = 0;
		for (int i = 0; i < arr.length; i++) {
			sumRight -= arr[i];
			if (sumRight == sumLeft)
				return i;
			sumLeft += arr[i];
		}
		return -1;
	}

	public static int findNumbers(int[] nums) {
		int count = 0;
		for (int val : nums) {
			if (String.valueOf(val).length() % 2 == 0) {
				count++;
			}
		}
		return count;
	}

	public static void main(String[] args) {
		String s[] = { "geeks", "for", "geeks", "contribute", "practice", "geeks" };
		String w1 = "geeks";
		String w2 = "practice";
		System.out.println(distance(s, w1, w2));
		// System.out.println(findNumbers1(new int[] { 12, 345, 2, 6, 7896 }));
		// System.out.println(pivotIndex(new int[] { 1, 7, 3, 6, 5, 6 }));
		// System.out.println(Arrays.toString(sortArrayByParity_II(new int[] { 4, 2, 5,
		// 7 ,9,12,1,8 })));
		System.out.println(Arrays.toString(printSquare(new int[] { -6, -3, -1, 2, 4, 5 })));
		System.out.println(sumOfUnique(new int[] { 1, 2, 3, 2 }));

	}
}
