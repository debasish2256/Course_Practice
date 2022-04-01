package geek;

/*"https://www.techiedelight.com/find-number-1s-sorted-binary-array/
https://www.techiedelight.com/find-floor-ceil-number-sorted-array/"
 */
public class Mar31 {
	public static void main(String[] args) {
		int arr[] = { 0, 0, 0, 0, 1, 1, 1 };
		int pos[] = findFirstAndLastOccurence(arr, 1);
		System.out.println("Frequency of 1 is: " + (pos[1] - pos[0] + 1));

		int[] nums = { 1, 4, 6, 8, 9 };
		for (int i = 0; i <= 10; i++) {
			System.out.println("Number " + i + " —> ceil is " + computeFloorAndCeil(nums, i)[1] + ", floor is " + computeFloorAndCeil(nums, i)[0]);
		}
	}

	private static int[] findFirstAndLastOccurence(int[] arr, int target) {
		int low = 0, high = arr.length - 1;
		int[] ans = { -1, -1 };
		while (low <= high) {
			int mid = (low + high) / 2;
			if (arr[mid] == target) {
				ans[0] = mid;
				high = mid - 1;
			} else if (arr[mid] < target) {
				low = mid + 1;
			} else {
				high = mid - 1;
			}
		}
		low = 0;
		high = arr.length - 1;
		while (low <= high) {
			int mid = (low + high) / 2;
			if (arr[mid] == target) {
				ans[1] = mid;
				low = mid + 1;
			} else if (arr[mid] < target) {
				low = mid + 1;
			} else {
				high = mid - 1;
			}
		}
		return ans;
	}

	public static int[] computeFloorAndCeil(int[] nums, int x) {
		int left = 0, right = nums.length - 1;
		int ceil = -1;
		int floor = -1;
		while (left <= right) {
			int mid = (left + right) / 2;
			if (nums[mid] == x) {
				return new int[] {nums[mid],nums[mid]};
			}
			else if (x < nums[mid]) {
				ceil = nums[mid];
				right = mid - 1;
			}
			else {
				floor = nums[mid];
				left = mid + 1;
			}
		}
		return new int[] {floor,ceil};
	}
}
