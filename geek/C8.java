package geek;

import java.math.BigInteger;
import java.util.Scanner;

/*Use while loop to calculate sum of numbers till n, where n is taken from user
use while loop to calculate factorial of a number by taking user input
Write a program to print multiplication table of a number entered by user
Write a program to swap 2 numbers, where numbers are taken from user*/

public class C8 {
	static {
		System.out.println("Hey, \n" + "1.Enter Input for PrintSumUpto the input Number\n"
				+ "2.Enter Input for factorial of the input Number\n"
				+ "3.Enetr Input for viewing table for the input number\n" + "4.Enter two number for swapping\n");
	}

	public static void main(String... args) {
		Scanner sc = new Scanner(System.in);
		System.out.println(printSumUptoN(sc.nextInt()));
		System.out.println(factorial(sc.nextInt()));
		multplicationTable(sc.nextInt());
		swapTwoNumbers(sc.nextInt(), sc.nextInt());
	}

	private static void swapTwoNumbers(int a, int b) {
		System.out.println("Intial value of a: " + a + " and b: " + b);
		a = a + b;
		b = a - b;
		a = a - b;
		System.out.println("After Swapping value of a: " + a + " and b: " + b);
	}

	private static void multplicationTable(int num) {
		int upto = 10;
		int start = 1;
		while (start <= upto) {
			System.out.println(num + "x" + start + "=" + num * start++);
		}
	}

	private static int printSumUptoN(int num) {
		// num=num<0?-1*num:num;
		int sum = 0;
		while (num > 0) {
			sum += num;
			num--;
		}
		return sum;
	}

	static BigInteger factorial(int n) {
		BigInteger res = BigInteger.ONE;
		int i = 2;
		while (i <= n) {
			res = res.multiply(BigInteger.valueOf(i));
			i++;
		}
		return res;
	}
}
