package Day5;

public class Factorial {
	int no = 5, i, fact = 1;

	void Fact1() {
		for(i=1;i<=no;i++)
		{
			fact=fact*i;
		}
		System.out.println(fact);
		
		
	}
	void Fact2() {
		for(i=1;i>=no;i--)
		{
			fact=fact*i;
		}
		System.out.println(fact);
		
	}

	public static void main(String[] args) {
		Factorial s = new Factorial();
		s.Fact1();
		s.Fact2();

	}

}
