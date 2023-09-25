package Day5;

public class StaticMethod {
	static void display() {
		System.out.println("This IS Static Method in java");
	}

	public static void main(String args[]) {
		StaticMethod.display();
		StaticMethod2.display();
	}

	public class StaticMethod2 {
		static void display() {
			System.out.println("This IS Static Method 2 in java");
		}

}
}
