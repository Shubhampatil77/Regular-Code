package Day4;
class Parent{
	int i=10;
}
public class Super extends Parent {
	int i=20;
	
	void Set(int i) {
		System.out.println(i);		//30
		System.out.println(this.i);//20
		System.out.println(super.i);//10

	}
	public static void main(String args[]) {
		Super s=new Super();
		s.Set(30);
	}

}
