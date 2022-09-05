package recursion;

public class PermutationOfGivenString {
	public static void main(String[] args) {
		String input="abc";
		permute("abc",0,input.length()-1);
	}

	private static void permute(String str, int l, int r) {
		if(l==r) {
			System.out.println(str);
			return;
		}
		for(int i=l;i<=r;i++) {
			str=swap(str,l,i);
			permute(str,l+1,r);
			str=swap(str,l,i);
		}
	}

	private static String swap(String str, int l, int i) {
		StringBuilder sb = new StringBuilder(str);
        sb.setCharAt(l, str.charAt(i));
        sb.setCharAt(i, str.charAt(l));
        return sb.toString();
	}
}
