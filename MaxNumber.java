package BasicDay1;
import java.util.*;
public class MaxNumber {
	public static void main(String args[]) {

		int a,b,c;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter The First Number:");
		a = sc.nextInt();

		System.out.println("Enter The Second Number:");
		b = sc.nextInt();

		System.out.println("Enter The Third Number:");
		c =sc.nextInt();
		if(a>b && a>c)
			System.out.println("a in Greater !!"+a);
		else if (b>a && b>c)
			System.out.println("b is Greater !!"+b);
		else
			System.out.println("C is Greater !!");
	}
}
