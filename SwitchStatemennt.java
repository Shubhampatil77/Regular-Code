package BasicDay1;

import java.util.Scanner;

public class SwitchStatemennt {
	public static void main(String args[]) {
		float a, b;
		int ch;
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter The First Number:");
		a = sc.nextInt();

		System.out.print("Enter The Second Number:");
		b = sc.nextInt();

		System.out.println("Enter The Choice: 1->ADD 2->SUB 3->MUL 4->DIV");
		ch = sc.nextInt();
		switch (ch) {
		case 1:
			System.out.println("Addtion = " + (a + b));
			break;
		case 2:
			System.out.println("Subtraction = " + (a - b));
			break;
		case 3:
			System.out.println("Multiplication = " + (a * b));
			break;
		case 4:
			System.out.println("Division = " + (a / b));
			break;   
		default:
			System.out.print("Invalid Choice");
		}
	}

}
