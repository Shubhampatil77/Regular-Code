package BasicDay1;

import java.util.Scanner;

public class REVRSENUMBERDoWhileLoop1 {
	public static void main(String args[]) {
		int n, rev = 0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter The Number:");

		n = sc.nextInt();
		while (n > 0) {
			rev = (rev * 10) + n % 10;
			n = n / 10;
		}

		System.out.println("Reverse Number is :"+rev);
	}
}
