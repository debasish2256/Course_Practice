package recursion;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SubsetSum {
	public static void main(String[] args) {
		System.out.println(subsetSums(List.of(3,1,2),3));
	}

	private static List subsetSums(List<Integer> arr, int N) {
		ArrayList<Integer> ans=new ArrayList<>();
		int sum=0;
		helper(arr,0,N,ans,sum);
		Collections.sort(ans);
		return ans;
	}

	private static void helper(List<Integer> arr, int idx, int N, ArrayList<Integer> ans, int sum) {
		if(idx>=N) {
			ans.add(sum);
			return;
		}
		//pick
		helper(arr, idx+1, N, ans, sum+arr.get(idx));
		//not Pick
		helper(arr, idx+1, N, ans, sum);
	}
	
}
