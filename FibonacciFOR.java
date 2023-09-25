package Day5;

public class FibonacciFOR {

	public static void main(String args[]) {
		int a = 0, b = 1;
		System.out.print(a + " " + b);

		int c;
		for (int i = 1; i <= 100; i++) {
			c = a + b;
			System.out.print(" " + c);
			a = b;
			b = c;

		}

	}

}
