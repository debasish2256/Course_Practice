package geek;

import java.util.Scanner;

/*1.Write a program to print the product of the decimal and int numbers ex: 8.2 and 6
2.Print the ASCII value of any character user proides
3.Write a program to add 3 to the ASCII value of the any character user proides  and print the equivalent character.
4.Write a Java program to convert temperature from Fahrenheit to Celsius degree.
5. Write a Java program that reads a number in inches, converts it to meters.
6. Write a Java program to convert minutes into a number of years and days.
7. Take String input as Name of the city and convert it to reverse string and show on the console.
8. Check if a string is pallindrome or not. eg. input : ABCBA 
*/
public class C11 {
	public static void main(String[] args) {
		productOfDecimalAndInt(8.2,6);
		//Question 2 and 3 merged together
		printASCIIValue();
		System.out.println("Farenheit to Celcius: "+coverTempToCelcius(100.7)+" *C");
		System.out.println("Inches to meters: "+convertInchToMeter(300.5)+" meter");
		convertMinutesIntoDaysAndYears(1567);
		reverseTheName();
		checkStringIsPalindrome();
	}

	private static void checkStringIsPalindrome() {
		System.out.print("Enter String to check Palindrome or not:: ");
		String original=new Scanner(System.in).nextLine();
		String fake=new StringBuffer(original).reverse().toString();
		System.out.println("The Given Input is "+ (original.compareToIgnoreCase(fake)==0 ?"Palindrome":"Not Palindrome"));
	}

	private static void reverseTheName() {
		System.out.print("Enter Name to be reverse:: ");
		System.out.println("Reverse is : "+new StringBuffer(new Scanner(System.in).nextLine()).reverse());
	}

	private static void convertMinutesIntoDaysAndYears(int minutes) {
	    System.out.println("Year : "+ minutes / 525600 +" and Days: "+minutes / 1440);
	}

	private static float convertInchToMeter(double d) {
		return (float) (d*0.0254);
	}

	private static float coverTempToCelcius(double d) {
		return (float)(d - 32) * 5/9;
	}

	private static void printASCIIValue() {
		System.out.print("Enter a character: ");
		char ch=new Scanner(System.in).next().charAt(0);
		System.out.print("Enter a Number: ");
		int num=new Scanner(System.in).nextInt();
		System.out.println("Ascii Table");
		System.out.println("Ascii Value of Char: "+(int)ch);
		System.out.println("Ascii Value of Number: "+(char)num);
		System.out.println("Ascii Value after adding 3 to character: "+(char)((int)ch+3));
	}

	private static void productOfDecimalAndInt(double d, int i) {
		System.out.println("Result is: "+(float)d*i);	
	}
}
