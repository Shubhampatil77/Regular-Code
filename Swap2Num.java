package Day5;

public class Swap2Num {
	void swap() {
		int a = 10,
				b = 20;
				System.out.println("a Before Swapping:"+a);
				System.out.println("b Before Swapping :"+b);
				a=a+b;
				b=a-b;
				a=a-b;
				System.out.println("a After Swapping:"+a);
				System.out.println("b After Swapping :"+b);
	}
	
	void swap2() {
		int a = 100,
				b = 200;
				System.out.println("a Before Swapping:"+a);
				System.out.println("b Before Swapping :"+b);
				int t;
				t=a;
				a=b;
				b=t;
				System.out.println("a After Swapping:"+a);
				System.out.println("b After Swapping :"+b);
	}

	public static void main(String[] args) {
		Swap2Num w=new Swap2Num();
		w.swap();
		
		w.swap2();
		
		
	}
	

}
