package BasicDay1;

import java.util.Scanner;

public class SOD {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Number");
		int n, sum = 0;
		n = sc.nextInt();
		while (n > 0) 
		{
			sum = sum + n % 10;
			n = n / 10;
		}
		System.out.println(""+sum);
	}

}
