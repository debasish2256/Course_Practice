package geek;

import java.util.Arrays;

/*"https://leetcode.com/problems/majority-element/
https://leetcode.com/problems/valid-anagram/
https://leetcode.com/problems/sorting-the-sentence/
Search for an element in the Circular Sorted Array.
Ex- {12,15,2,4,7,9}  Search for 7"
*/
public class Apr03 {
	public static void main(String[] args) {
		System.out.println(majorityElement(new int[] { 2, 2, 1, 1, 1, 2, 2 }));
		System.out.println(isAnagram("rat","cat"));
		System.out.println(sortSentence("Myself2 Me1 I4 and3"));
		System.out.println(search(new int[] {12,15,2,4,7,9},7));
	}

	public static int search(int[] nums, int target) {
		int l = 0, h = nums.length-1;
        while(l <= h) {
            int mid = l+(h-l)/2;
			
            if(nums[mid] == target) return mid+1;
			 
            if(nums[l] <= nums[mid]) 
                if(target >= nums[l] && target <= nums[mid]) 
                    h = mid-1;
                else 
                    l = mid+1;
           
			else 
                if(target >= nums[mid] && target <= nums[h]) 
                    l = mid+1;
                else 
                    h = mid-1;
        }
        
        return -1;
    }
	
	public static int majorityElement(int[] nums) {
		int n = nums.length;
		Arrays.sort(nums);
		return nums[n / 2];
	}
	
	public static boolean isAnagram(String s, String t) {
        int[] letters = new int[128];
        
        for (char c : s.toCharArray()) {
            int ascii = (int) c;
            letters[ascii]++;
        }
        for (char c : t.toCharArray()) {
            int ascii = (int) c;
            letters[ascii]--;
        }
        for (int i = 0; i < letters.length; i++) {
            if (letters[i] != 0) {
                return false;
            }
        }
        return true;
    }
	
	public static String sortSentence(String s) {
        String[] str=s.split(" ");
        String[] r=new String[str.length];
        for(int i=0;i<str.length;i++){
            char ch=(str[i].charAt(str[i].length()-1));
            int j=ch-'0';
            r[j-1]=str[i].substring(0,str[i].length()-1);
        }
        return String.join(" ",r);
    }
}