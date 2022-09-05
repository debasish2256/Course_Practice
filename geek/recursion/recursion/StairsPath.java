package recursion;

import java.util.ArrayList;
import java.util.Arrays;
//1,2,3 Jumps Allowed
public class StairsPath {

	public static void main(String[] args) {
		System.out.println(printListOfPath(3));
	}

	private static ArrayList<String>  printListOfPath(int n) {
		if(n==0) {
			ArrayList<String> path0=new ArrayList<>();
			path0.add("");
			return path0;
		}else if(n<0) {
			return new ArrayList<>();
		}
		ArrayList<String> path1=printListOfPath(n-1);
		ArrayList<String> path2=printListOfPath(n-2);
		ArrayList<String> path3=printListOfPath(n-3);
		ArrayList<String> paths=new ArrayList<>();
		for(String path:path1)
			paths.add(1+path);
		for(String path:path2)
			paths.add(2+path);
		for(String path:path3)
			paths.add(3+path);
		return paths;
	}
}
