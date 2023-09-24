package Day4;

public class Constructor {
	{
		System.out.println("I am Default Constructor !!");
	}
	
Constructor(){
		
		System.out.println("I am NON-Constructor !!");
	}

	Constructor(String name){
		
		System.out.println("I am Default Parameterized Constructor !!");

	}
	public static void main(String args[]) {
		Constructor s=new Constructor();

		Constructor s1=new Constructor("Parameterized");
		
	}
}
