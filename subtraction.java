package Day1;

import java.util.*;

public class subtraction {
	public static void main(String args[]) {

		/*
		 * Scanner sc= new Scanner(System.in);
		 * System.out.println("Enter First Number:"); a=sc.nextInt();
		 * System.out.println("Enter Second Number:"); b=sc.nextInt(); c=a-b;
		 * System.out.println("SubStraction of Two Number is:"+c);
		 */
		int sum = 0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Number Of Number To Be Calculated :");
		int n = sc.nextInt();
		for (int i = 0; i < n; i++) {
			System.out.print("Enter The Number:");
			int a = sc.nextInt();
			sum = sum + a;
		}
			System.out.println("Sum OF " + n + "Number is :" + sum);

		}

	
}
