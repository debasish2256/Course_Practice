package geek;

import java.util.Arrays;
import java.util.Vector;

/*Reverse each word
Compress the string
Highest Occurring character
If strings are equal or not
check permutation*/


public class C16 {
	public static void main(String[] args) {
//		C/W
		System.out.println(findTheDifference("ye", "yer"));
		System.out.println("abc deb bhu".replaceAll(" ", ""));
		System.out.println(isPalindrome("MALAYALAM")?"Palindrome":"Not Palindrome");
		String str="MOM";
		System.out.println(isPalindromeRecursive("MOM",0,str.length()-1));
		
//		HW
		reverseWordsInSentance("hey this is geekster hello how are you");
		stringCompressor("hey this is geekster! hello how are you !");
		highestOccuringCharacter("debasish tryuiop tryui rtyuio tryuio rtyuiooooooooooo");
		compareTwoStrings("hello","Hello");
		String perMuteString="abc";
		printPermute(perMuteString,0,perMuteString.length()-1);
		permuteStringUsingRecursiveApproach(perMuteString,"");
		printPowerSet(perMuteString,0,"");
	}


	private static void printPermute(String str, int l, int r) {
		if(l==r) {
			System.out.println(str);
			return;
		}
		for(int i=l;i<=r;i++) {
			str=swap1(str,l,i);
			printPermute(str,l+1,r);
			str=swap1(str,l,i);
		}
	}

	static String swap2(String str, int i, int j)
    {
        StringBuilder sb = new StringBuilder(str);
        sb.setCharAt(i, str.charAt(j));
        sb.setCharAt(j, str.charAt(i));
        return sb.toString();
    }
	
	private static String swap1(String str, int i, int j) {
		char ch[] = str.toCharArray();
        char temp = ch[i];
        ch[i] = ch[j];
        ch[j] = temp;
        return new String(ch);
	}

	private static void printPowerSet(String str, int i, String msg) {
		if(i==str.length()) {
			System.out.println(msg);
			return;
		}
		printPowerSet(str, i+1, msg+str.charAt(i));
		printPowerSet(str, i+1, msg);
	}


	


	private static void permuteStringUsingRecursiveApproach(String str,String ans) {
		if(str.length()==0) {
			System.out.println(ans);
			return;
		}
		for(int i=0;i<str.length();i++) {
			char ch=str.charAt(i);
			String leftHalf=str.substring(0,i);
			String rightHalf=str.substring(i+1);
			permuteStringUsingRecursiveApproach(leftHalf+rightHalf,ans+ch);
		}
		
	}





	private static void highestOccuringCharacter(String word) {
		int freq[]=new int[256];
		int max=Integer.MIN_VALUE;int index=-1;
		for(int i=0;i<word.length();i++) {
			freq[(int)word.charAt(i)]=freq[(int)word.charAt(i)]+1;
			if(freq[(int)word.charAt(i)]>max) {
				max=freq[(int)word.charAt(i)];
				index=i;
			}
		}
		System.out.println("Highest Occuring Character: "+word.charAt(index));
	}





	private static void compareTwoStrings(String a, String b) {
		System.out.println("Given String are "+(a.compareToIgnoreCase(b)==0?"Equal":"No Equal"));
	}

	private static void reverseWordsInSentance(String msg) {
		StringBuffer res=new StringBuffer();
		for(String val:msg.split(" ")) {
			res.append(new StringBuffer(val).reverse()).append(" ");
		}
		System.out.println("Reverse Word: "+res);
	}


	private static void stringCompressor(String msg) {
		System.out.println("Compressed String: "+msg.replaceAll(" ", ""));
	}


	private static boolean isPalindrome(String name) {
		int left = 0, right = name.length() - 1;
		while (left < right) {
			if (name.charAt(left) != name.charAt(right)) {
				return false;
			} 
			left ++;
			right --;
		}
		return true;
	}

	private static boolean isPalindromeRecursive(String msg,int left,int right) {
		if(left>=right)
			return true;
		if(msg.charAt(left)!=msg.charAt(right))
			return false;
		return isPalindromeRecursive(msg,left+1,right-1);
	}
	
	
	
	

	private static int findSumOfString(String s) {
		int sum = 0;
		for (char ch:s.toCharArray())
			sum += (int) ch;
		return sum;
	}

	public static char findTheDifference(String s, String t) {
		return (char) (findSumOfString(t) - findSumOfString(s));
	}
}
