package recursion.dp;

import java.util.Map;

import org.apache.commons.collections.map.HashedMap;

public class SubarraySumEqualsK {
	public static void main(String[] args) {
		int arr[] = {3,9,-2,4,1,-7,2,6,-5,8,-3,-7,6,2,1};
		int target = 5;
		System.out.println(countSubarrays(arr, target));
	}

	private static int countSubarrays(int[] arr, int target) {
		int ans=0;
		Map<Integer,Integer> map=new HashedMap();
		map.put(0, 1);
		int sum=0;
		for(int i=0;i<arr.length;i++) {
			sum+=arr[i];
			if(map.containsKey(sum-target)) {
				ans+=map.get(sum-target);
			}
			map.put(sum, map.getOrDefault(sum, 0)+1);
		}
		return ans;
	}

}
