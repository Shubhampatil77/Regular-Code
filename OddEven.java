package BasicDay1;
import java.util.*;
public class OddEven {
	public static void main(String args[]) {
		int a;
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter The Number:");
		a=sc.nextInt();
		
		
		if(a%2==0)
		System.out.println(+a+"is Even number");
		else
			System.out.println(+a+"is odd Number");			
	}

}
