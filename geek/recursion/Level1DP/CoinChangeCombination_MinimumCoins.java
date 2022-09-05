package Level1DP;

public class CoinChangeCombination_MinimumCoins {
	public static void main(String[] args) {
		int arr[]= {2,3,5,6};
		int amt=7;
		
		int[] dp=new int[amt+1];
		dp[0]=1;//one way to pay atleast do nothing
		for(int i=0;i<arr.length;i++) {
			for(int j=arr[i];j<dp.length;j++) {
				dp[j]+=dp[j-arr[i]]; 
			}
		}
		System.out.println(dp[amt]);
	}
}
