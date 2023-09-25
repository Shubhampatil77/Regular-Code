package Day5;
import java.util.Scanner;
public class Multiplicaton {

	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter The No");
		int no=sc.nextInt();
		for(int i=1;i<=10;i++)
			System.out.println(no+"*"+i+"="+i*no);
	}
}
