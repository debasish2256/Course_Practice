package geek;

import java.util.Scanner;

/*4. write a program to print name of the month by passing number of the month
using switch or if else*/


public class C14 {
	public static void main(String[] args) {
		swapUsingXOR(15,25);
		count1InBinary(15);
		count1InBinaryByShifting(15);
		count1InBinaryBitOneLiner(15);
		double start = System.currentTimeMillis();
		System.out.println(kangaroo(0 ,3 ,4, 2));
		double end = System.currentTimeMillis();
        System.out.println(end - start);
		printPentagonal();
//		HW
		System.out.println("Month Name: "+printMonthUsingSwitchCase(new Scanner(System.in).nextInt()));

	}
	
	private static void printPentagonal() {
		int count=1;
		for(int i=1;i<=50;i++) {
			System.out.printf("%-6d",getPantagonalNumber(i));
			if(count%10==0) System.out.println();
			count++;
		}
	}

	private static int getPantagonalNumber(int i) {
		return (i*(3*i-1))/2;
	}

	private static String printMonthUsingSwitchCase(int month) {
		switch (month) {
		case 1:
			return "Jan";
		case 2:
			return "Feb";
		case 3:
			return "Mar";
		case 4:
			return "Apr";
		case 5:
			return "May";
		case 6:
			return "Jun";
		case 7:
			return "Jul";
		case 8:
			return "Aug";
		case 9:
			return "Sep";
		case 10:
			return "Oct";
		case 11:
			return "Nov";
		case 12:
			return "Dec";
		default:
			return "Invalid Input";
		}
	}

	public static String kangaroo(int x1, int v1, int x2, int v2) {       
        return ((v1 > v2) && ((x1-x2) % (v2-v1) == 0 )) ? "YES" : "NO";
    }

	public static String kangaroo_1(int x1, int v1, int x2, int v2) {
        if(v2>v1) return "NO";
        while(x1<x2){
            // loc+velocity
            x1=x1+v1;
            x2=x2+v2;
            if(x1==x2){
                return "YES";
            }
        }
        return "NO";
    }
	
	

	private static void count1InBinaryBitOneLiner(int num) {
		System.out.println("Number of Ones: "+Integer.bitCount(num));		
	}

	private static void count1InBinaryByShifting(int num) {
		int count=0;
		while(num>0) {
			count+=num & 1;
			num>>=1;
		}
		System.out.println("Number of Ones: "+count);
	}

	private static void count1InBinary(int num) {
		StringBuffer res=new StringBuffer();
		int count=0;
		while (num > 0) {
			if(num%2==1)	count++;
			res.append(num%2);
			num/= 2;
		}
		System.out.println("Binary Form: "+res.reverse());
		System.out.println("Number of Ones: "+count);
	}

	private static void swapUsingXOR(int a, int b) {
		System.out.println("Before Swap: "+a+" and "+b);
		a=a^b;
		b=a^b;
		a=a^b;
		System.out.println("After Swap: "+a+" and "+b);
	}
}
