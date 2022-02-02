package geek;

/*WAP to caluclate no. of digits in a number entered by user.
Apply do while loop to calculat factorial of a number such that, program asks  user, if he wants to continue, if yes, program should run again
WAP to creat a fuction that check if no. is odd or even. call this function from main method*/

import java.util.Scanner;

public class C12 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
//		C/W
		System.out.println(findGreatestAmongThreeUsingTernary(sc.nextInt(), sc.nextInt(), sc.nextInt()));
		System.out.print("Enter Number till you want sum/product:");
		int num=sc.nextInt();
		System.out.print("\nResult : "+sumOrProduct(num));
		int	number=sc.nextInt();
		System.out.println(binaryToDecimal(number));
		System.out.println(binaryToDecimalOneLiner(number));
		decimalToBinary(12);
		System.out.println(decimalToBinaryOneLiner(12));
		System.out.println(findSquareRoot(new Scanner(System.in).nextInt()));
//		H/W
		findNoOfDigits();
		findFactorial();
		System.out.println(isEvenOrOdd(79)?"Number is Even":"Number is Odd");
		
	}
	
	private static void findFactorial() {
		int fact=1,num,i=1;
		System.out.print("Enter a number: ");
		num=new Scanner(System.in).nextInt();
		 do {  
	            fact*=i++;      
	        } while( i <= num );  
		 System.out.println("Factorial Is: "+fact);
		 
		 System.out.println("Do You want to Continue:y/n");
		 char choice=new Scanner(System.in).next().charAt(0);
		 if(choice=='n') return;else findFactorial();
	}

	private static boolean isEvenOrOdd(int num) {
		return num%2==0? true:false;	
	}

	private static void findNoOfDigits() {
		System.out.print("Eneter numbers: ");
		int num=new Scanner(System.in).nextInt();
		int count=0;
		while(num>0) {
			num/=10;
			count++;
		}
		System.out.println("Total Digts: "+count);
	}

	private static int findSquareRoot(int num) {
		int i = 0;
		while (i * i <= num) {
			i++;
		}
		return i - 1;
	}

	private static String decimalToBinaryOneLiner(int num) {
		return 	Integer.toBinaryString(num);
	}


	private static void decimalToBinary(int num) {
		StringBuffer res=new StringBuffer();
		while (num > 0) {
			res.append(num%2);
			num/= 2;
		}
		System.out.println(res.reverse());
	}

	private static int binaryToDecimalOneLiner(int num) {
		//one liner
		return Integer.parseInt(String.valueOf(num),2);  
	}

	private static int binaryToDecimal(int num) {		
		int decimal = 0, n = 1;  
		while(num>0) {
        	decimal += (num%10)*n; 
        	n*=2;
        	num = num/10;
		}
		return decimal;
	}

	private static int sumOrProduct(int num) {
		System.out.print("\nEnter choice:");
		int choice = new Scanner(System.in).nextInt();
		if (choice == 1) {
			int i = 1;
			int sum = 0;
			while (i <= num) {
				sum += i++;
			}
			return sum;
		} else if (choice == 2) {
			int i = 1;
			int product = 1;
			while (i <= num) {
				product *= i++;
			}
			return product;
		} else {
			return -1;
		}
	}

	private static  int findGreatestAmongThreeUsingTernary(int a, int b, int c) {
		return a>b ? (a>c ? a:c):(b>c ? b:c);
	}
}
