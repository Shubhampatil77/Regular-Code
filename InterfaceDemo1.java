package LabManualDemo;
interface relational 
{	void greaterThan();
	void lessThan();
	void greaterThaneq();
	void lessThaneq();
	}
class implRel implements relational
{
	int a,b;
	implRel(int a,int b)
	{
		this.a=a;
		this.b=b;
	}
	@Override
	public void greaterThan() {
		if (a>b) {
			System.out.println("a is garter Than b");
		}
	}
	@Override
	public void lessThan() {
		if (a<b) {
			System.out.println("a is Less Than b");
		}		
	}
	@Override
	public void greaterThaneq() {
		if (a>=b) {
			System.out.println("a is garter Than Equal to b");
		}
	}
	@Override
	public void lessThaneq() {
		if (a<=b) {
			System.out.println("a is Less Than Equal to b");
		}		
	}
}
public class InterfaceDemo1 {

	public static void main(String[] args) {
		relational obj=new implRel(4, 5);
		obj.greaterThan();
		obj.lessThan();
		obj.greaterThaneq();
		obj.lessThaneq();
	}
}