package Day4;

class p {
	void s() {
		System.out.println("Parent");

	}
	p(){
		System.out.println("Parent Constructor");

	}
}

public class AllAboutSuper extends p {
	void s() {
		super.s();
		System.out.println("child");
	}
	AllAboutSuper(){
		//super();
		System.out.println("child Constructor ");

	}

	public static void main(String args[]) {
		AllAboutSuper v = new AllAboutSuper();
		v.s();
	}

}
