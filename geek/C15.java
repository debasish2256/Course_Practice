package geek;
/*1.
Length and breadth of a rectangle are 5 and 7 respectively. Write a program to calculate the area and perimeter of the rectangle.
2.
Write a program to calculate the perimeter of a triangle having sides of length 2,3 and 5 units.
3.
Write a program to add 8 to the number 2345 and then divide it by 3. Now, the modulus of the quotient is taken with 5 and then multiply the resultant value by 5. Display the final result.
4.
Now, solve the above question using assignment operators (eg. +=, -=, *=).
5.
Write a program to check if the two numbers 23 and 45 are equal.
6.
Write a program to print the power of 7 raised to 5.
7.
Assign values of variables 'a' and 'b' as 55 and 70 respectively and then check if both the conditions 'a < 50' and 'a < b' are true.
8.
Now solve the above question to check if atleast one of the conditions 'a < 50' or 'a < b' is true.
9.
If the marks of Robert in three subjects are 78,45 and 62 respectively (each out of 100 ), write a program to calculate his total marks and percentage marks.
10.
Suppose the values of variables 'a' and 'b' are 6 and 8 respecrtively, write two programs to swap the values of the two variables.
1 - first program by using a third variable
2 - second program without using any third variable
( Swapping means interchanging the values of the two variables E.g.- If entered value of x is 5 and y is 10 then after swapping the value of x and y should become 10 and 5 respectively.)
11.
Write a program to convert Fahrenheit into Celsius.
12.
The total number of students in a class are 90 out of which 45 are boys. If 50% of the total students secured grade 'A' out of which 20 are boys, then write a program to calculate the total number of girls getting grade 'A'.
13.
Write a program to calculate the sum of the first and the second last digit of a 5 digit.
E.g.- NUMBER : 12345        OUTPUT : 1+4=5
14.
Take a 4 digit number. Write a program to display a number whose digits are 2 greater than the corresponding digits of the number TAKEN.
For example, if the number which was taken is 5696, then the displayed number should be 7818.
15.
Write a program to calculate the sum of the digits of a 3-digit number.
Number : 132        Output : 6
16.
Write a program to reverse a 3-digit number. E.g.-Number : 132        Output : 231*/
public class C15 {
	public static void main(String[] args) {
		areaAndPerimenterOfRectangle(5,7);
		perimeterOfTraingle(2,3,5);
		addMultiplyModulo(2345);
		addMultiplyModuloWithOperator(2345);
		checkTwoNumberEqual(23,45);
		powerFinder(7,5);
//		7 and 8 merged
		conditionValueCheck();
		marksCalculator(78,45,62);
		swapTechnique(6,8);
		coverTempToCelcius(100);
		computeTotalGirlsGradeA(90,45);
		sumOfFirstAndSecondLastDigit(12345);
		addTwoOnEveryDigit(5696,2);
		sumOf3DigitNumber(132);
		reverseNumber(132);
		
//		permute("xyz");
	}
	
	
	
	private static void addTwoOnEveryDigit(int num,int toAdd) {
		int res=0;
		while(num>0) {
			int noOfDigit=getMeCountOfDigits(num);
			int val=getMeSingleDigit(num/(int)Math.pow(10, noOfDigit-1),toAdd);
			res=res*10+val;
			num%=(int)Math.pow(10, noOfDigit-1);
		}
		System.out.println("After Adding 2 to Every Digit: "+res);
	}



	private static int getMeCountOfDigits(int val) {
		int digit = 0;
		while (val > 0) {
			digit++;
			val /= 10;
		}
		return digit;
	}



	private static int getMeSingleDigit(int num,int toAdd) {
		int val=num+toAdd;
		int digit=getMeCountOfDigits(val);
		return (digit>1)?(val)%10:val;
	}



	private static void reverseNumber(int num) {
		int reverse=0;
		while(num>0) {
			reverse=reverse*10+(num%10);
			num/=10;
		}
		System.out.println("Reverse is: "+reverse);
	}



	private static void sumOf3DigitNumber(int num) {
		int res=0;
		while(num>0) {
			res+=(num%10);
			num/=10;
		}
		System.out.println("Sum is : "+res);
	}



	static void permute(String input)
	{
		int n = input.length();
		int max = 1 << n;		
		input = input.toLowerCase();		
		for(int i = 0;i < max; i++)
		{
			char combination[] = input.toCharArray();
			
			for(int j = 0; j < n; j++)
			{
				if(((i >> j) & 1) == 1)
					combination[j] = (char) (combination[j]-32);
			}
			
			System.out.print(combination);
			System.out.print(",");
		}
	}



	private static void sumOfFirstAndSecondLastDigit(int num) {
		int first = num/10000;
		int fourth= (num%100)/10;
		System.out.println("Sum is: "+(first+fourth));
	}



	private static void computeTotalGirlsGradeA(int totalStudents,int noBoys) {
		int noGirls=totalStudents-noBoys;
		int gradeAStudent=(90*50)/100;
		System.out.println("Total number of girls getting grade 'A': "+(gradeAStudent-20));
	}



	private static void coverTempToCelcius(double d) {
		System.out.println("Farenheit to Celcius: "+(int)((d - 32) * 5/9)+" *C");

	}
	
	private static void swapTechnique(int a, int b) {
		swapUsingThirdVariable(a,b);
		swapWithoutUsingThirdVariable(a,b);
	}

	private static void swapWithoutUsingThirdVariable(int a, int b) {
		System.out.println("Before Swapping Value a:"+a+" and Value b:"+b);
		a=a+b;
		b=a-b;
		a=a-b;
		System.out.println("After Swapping Value a:"+a+" and Value b:"+b);
	}

	private static void swapUsingThirdVariable(int a, int b) {
		System.out.println("Before Swapping Value a:"+a+" and Value b:"+b);
		int temp=a;
		a=b;
		b=temp;
		System.out.println("After Swapping Value a:"+a+" and Value b:"+b);
	}

	private static void marksCalculator(int i, int j, int k) {
		System.out.println("Total marks: "+(i+j+k)+" Percentage: "+(i+j+k)/3+"%");
	}

	private static void conditionValueCheck() {
		int a = 55;
	    int b = 70;
	    System.out.println(a < 50 && a < b);
	    System.out.println(a < 50 || a < b);
	}

	private static void powerFinder(int base, int power) {
		 System.out.println("Power is: "+(int)Math.pow(base,power));		
	}

	private static void checkTwoNumberEqual(int a, int b) {
			System.out.println((a==b)?"Both are Equal":"Not Equal");		
	}

	private static void addMultiplyModuloWithOperator(int num) {
		num+=8;
		num/=3;
		num%=5;
		num*=5;
		System.out.println("Result is :"+num);
	}

	private static void addMultiplyModulo(int num) {
		 System.out.println("Result is :"+(((8+num)/3)%5)*5);		
	}

	private static void perimeterOfTraingle(int i, int j, int k) {
		System.out.println("Perimeter :"+(i+j+k));
	
	}

	private static void areaAndPerimenterOfRectangle(int a, int b) {
		System.out.println("Area is " + (a * b) + "\nPerimeter is " + (2 * (a + b)));
	}
}
