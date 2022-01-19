package geek;

/*
- Find all students with name starting from 'B' and age < 20
*/

public class C4 {
	public static void main(String[] args) {
		// name,age
		String[][] students = { { "Ramesh", "20" }, { "bikash", "22" }, { "bingo", "17" }, { "Bean", "15" },{ "Dhanajay", "10" } };
		for (String[] s : students) {
			if ((s[0].startsWith("B") || s[0].startsWith("b")) && Integer.valueOf(s[1]) < 20) {
				System.out.println(s[0] + " -> " + s[1]);
			}
		}
	}
}
