package L1;

public class PerfectSquare {
	public static void main(String[] args) {
		int n = 18;
		System.out.println("Given Number is a PerfectSquare: " + (checkForPerfectSquare(n) == true ? "Yes" : "No"));
	}

	private static boolean checkForPerfectSquare(int n) {
		if (n >= 0) {
			int square = (int) Math.sqrt(n);
			return ((square * square) == n);
		}
		return false;
	}
}
