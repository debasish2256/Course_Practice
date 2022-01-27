package geek;

import java.util.Scanner;

public class C9 {
	public static void main(String args[]) {
//		C/W
		findHCFandLCM();
		findPerfectNumber(2);
		isArmtrong(567);
		sumOfAllDigits(234);
		isVowel('A');
		compoundIntrest(10000,10.25,5);
		
//		H/W
		isLeapYear(2024);
		permutationAndCombination(7,3);
		findDisBetweenTwoPoints(2,3,5,7);
		findSumOfOddNEvenOptimal(2345);
		reverseNumber(98765);
		printSeriesof3NPlus2(100);
	}
	
	private static void printSeriesof3NPlus2(int num) {
		int N=1;
		while (N < num) {
			int ap = 3 * N + 2;
			if (ap % 4 != 0) {
				System.out.print(ap + " ");
			}
			N++;
		}
	}

	private static void reverseNumber(int num) {
		int res=0;
		while(num>0) {
			int rem=num%10;
			res=res*10+rem;
			num/=10;
		}
		System.out.println("Reverse is: "+res);
	}

	private static void findSumOfOddNEvenOptimal(int num) {
		int evenSum = 0, oddSum = 0;
		while(num!=0) {
			if((num%10)%2==0) {
				evenSum+=(num%10);
			}else {
				oddSum+=(num%10);
			}
			num=num/10;
		}
		System.out.println("Even Sum: "+evenSum + " , " + "Odd Sum: "+ oddSum);
	}
	
	
	private static void findDisBetweenTwoPoints(int x1,int y1,int x2,int y2) {
		System.out.println("Distance is: "+Math.sqrt((x2-x1)*(x2-x1) + (y2-y1)*(y2-y1)));
	}


	private static void permutationAndCombination(int num,int r) {
		int combination=(fact(num)/(fact(num-r)*fact(r)));
		System.out.println("NCR is: " +combination);
		int permutation=(fact(num)/(fact(num-r)));
        System.out.println("NPR is: " +permutation);
	}


	static int fact(int n) {
	      int fact = 1;
	      int i = 1;
	      while(i <= n) {
	         fact *= i;
	         i++;
	      }
	      return fact;
	   }
	 
	        

	private static void isLeapYear(int year) {
	 System.out.println((((year % 4 == 0) && (year % 100 != 0)) || (year % 400 == 0))?"Leap year":"Not Leap Year");
	}


	private static void compoundIntrest(int principal, double rate, int time) {
		double result = principal * (Math.pow((1 + rate / 100), time));
		System.out.println(result);
	}


	private static void isVowel(char c) {
		if(c=='a'||c=='e'||c=='i'||c=='o'||c=='u') {
			System.out.println("Vowel");
		}else if(c=='A'||c=='E'||c=='I'||c=='O'||c=='U') {
			System.out.println("Vowel");
		}else {			
			System.out.println("Consonate");
		}
		
	}


	private static void sumOfAllDigits(int num) {
		int sum=0;
		while(num>0) {
			sum+=num%10;
			num/=10;
		}
		System.out.println(sum);
	}


	private static boolean isArmtrong(int num) {
		int temp=num,digits=0,rem=0,sum=0;
		while(temp>0) {
			temp/=10;
			digits++;
		}
		temp=num;
		while(temp>0) {
			rem=temp%10;
			sum+=rem*rem*rem;
			temp/=10;
		}
		return (num==sum)? true: false;
	}

	private static void findPerfectNumber(int num) {
		int sum=0;
		for(int i=1;i<num;i++) {
			if(num%i==0) {
				sum+=i;
			}
		}
		System.out.println(sum==num?"Perfect Number":"Not Perfect Number");
	}

	private static void findHCFandLCM() {
		Scanner s = new Scanner(System.in);
		int n1 = s.nextInt();
		int n2 = s.nextInt();

		int ov1 = n1;
		int ov2 = n2;
		while (n1 % n2 != 0) {
			int rem = n1 % n2;
			n1 = n2;
			n2 = rem;
		}
		int HCF = n2;
		System.out.println(HCF);
		int LCM = (ov1 * ov2) / HCF;
		System.out.println(LCM);
	}
}
