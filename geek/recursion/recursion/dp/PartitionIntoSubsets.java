package recursion.dp;

public class PartitionIntoSubsets {
	public static void partitionKSubset(int n, int k) {
		if(n==0||k==0||n<k) {
			System.out.println(0);
			return;
		}
		
		int[][] dp=new int[k+1][n+1];
		
		for (int t = 1; t <= k; t++) {
			for (int p = 1; p <= n; p++) {
				if (p < t) {
					dp[t][p] = 0;
				} else if (p == t) {
					dp[t][p] = 1;
				} else {
					dp[t][p] = dp[t - 1][p - 1] + dp[t][p - 1] * t;
				}
			}
		}
		System.out.println(dp[k][n]);
    }
    
    public static void main(String[] args) throws Exception {
        int n = 4;
        int k = 3;
        
        partitionKSubset(n, k);
    }
}
