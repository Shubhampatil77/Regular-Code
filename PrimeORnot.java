  package BasicDay1;

import java.util.Scanner;

public class PrimeORnot {
	static void checkprime(int n) {
		{
			int i, count = 0;
			/*
			 * Scanner sc=new Scanner(System.in);
			 * System.out.print("Enter Number To check;"); n=sc.nextInt();
			 */
			i = 1;
			while (i <= n) {
				if (n % i == 0)
					count = count + 1;
				i = i + 1;
			}
			if (count == 2)
				System.out.println(n + " is Prime");
			else
				System.out.println(n + " is Not Prime");
		}
	}

	public static void main(String args[]) {
		checkprime(1);
		checkprime(2);
		checkprime(7);
		checkprime(55);
	}
}
