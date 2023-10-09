package LabManualDemo;

interface Client{
	void website();
	void websitedevlop();
}

abstract class Rajtech implements Client{
	public void website() {
		System.out.println("GREEN,TOP,MENU,THREE DOT BUTTON");
		}
}
class Rahultech extends Rajtech{
	@Override
	public void websitedevlop() {
				
	}

	@Override
	public void website() {
		System.out.println("HTML<CSS<JAVASCRIPT");
	}
}
public class Interfaceonlinedemo2method {

	public static void main(String[] args) {
		Rahultech s=new Rahultech();
		s.website();
		s.websitedevlop();

	}

}
