 package recursion.dp;

import java.util.ArrayList;

public class KSubsetsWithEqualSum {
	/*
	 * @param vidx is the index than need to incorporate while adding element from array
	 */
	public static void solution(int[] arr, int vidx, int n, int k, int[] subsetSum, int ssf,
			ArrayList<ArrayList<Integer>> ans) {
		if (vidx == arr.length) {
			if (ssf == k) {
				boolean flag = true;
				for (int i = 0; i < subsetSum.length - 1; i++) {
					if (subsetSum[i] != subsetSum[i + 1]) {
						flag = false;
						break;
					}
				}
				if (flag) {
					for (ArrayList<Integer> partition : ans) {
						System.out.print(partition + " ");
					}
					System.out.println();
				}
			}
			return;
		}

		for (int i = 0; i < ans.size(); i++) {
			if (ans.get(i).size() > 0) {
				ans.get(i).add(arr[vidx]);
				subsetSum[i] += arr[vidx];
				solution(arr, vidx + 1, n, k, subsetSum, ssf, ans);
				subsetSum[i] -= arr[vidx];
				ans.get(i).remove(ans.get(i).size() - 1);
			} else {
				ans.get(i).add(arr[vidx]);
				subsetSum[i] += arr[vidx];
				solution(arr, vidx + 1, n, k, subsetSum, ssf + 1, ans);
				subsetSum[i] -= arr[vidx];
				ans.get(i).remove(ans.get(i).size() - 1);
				break;
			}
		}

	}

	public static void main(String[] args) {
		int n = 6;
		int k = 3;

		int[] arr = new int[n];
		int sum = 0;
		for (int i = 0; i < arr.length; i++) {
			arr[i] = i + 1;
			sum += arr[i];
		}
		// if k is equal to 1, then whole array is your answer
		if (k == 1) {
			System.out.print("[");
			for (int i = 0; i < arr.length; i++) {
				System.out.print(arr[i] + ", ");
			}
			System.out.println("]");
			return;
		}
		// if there are more subsets than no. of elements in array or sum of all
		// elements is not divisible by k
		if (k > n || sum % k != 0) {
			System.out.println("-1");
			return;
		}
		int[] subsetSum = new int[k];
		ArrayList<ArrayList<Integer>> ans = new ArrayList<>();
		for (int i = 0; i < k; i++) {
			ans.add(new ArrayList<>());
		}
		solution(arr, 0, n, k, subsetSum, 0, ans);
	}
}
