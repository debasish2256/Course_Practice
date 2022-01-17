package geek;

public class C1 {

	public static void main(String[] args) {
		printLastThreeDigitOfANumber(1557890,12);
		printAlternateMannerInAGivenRange(1, 100);
		printAverageOfNumbers(12, 15);
		checkNumberIsPrimeOrNot(71);
		sumOfSquareUpToNumber(10);
		classifyTheAge(23);
	}

	private static void classifyTheAge(int age) {
		System.out.print("The Given age Classifies to: ");
		if (age < 5)
			System.out.print("Baby");
		else if (age >= 5 && age < 10)
			System.out.print("Toddler");
		else if (age >= 10 && age < 18)
			System.out.print("Teenage");
		else if (age >= 18 && age < 25)
			System.out.print("Adult");
		else
			System.out.print("Grown Old");
	}

	private static void sumOfSquareUpToNumber(int num) {
		int start = 1;
		int sum = 0;
		while (start <= num) {
			sum += Math.pow(start++, 2);
		}
		System.out.println("\nSum of Squares from 1 to " + num + " is: " + sum);
	}

	private static void checkNumberIsPrimeOrNot(int num) {
		System.out.print("\nThe given Number " + num + " is: ");
		int fact = 0;
		int i = 2;
		while (i * i <= num) {
			if (num % i == 0) {
				fact++;
				break;
			}
			i++;
		}
		if (fact != 0)
			System.out.print("Not Prime");
		else
			System.out.print("Prime");
	}

	private static void printAverageOfNumbers(int left, int right) {
		System.out.print("\nAverge of Numbers from " + left + " to " + right + " is: ");
		int count = 0;
		int sum = 0;
		while (left <= right) {
			sum += left;
			left++;
			count++;
		}
		System.out.print((double) sum / count);
	}

	private static void printAlternateMannerInAGivenRange(int left, int right) {
		System.out.print("\nThe Alterate Numbers from " + left + " to " + right + " are: ");
		while (left < right) {
			System.out.print(left + "," + right + ",");
			left++;
			right--;
		}
	}

	private static void printLastThreeDigitOfANumber(int n,int lastDigit) {
		System.out.print("The last three digits of " + n + " are: ");
		int power=1;
		while(lastDigit-->0) {
			power*=10;
		}
		System.out.print(n % power + " ");
		
		
		/*Approach 2
		 * Single Line approach
		System.out.print(n % (int)Math.pow(10, lastDigit));
		*/
		
		/*
		 *Approach 1 based on class logic
		int totalDigit = 0;
		int num = n;
		while (num > 0) {
			num = num / 10;
			totalDigit++;
		}
		int pow = (int) Math.pow(10, totalDigit - 3);
		System.out.print("The last three digits of " + n + " are: ");
		while (n > pow) {
			System.out.print(n % 10 + " ");
			n = n / 10;
		}*/
	}

}
