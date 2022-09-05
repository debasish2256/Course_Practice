package recursion.dp;

public class KadanesAlgorithm {
	public static void main(String[] args) {
		System.out.println(compute(new int[] {1,2,3}));
	}

	private static int compute(int[] arr) {
		int curSum=arr[0];
		int osum=arr[0];
		for(int i=1;i<arr.length;i++) {
			if(curSum>=0) {
				curSum+=arr[i];
			}else {
				curSum=arr[i];
			}
			osum=Math.max(osum, curSum);
		}
		return osum;
	}
}
