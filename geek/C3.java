package geek;

import java.util.Scanner;

/*Finding max of 3 numbers using nested if-else block.
Check if the triangle is valid with it's given sides. Note: do check for negative numbers, and zero-length sides.
Check if the Quadrilateral is valid for the given  4 angles.
Write a program that takes user input and keeps displaying the first and second digits for the entered number.
        Example 1 : User input : 14215 => output: 1,4 
        Example 2:  User input : 6654908 => output: 6,6




Copy paste these lines to get user input in java.
 Scanner s = new Scanner(System.in)
  int num = s.nextInt()

Also the code should run continuously without terminating until the entered value is -1 ,
that is after displaying the output it MUST ask for another number as input

Scanner s = new Scanner(System.in)
  int num = s.nextString()

Check if the given char is vowel or consonant, check for uppercase and lowercase, and print accordingly.*/

public class C3 {
	public static void main(String[] args) {
		maxOfThreeNumbers(1, 1, 9);
		checkValidQuadrilateral(90,90,90,90);
		displayFirstSecondDigit();
		checkForVowelAndCase();
	}

	private static void checkForVowelAndCase() {
		Scanner sc = new Scanner(System.in);
		boolean isVowel=false;
		System.out.print("Enter a Character:: ");
		char letter = sc.next().charAt(0);
		String caseMessage=Character.isUpperCase(letter)==true ? "Upper Case":"Lower Case";
		letter=Character.toLowerCase(letter);
		if(letter=='a'||letter=='e'||letter=='i'||letter=='o'||letter=='u') {
			isVowel=true;
		}
		System.out.println("Hi The Given Letter is in "+caseMessage+" and it's "+(isVowel==true? "Vowel":"Not Vowel"));
	}

	private static void displayFirstSecondDigit() {
		Scanner sc = new Scanner(System.in);
		while (true) {
			System.out.println("User Input:: ");
			int num = sc.nextInt();
			if (num == -1)
				return;
			System.out.println((String.valueOf(num).length() >= 2)
					? "Output::" + String.valueOf(num).charAt(0) + "," + String.valueOf(num).charAt(1)
					: "Please Enter Atleast Two Digit");
		}
	}

	private static void checkValidQuadrilateral(int i, int j, int k, int l) {
		System.out.println("Given angles are "+((i+j+k+l)==360 ? "Valid":"Not Valid")+" for Quadrilateral");	
	}

	private static void maxOfThreeNumbers(int a, int b, int c) {
		int max = a;
		if (max > b) {
			if (max < c) {
				max = c;
			}
		} else if (b > c)
			max = b;
		else
			max = c;
		System.out.println("Greater Element is: " + max);
	}
}
