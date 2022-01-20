package geek;

/*1. Take an array and a number that needs to be checked if present in the array. If number is present, print number is found, else print number is not found
2. Take an array and a number that needs to be checked if present in the array. If number is present, print number is found along with the index at which it is present, else print number is not found
3. Take an array and a number that needs to be checked if present in the array. If number is present, print number is found along with the last index at which it is present, else print number is not found
4. Print a diamond
 	 *
 	* *
   * * *
5. Write a program to calculate the sum of following series where you can initialise n as some number. 
1 + 1/2 + 1/3 + 1/4 + 1/5 +…………1/n


 */
public class C5 {

	public static void main(String[] args) {
		printSquare(5);
		int[] arr = new int[] { 6, 5, 4, 3, 22, 22, 99, 26, 36,22, 1 };
		checkNumberIsPresentInArray(arr, 22);
		calculateTheSum(10);
		printDiamond(5);
	}


	private static void printDiamond(int size) {
		for (int i = 1; i <= size; i++) {
			for (int j = size; j >= i; j--) {
				System.out.print(" ");
			}
			for (int j = 1; j <= i; j++) {
				System.out.print("* ");
			}
			System.out.println();
		}
	}


	// Question 1,2 and 3 combined
	private static void checkNumberIsPresentInArray(int[] arr, int target) {
		int i = 0;
		boolean flag = false;
		for (i = 0; i < arr.length; i++) {
			if (arr[i] == target) {
				System.out.println("1.Target Found");
				System.out.println("\nNumber " + target + " found at Index: " + (i + 1));
				flag = true;
				break;
			}
		}
		for (int j = arr.length - 1; j > 0; j--) {
			if (arr[j] == target && j != i) {
				System.out.println("Number " + target + " found at Last Index : " + (j + 1));
				return;
			}
		}

		if (!flag) {
			System.out.println("1.2.Target Not Found");
		}
	}

	
	private static void calculateTheSum(int size) {
		double i,sum=0;
		System.out.println("\nSeries Sum");
		for(i=1;i<=size;i++) {
			System.out.print("1/"+(int)i+" + ");
			sum+=(1/i);
		}
		System.out.println("\nThe sum is: "+sum+"\n");
	}
	
	
	private static void printSquare(int size) {
		for (int i = 1; i <= size; i++) {
			if (i == 1 || i == size) {
				for (int j = 1; j <= size; j++)
					System.out.print("*");
			} else
				for (int k = 1; k <= size; k++) {
					if (k == 1 || k == size)
						System.out.print("*");
					else
						System.out.print(" ");
				}
			System.out.println();
		}
	}
}
