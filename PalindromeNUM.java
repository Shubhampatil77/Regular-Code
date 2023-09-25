package Day5;

public class PalindromeNUM {
	public static void main(String args[]) {
		int no = 121, temp = no, rev = 0, rem;
		while (temp != 0) {
			rem = temp % 10;
			rev = rev * 10 + rem;
			temp = temp / 10;

		}
		if (no == rev) {
			System.out.println(no + " is Palindrome Number");
		} else {
			System.out.println(no + " is Not Palindrome Number");

		}
	}

}
