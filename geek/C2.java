package geek;

/*
Write pseudocode for the following patterns
*
**
***
****

1    
12
123
1234

1
22
333
4444
55555

1
2 3
4 5 6
7 8 9 10
11 12 13 14 15

*****
****
***
**
*
1234
123
12
1
*/

public class C2 {
public static void main(String[] args) {
	int size=4;
	printFirstPattern(size);
	printSecondPattern(size);
	printThirdPattern(size);
	printFourthPattern(size);
	printFifthPattern(size);
	printSixthPattern(size);
}

private static void printSixthPattern(int size) {
	for(int i=size;i>0;i--) {
		int start=1;
		while(start<=i) {
			System.out.print(start);
			start++;
		}
		System.out.println();
	}	
}

private static void printFifthPattern(int size) {
	for(int i=size;i>0;i--) {
		int start=i;
		while(start>0) {
			System.out.print("*");
			start--;
		}
		System.out.println();
	}
}

private static void printFourthPattern(int size) {
	int count=1;
	for(int i=1;i<=size;i++) {
		int start=1;
		while(start<=i) {
			System.out.print(count+" ");
			start++;
			count++;
		}
		System.out.println();
	}
	
}

private static void printThirdPattern(int size) {
	for(int i=1;i<=size;i++) {
		int start=1;
		while(start<=i) {
			System.out.print(i);
			start++;
		}
		System.out.println();
	}	
}

private static void printSecondPattern(int size) {
	for(int i=1;i<=size;i++) {
		int start=1;
		while(start<=i) {
			System.out.print(start);
			start++;
		}
		System.out.println();
	}
	
}

private static void printFirstPattern(int size) {
	for(int i=1;i<=size;i++) {
		int start=1;
		while(start<=i) {
			System.out.print("*");
			start++;
		}
		System.out.println();
	}
	
}
}
