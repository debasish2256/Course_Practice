package recursion;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class PowerSet {
	public static void main(String[] args) {
		List<String> ans = new ArrayList<>();
		findPowerSet("abc", "", 0, ans);
		System.out.println(ans);
	}

	private static void findPowerSet(String inputString, String blankString, int index, List<String> ans) {
		if (index == inputString.length()) {
			ans.add(blankString);
			return;
		}
		// pick
		findPowerSet(inputString, blankString + inputString.charAt(index), index + 1, ans);
		// not pick
		findPowerSet(inputString, blankString, index + 1, ans);
	}

}
