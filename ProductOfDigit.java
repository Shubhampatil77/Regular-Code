package BasicDay1;

import java.util.Scanner;

public class ProductOfDigit {
	public static void main(String args[]) {
		int n, pro = 1;
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter The Value:");
		n = sc.nextInt();
		while (n > 0) {
			pro = pro * (n % 10);
			n = n / 10;
		}
		System.out.print(pro);

	}

}
