package Day4;

class ThisDemo {
	int i;

	void set(int i) {
		// this Keyword is to invoke currunt class object
		this.i = i;

	}

	void get() {
		System.out.println(" Value is :" + i);
	}
}

class This2 {
	void disply() {
		System.out.println("this keyword is usw to unvoke currunt class method (implcitly)");
	}

	void show() {
		// this keyword is usw to unvoke currunt class method (implcitly)

		this.disply();
	}
}

class This3 {
	This3() {

		System.out.println("this keyword is usw to call currunt class Constructor");

	}

	This3(int a) {
		this();
		System.out.println("this keyword is usw to call currunt class Constrictror paramwetrized ");

	}
}

class This5 {
	This5 m1() {
		//this keyword can return current class instance
		
return 	this;
}
}

public class AllAboutThis {
	public static void main(String args[]) {
		ThisDemo s = new ThisDemo();
		s.set(400);
		s.get();

		This2 s2 = new This2();
		s2.show();

		This3 s4 = new This3(1);
		This3 s3 = new This3();

		This5 s5 = new This5();
		s5.m1();
	}

}
