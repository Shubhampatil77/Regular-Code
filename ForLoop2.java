package BasicDay1;
import java.util.Scanner;
public class ForLoop2 {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter The Number:");
		int n=sc.nextInt();
		for(int i=1;i<=n;i++)
			System.out.println(+i);
	}
}
