package Day4;

public class ClassObject {
	void first() {
		System.out.println("My Name is First I am Method ");
		System.out.println(""+id+"\t"+name);


 }
	int id;
	String name;
	void eat() {
		System.out.println(""+id+"\t"+name);
		
	}
	public static void main(String args[]) {
		ClassObject s = new ClassObject();
		s.id=11;
		s.name="CAT";
		s.eat();
		s.first();
		
		s.run();
		System.out.println(""+s.id+"\t"+s.name);


	}
 void run() {
		System.out.println("My Name is run I am Method ");

 }
}
