package Day5;

public class FiboRrcurssion {
	static int a = 0, b = 1, c;

	public static void main(String args[]) {
		System.out.print(a + " " + b);
		FiboRrcurssion ob = new FiboRrcurssion();
		ob.fibo(15);

	}

	void fibo(int i) {
		if (i >= 1) {
			c = a + b;
			System.out.print(" " + c);
			a = b;
			b = c;
			fibo(i - 1);

		}

	}

}
