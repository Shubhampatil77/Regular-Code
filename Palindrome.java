package BasicDay1;

import java.util.Scanner;

public class Palindrome {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Number To Check Whether Is Palidrome Or Not:");
		int n, rev = 0, m;
		n = sc.nextInt();
		m = n;
		while (n > 0) {
			rev = (rev * 10) + n % 10;
			n = n / 10;
		}

		System.out.println("This is the revres number" + rev);

		if (m == rev)
			System.out.println("Given Number is Palindrome");
		else
			System.out.println("Given Number is NOT Palindrome");

	}

}
