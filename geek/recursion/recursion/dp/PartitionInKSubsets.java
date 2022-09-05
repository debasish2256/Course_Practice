package recursion.dp;

import java.util.ArrayList;

public class PartitionInKSubsets {
	static int counter=0;
	
	/*
	 * @Param ssf-->set so far
	 */
	public static void solution(int i, int n, int k, int ssf, ArrayList<ArrayList<Integer>> ans) {
		if(i>n) {
			if(ssf==k) {
				counter++;
				System.out.print(counter+".");
				for(ArrayList<Integer> set: ans) {
					System.out.print(set+" ") ;
				}
				System.out.println();
			}
			return;
		}
		
		for(int j=0;j<ans.size();j++) {
			if(ans.get(j).size()>0) {
				ans.get(j).add(i); //adding element while going up
				solution(i+1, n, k, ssf, ans);
				ans.get(j).remove(ans.get(j).size()-1);//remove element while coming down for restoring
			}else{
				ans.get(j).add(i); //adding element in empty set
				solution(i+1, n, k, ssf+1, ans);
				ans.get(j).remove(ans.get(j).size()-1);//remove element for restoring
				break;
			}
		}
		
	}
	public static void main(String[] args) {
		int n = 3;
		int k = 2;
		ArrayList<ArrayList<Integer>> ans = new ArrayList<>();
		for(int i  = 0; i < k; i++) {
			ans.add(new ArrayList<>());
		}
		solution(1, n, k, 0, ans);

	}
}
