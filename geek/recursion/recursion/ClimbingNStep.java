package recursion;

/*Constraint:  1 or 2 step jumps only
2 : {1,1}; {2}
3 : {1,1,1}; {1,2}; {2,1}
 
N > 1: Count the number of ways to reach to the top
*/

public class ClimbingNStep {

public static void main(String[] args) {
	
	System.out.println(countStep(4));
}

private static int countStep(int n) {
	if(n<=1) {
		return 1;
	}
	if(n==2) {
		return 2;
	}
	int left=countStep(n-1);
	int right=countStep(n-2);
	return left+right;
	
}
	
}
