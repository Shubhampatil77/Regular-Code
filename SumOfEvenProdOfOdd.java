package BasicDay1;
import java.util.Scanner;
public class SumOfEvenProdOfOdd {
	public static void main(String args[]) {
		int n,sum=0,pro=1,digit;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Number:");
		n=sc.nextInt();
		while(n>0)
		{
			digit=n%10;
			if(digit%2==0)
				sum=sum+digit;
			else
				pro=pro*digit;
			n=n/10;
			
		}
		System.out.println("Sum:"+sum+"Product"+pro);
	}

}
