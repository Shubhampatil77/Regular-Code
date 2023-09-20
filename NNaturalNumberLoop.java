package BasicDay1;

import java.util.*;

public class NNaturalNumberLoop {
	public static void main(String args[]) {
		int n, i, sum=0;
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Number:");
		n = sc.nextInt();
		i = 1;
		while (i <= n) {
			sum = sum + i;
			i = i + 1;
		}
		System.out.println(sum);
	}

}
