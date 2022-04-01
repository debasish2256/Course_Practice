package geek;

/*"1. Find the smallest missing element from a sorted array
2. Find the missing term in a sequence in logarithmic time"
*/

public class Mar29 {
	public static void main(String[] args) {
		int arr[] = {0, 1, 2, 3, 4, 5, 6, 7, 10};
		System.out.println(findSmallesMissingUsingLinearTraversal(arr));
		System.out.println(findSmallestMissing(arr,0,arr.length));
		System.out.println(findMissingUsingBinary(arr));
	}
	
	public static int findSmallesMissingUsingLinearTraversal(int[] arr){
		for(int i=0;i<arr.length;i++) {
			if(i!=arr[i]) {
				return i;
			}
		}
		return -1;
	}
	
	
	public static int findSmallestMissing(int[] nums, int left, int right)
    {
        if (left > right) {
            return left;
        }
 
        int mid = left + (right - left) / 2;
 
        // lies on the right half
        if (nums[mid] == mid) {
            return findSmallestMissing(nums, mid + 1, right);
        }
        else {
            // mismatch lies on the left half
            return findSmallestMissing(nums, left, mid - 1);
        }
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
