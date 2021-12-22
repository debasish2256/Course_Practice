package L1;

import java.util.Scanner;

public class findGreatestAmong3Numbers {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int a = sc.nextInt(), b = sc.nextInt(), c = sc.nextInt();
		System.out.println(findGreatestAmongThreeUsingMathMax(a, b, c));
		System.out.println(findGreatestAmongThreeUsingTernary(a, b, c));
		System.out.println(findGreatestAmongThree(a,b,c));
	}

	

//	Approach 1 (Using Max)
	private static int findGreatestAmongThreeUsingMathMax(int a, int b, int c) {
		return Math.max(Math.max(a, b),c);
	}
	
//	Approach 2 (Usinh If Else Statement)
	private static int findGreatestAmongThree(int a, int b, int c) {
		if(a>b) {
			if(a>c) {
				return a;
			}else {
				return c;
			}
		}else {
			if(b>c) {
				return b;
			}else{
				return c;
			}
		}	
	}
	
//	Approach 3 (Using One liner Ternary)
	private static  int findGreatestAmongThreeUsingTernary(int a, int b, int c) {
		return a>b ? (a>c ? a:c):(b>c ? b:c);
	}
	
}
