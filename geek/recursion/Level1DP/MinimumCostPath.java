package Level1DP;

public class MinimumCostPath {
	public static void main(String[] args) {
		int rows = 2;
		int cols = 2;
		int[][] arr = new int[rows][cols];
		arr = new int[][] { { 3, 1 }, { 4, 3 } };

		int dp[][] = new int[rows][cols];
		for (int i = dp.length - 1; i >= 0; i--) {
			for (int j = dp[0].length - 1; j >= 0; j--) {
				if (i == dp.length - 1 && j == dp[0].length - 1) { //last cell
					dp[i][j] = arr[i][j];
				} else if (i == dp.length - 1) { //last row
					dp[i][j] = dp[i][j + 1] + arr[i][j];
				} else if (j == dp[0].length - 1) { //last column
					dp[i][j] = dp[i + 1][j] + arr[i][j];
				} else {
					dp[i][j] = Math.min(dp[i + 1][j], dp[i][j + 1]) + arr[i][j];
				}
			}
		}
		System.out.println(dp[0][0]);
	}
}
