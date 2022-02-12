package geek;

import java.math.BigInteger;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
/*
 * -- Write a method which returns a string by removing special charaters( &,$,:,+,@)
spaces from the string  
Input: ""Geekster-The%school:where+you@code:your-success$stories""
Output : ""eekster The school where you code your success stories

-- WAP to prove that intern() method guarantees to return unique String from from a String pool

-- Write a method which accepts 10 digits mobile number as an Integer parameter and return a string containing country code with mobile number.
Input: 7890765456
Output : ""+91-7890765456"";

-- Write a method which accepts a String as a parameter and returns ratio of vowels to consonants in String format
Input: ""We are Proud to be an India""
Output : ""11:10"
*/
public class C17 {
public static void main(String[] args) {
//	C/W
	emailValidator();
//	H/W
	System.out.println(removeSpecialCharacter("Geekster-The%school:where+you@code:your-success$stories"));
	proofOfIntern();
	System.out.println(constructMobileNumberAddingCountryCode(new Scanner(System.in).nextBigInteger())); 
	System.out.println(ratioOfVowelAndConsonants("We are Proud to be an India"));
}

private static String ratioOfVowelAndConsonants(String s) {
	s=s.toLowerCase();
	int vowel=0,consonant=0;
	for(int i=0;i<s.length();i++) {
		if (s.charAt(i) >= 'a' && s.charAt(i) <= 'z') {
			if(s.charAt(i)=='a'||s.charAt(i)=='e'||s.charAt(i)=='i'||s.charAt(i)=='o'||s.charAt(i)=='u') {
				vowel++;
			}
			consonant++;
		}
	}
	return new String(vowel+":"+(consonant-vowel));
}

private static String constructMobileNumberAddingCountryCode(BigInteger phNumber) {
	return String.valueOf("+91-"+phNumber);
}

private static void proofOfIntern() {
	
	String firstString = "debasish";
    String secondString = new String("debasish");
    
    System.out.println(firstString == secondString); 
    
    String thirdString = secondString.intern();
    
    System.out.println(firstString == thirdString);
}

static String removeSpecialCharacter(String s)
{
    for (int i = 0; i < s.length(); i++)
    {
//    	if my character not fall withing A-Z and a-z then special
        if (s.charAt(i) < 'A' || s.charAt(i) > 'Z' && 
        		s.charAt(i) < 'a' || s.charAt(i) > 'z')
        {
            s = s.substring(0, i) +" "+ s.substring(i + 1);
        }
    }
    return s;
}


	private static void emailValidator() {
		String regex = "^[\\w!#$%&'*+/=?`{|}~^-]+(?:\\.[\\w!#$%&'*+/=?`{|}~^-]+)*@(?:[a-zA-Z0-9-]+\\.)+[a-zA-Z]{2,6}";
		Pattern pattern = Pattern.compile(regex);

		Matcher matcher = pattern.matcher(new Scanner(System.in).nextLine());
		System.out.println(matcher.matches());
	}
}
