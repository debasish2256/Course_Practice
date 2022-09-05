package recursion.dp;

public class LongestIncreasingSubsequence {
	public static void main(String[] args) throws Exception {
     System.out.println(findLongSubsequence(new int[] {10,22,9,33,21,50,41,60,80,1}));
    }

//	SC:O(n)
//	TC:O(n^2)
	private static int findLongSubsequence(int[] arr) {
		int omax=0;
		int[] dp=new int[arr.length-1];
		for(int i=0;i<dp.length;i++) {
			int max=0;
			for(int j=0;j<i;j++) {
				if(arr[j]<arr[i]) {
					max=Math.max(max, dp[j]);
				}
			}
			dp[i]=max+1;
			omax=Math.max(omax,dp[i]);
		}
		return omax;
	}
}
