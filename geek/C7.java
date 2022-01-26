package geek;

import java.util.Scanner;

import com.itextpdf.kernel.log.SystemOutCounter;

public class C7 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
//		C/W
		System.out.println("Simple Interset is :"+ findSimpleInterest(sc.nextInt(), sc.nextInt(), sc.nextInt()));
		findQuotientAndRemainder(sc.nextInt(),sc.nextInt());
		computeAreaOfPolygon(sc.nextInt(),sc.nextInt(),sc.nextInt());
		checkOddOrEven(sc.nextInt());
		System.out.println("Average of 5 Marks is :"+findAverageOfFiveMarks(sc.nextInt(),sc.nextInt(),sc.nextInt(),sc.nextInt(),sc.nextInt()));
		calculate(sc.nextInt(),sc.nextInt());
		
//		H/W
		/*Write a program that checks if a number is a Prime number. take the user input.
		Java Program to calculate power of a number */	
		System.out.println("Result is: "+calculatePower(sc.nextInt(),sc.nextInt()));
		checkPrimeOrNot(sc.nextInt());
		
	}

	
	private static void checkPrimeOrNot(int num) {
		System.out.print("\nThe given Number " + num + " is: ");
		int i = 2;
		int fact = 0;
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


	private static int calculatePower(int base, int exponent) {
		int result = 1;
	    while (exponent != 0) {
	      result *= base;
	      exponent--;
	    }
	    return result;
	}


	private static void calculate(int num1, int num2) {
		System.out.println("Multiply: "+num1*num2);
		System.out.println("Subtract: "+(num1-num2));
		System.out.println("Division: "+(num1/num2));
		System.out.println("Addition: "+(num1+num2));
	}


	private static int findAverageOfFiveMarks(int mark1, int mark2, int mark3, int mark4, int mark5) {
		return (mark1+mark2+mark3+mark4+mark5)/5;		
	}

	private static void checkOddOrEven(int num) {
		System.out.println(num%2==0?"Even Number":"Odd Number");
	}

	private static void computeAreaOfPolygon(int length, int breadth,int height) {
		int base=breadth;
		System.out.println("Square area is = "+length*length);
		System.out.println("Triangle area is = "+(base*height)/2);
		System.out.println("Rectangle area is = "+length*breadth);
	}

	
	
	private static void findQuotientAndRemainder(int dividend, int divisor) {
		System.out.println("Remainder:"+(dividend%divisor)+" , Quotient:"+(dividend/divisor));
	}

	private static int findSimpleInterest(int principal, int rate, int time) {
		return (principal * rate * time) / 100;
	}
}
