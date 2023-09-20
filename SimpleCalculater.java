package BasicDay1;
import java.util.*;
public class SimpleCalculater {

	public static void main(String args[]) {
		 float a,b,ch;
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter 1st Number:");
		a=sc.nextInt();
		System.out.print("Enter 2nd Number:");
		b=sc.nextInt();
		
		System.out.println("Enter Your Choice 1->Addtion 2->Subtraction 3->Multiplication 4->Division");
		ch=sc.nextInt();
		if(ch==1)
			System.out.println("Addtion is "+(a+b));
		else if(ch==2)
			System.out.println("Subtraction is "+(a-b));
		else if(ch==3)
			System.out.println("Multiplication is "+(a*b));
		else if(ch==4)
			System.out.println("Division is "+(a/b));

	}
}
