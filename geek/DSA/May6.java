package DSA;

import java.util.Scanner;

/*"1. Encrypt the string - 2
https://practice.geeksforgeeks.org/problems/encrypt-the-string-21117/1/

2. Roatating the String check
https://practice.geeksforgeeks.org/problems/check-if-string-is-rotated-by-two-places-1587115620/1"
*/
public class May6 {
	public static void main(String[] args) {
		System.out.println(encryptString("abbc"));
//		Scanner sc=new Scanner(System.in);
//		System.out.println(isPalindrome(new Scanner(System.in).next()));
//		printPattern(5);
		System.out.println(isRotated("amazon","azonam"));
	}

	
	public static boolean isRotated(String str1, String str2)
	{
		String temp = str1;
		str1 = str1.substring(str1.length() - 2, str1.length()) + str1.substring(0, str1.length() - 2);
		str1 = str1.substring(2, str1.length()) + str1.substring(0, 2);
		
		if (str1.equals(str2) || temp.equals(str2))
			return true;
		return false;
	}
	private static void printPattern(int n) {
		int arr[][] = new int[n][n + 2];

		for (int i = 0; i <= n / 2; i++) {
			for (int j = 0; j <= n / 2; j++) {
				if (i + j <= n / 2)
					arr[i][j] = 1;
			}
		}

		for (int i = 0; i < arr.length / 2; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				arr[arr.length - 1 - i][j] = arr[i][j];
			}
		}

		for (int j = 0; j < arr[0].length / 2; j++) {
			for (int i = 0; i < arr.length; i++) {
				arr[i][arr[0].length - 1 - j] = arr[i][j];
			}
		}
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[0].length; j++) {
				if (arr[i][j] == 1)
					System.out.print('*');
				else
					System.out.print(" ");
			}
			System.out.println();
		}
	}

	static String encryptString(String str) {
		String t = "";
		int count = 0;
		for (int i = 0; i < str.length(); i++) {
			count = 1;
			while (i < str.length() - 1 && str.charAt(i) == str.charAt(i + 1)) {
				count++;
				i++;
			}
			t = Integer.toHexString(count) + str.charAt(i) + t;
		}
		return t;
	}
}
