package Day5;

public class PrimeFOR {
	public static void main(String args[]) {
		int no = 11, temp = 0;
		for (int i = 2; i <= no - 1; i++) {
			if (no % i == 0) {
				temp = temp + 1;
			}
		}
		if (temp == 0) {
			System.out.println(" prime");
		} else {
			System.out.println("NOT prime");

		}

	}

}
