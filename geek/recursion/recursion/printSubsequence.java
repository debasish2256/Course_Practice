package recursion;

public class printSubsequence {
	public static void main(String[] args) {
		printSS("yvTA", "");
	}

	public static void printSS(String str, String ans) {
		if (str.length() == 0) {
			System.out.println(ans);
			return;
		}
		char ch = str.charAt(0);
		String restStr = str.substring(1);
		printSS(restStr, ans + ch);
		printSS(restStr, ans + "");
	}
}
