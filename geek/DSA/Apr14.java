package DSA;


/*"""1. Print the sum of the boundary elements and diagonal elements in a given matrix of size m and n

2. Print the prime numbers in the upper traingle of a 2D Matrix

"
*/
public class Apr14 {
	public static void main(String[] args) {
		int arr[][] = {
				{1, 2, 3},
				{1, 2, 3},
				{1, 2, 3}};
		System.out.println(sumOfBoundaryAndDiagonalElements(arr));
		int matrix[][] = {
				{ 1 ,2, 3, 4 },
                { 4 ,5,53, 8 },
                { 7 ,8,23,10},
                {11,12,13,19}};
		pritPrimeNumbers(matrix);
	}

	private static void pritPrimeNumbers(int[][] arr) {
		int row=arr.length,col=arr[0].length;
		for(int i=0;i<row;i++) {
			for(int j=0;j<col;j++) {
				//to consider diagonal we have added i==j
				if (i < j || i==j)
                {
					if(isPrime(arr[i][j])){
						System.out.print(arr[i][j]+" ");
					}             
				}				
			}
		}
		return ;
	}

	static boolean isPrime(int n)
    {
        // Corner case
        if (n <= 1)
            return false;
  
        // Check from 2 to n-1
        for (int i = 2; i < n; i++)
            if (n % i == 0)
                return false;
  
        return true;
    }
	
	private static int sumOfBoundaryAndDiagonalElements(int[][] arr) {
		int row=arr.length,col=arr[0].length;
		int sum=0;
		for(int i=0;i<row;i++) {
			for(int j=0;j<col;j++) {
				//for connecting diagonal
				if(i==j || (i+j)==row-1) {
					sum+=arr[i][j];
				}
				//for boundary
				else if(i==0||j==0 || j==col-1 ||i==row-1) {
					sum+=arr[i][j];
				}
			}
		}
		return sum;
	}
}
