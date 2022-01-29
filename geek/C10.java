package geek;

/*1.  Left Triangle Star Pattern
   - - - - * 
   - - - * * 
   - - * * * 
   - * * * * 
   * * * * * 
2. Pyramid Pattern
        *
      * * *
    * * * * *
  * * * * * * *
* * * * * * * * *		
3. Diamond Shape Pattern
        *
       * *
      * * *
     * * * *
    * * * * *
     * * * *
      * * *
       * *
        *
*/

public class C10 {
	public static void main(String[] args) {
		printLeftStar(5);
		printFullPyramid(5);
		printDiamond(5);
	}

	private static void printDiamond(int size) {
		int j = 0, k = 0, l = 0;
		for (int i = 1; i <= size; i++) {
			for (j = 1; j <= size - i; j++) {
				System.out.print("  ");
			}
			for (k = j; k <= size; k++) {
				System.out.print("* ");
			}
			if (i != 1) {
				l = 0;
				for (l = k; l < (k + i) - 1; l++) {
					System.out.print("* ");
				}
			}
			System.out.println();
		}

		/*// for printing middle bit for few diamond shapes
		for (int i = 1; i < l; i++) {
			System.out.print("* ");
		}
		System.out.println();*/
		for (int i = 1; i <= size; i++) {
			for (k = 1; k <= i; k++) {
				System.out.print("  ");
			}
			for (j = 1; j <= size - i; j++) {
				System.out.print("* ");
			}
			for (j = 1; j <= size - i - 1; j++) {
				System.out.print("* ");
			}
			for (k = 1; k <= i; k++) {
				System.out.print("  ");
			}
			System.out.println();
		}

	}

	private static void printFullPyramid(int size) {
		int j = 0,k=0;
		for(int i=1;i<=size;i++) {
			for (j = 1; j <= size - i; j++) {
				System.out.print("  ");
			}
			for (k = j; k <= size; k++) {
				System.out.print("* ");
			}
			if (i!=1) {
				int l=0;
				for (l = k; l < (k+i)-1; l++) {
					System.out.print("* ");
				}
			}
			System.out.println();
		}
	}

	private static void printLeftStar(int size) {
		int j = 0;
		for (int i = 1; i <= size; i++) {
			for (j = 1; j <= size - i; j++) {
				System.out.print("  ");
			}
			for (int k = j; k <= size; k++) {
				System.out.print("* ");
			}
			System.out.println();
		}
	}
}
