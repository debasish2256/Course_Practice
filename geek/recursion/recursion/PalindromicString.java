package recursion;

public class PalindromicString {
	public static void main(String[] args) {
		System.out.println(isPalindrome("MOM", 0));
	}

	private static boolean isPalindrome(String str, int idx) {
		int size = str.length() - 1;
		if (idx > size / 2) {
			return true;
		}
		if (str.charAt(idx) != str.charAt(size - idx)) {
			return false;
		}
		return isPalindrome(str, idx + 1);
	}
}
