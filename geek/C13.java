package geek;



import java.util.Scanner;

/*
2.  WAP to check whether given number is lesser or 
greater than 10 if its lesser than check further if its lesser or greater than 
5 using ternary operator and Print greater or smaller accordingly.

3. WAP to check whether given number is 10,20,30,40,50 or not any of these
using ternary operator.

4. write a program to print name of the month by passing number of the month 
using ternary operator.

5. write a program to print given character is vowel or Consonant using ternary operator.*/

public class C13 {
	public static void main(String[] args) {	
		findQudratic();
//		H/W
		/*int x = 9, y = 12;
		int a = 2, b = 4, c = 6;
		int exp = 4/3 * (x + 34) + 9 * (a + b * c) + (3 + y * (2 + a)) / (a + b*y);
			  1*43+9*26+(3+y*4))/50
			  1*43+9*26+51/50	
			  43+234+1
			  278 (ANS)*/
		
		System.out.println("Given Input is "+(isNumberPresent(new Scanner(System.in).nextInt())?"Present":"Not Present"));	
		System.out.println(checkIfLesserOrGreater(new Scanner(System.in).nextInt()));
		System.out.println(printMonth(new Scanner(System.in).nextInt()));
		System.out.println("Given Input is "+ (isVowel(new Scanner(System.in).next().charAt(0)) ? "Vowel" : "Consonant"));	
	}
	
	
	private static boolean isVowel(char input) {
		String ch = String.valueOf(input).toLowerCase();
		return (ch.equals("a") || ch.equals("e") || ch.equals("i") || ch.equals("o") || ch.equals("u")) ? true : false;
	}

	private static String printMonth (int month) {
		return month==1?"Jan":month==2?"Feb":month==3?"Mar":month==4?"Apr":month==5?"May":month==6?"Jun":month==7?"Jul":month==8?"Aug":month==9?"Sep":month==10?"Oct":month==11?"Nov":month==12?"Dec":"Invalid Input";		
	}
	
	
	
	

	private static String checkIfLesserOrGreater(int num) {
		String msg=(num<10 && num <5)?"Number is less then 10\nNumber less than 5":(num>10 && num>5)? "Number is greater then 10\nNumber Greater than 5":"Number is less then 10\nNumber is Greater than 5";
		return msg;
	}

	
	
	
	
	
	private static boolean isNumberPresent(int num) {
		return (num==10||num==20||num==30||num==40||num==50)?true:false;		
	}

	private static void findQudratic() {
		  double secondRoot = 0, firstRoot = 0;
	      Scanner sc = new Scanner(System.in);
	      System.out.print("Enter the value of a ::");
	      double a = sc.nextDouble();

	      System.out.print("Enter the value of b ::");
	      double b = sc.nextDouble();

	      System.out.print("Enter the value of c ::");
	      double c = sc.nextDouble();

	      double determinant = (b*b)-(4*a*c);
	      double sqrt = Math.sqrt(determinant);

	      if(determinant>0){
	         firstRoot = (-b + sqrt)/(2*a);
	         secondRoot = (-b - sqrt)/(2*a);
	      }
	      System.out.println((determinant>0)?"Roots are :: "+ firstRoot +" and "+secondRoot:"Root is :: "+(-b + sqrt)/(2*a));
	}
}
