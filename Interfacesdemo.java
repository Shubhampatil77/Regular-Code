package LabManualDemo;
interface printable{
	public void printLine();
	public void printStar();
}

interface testable{
	public void testCoke();
}

class printer implements printable,testable
{
	public void printLine(){
		System.out.println("-------------------------------");	
		}
	public void printStar(){
		System.out.println("*******************************");
	}
	public void testCoke() {
		System.out.println("Testing .......please wait!!!");
	}
}
public class Interfacesdemo {

	public static void main(String[] args) {
		printer print=new printer();
		print.printLine();
		print.testCoke();
		print.printStar();
		}
}