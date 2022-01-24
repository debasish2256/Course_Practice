package geek;

/*Write algorithm that checks two numbers and print maximum of Two numbers
 * 
Step 1: Start
Step 2: Input two numbers,a and b
Step 3: Check if a is greater than b. If true,print a. Otherwise print b.
Step 4: Stop 
 
Write an Algorithm that checks two numbers and print minimum of Two numbers

Step 1: Start
Step 2: Input two numbers,a and b
Step 3: Check if a is less than b. If true,print a. Otherwise print b.
Step 4: Stop

Write an Algorithm that checks two numbers and print average of Two numbers

Step 1: Start
Step 2: Read a and b
Step 3: avg = (a+b)/2
Step 4: Print avg
Step 5: Stop


Write a program to print 1 to 10 using while loop
Write a program to print 10 to 1 using while loop
Write a program to print 2,4,6,8,10 using for loop and  while loop
Write a program to print 10, 8, 6, 4, 2 using for loop and  while loop
*/
public class C6 {
	public static void main(String[] args) {
		printMaximum(67, 81);
		printMinimum(23, 89);
		printAverage(55, 77);
		print1to10();
		print10to1();
		print1to10WithGap2();
		print10to1WithGap2();

	}

	private static void print10to1WithGap2() {
		System.out.print("\nPrint 10 to 2 With Gap 2: ");
		int count = 10;
		while (count > 0) {
			System.out.print(count + ",");
			count -= 2;
		}
	}

	private static void print1to10WithGap2() {
		System.out.print("\nPrint 2 to 10 With Gap 2: ");
		int count = 0;
		while (count < 10) {
			count += 2;
			System.out.print(count + ",");
		}
	}

	private static void print10to1() {
		System.out.print("\nPrint 10 to 1: ");
		int count = 10;
		while (count > 0) {
			System.out.print(count + ",");
			count--;
		}
	}

	private static void print1to10() {
		System.out.print("Print 1 to 10: ");
		int count = 0;
		while (count++ < 10) {
			System.out.print(count + ",");
		}
	}

	private static void printAverage(int i, int j) {
		System.out.println("Average is: " + (i + j) / 2);
	}

	private static void printMinimum(int i, int j) {
		System.out.println("Minimum Number is: " + (i > j ? j : i));
	}

	private static void printMaximum(int i, int j) {
		System.out.println("Maximum Number is: " + (i > j ? i : j));
	}

}
