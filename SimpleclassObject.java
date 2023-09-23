package Day4;
import java.util.*;
class Student{
	int id;
	String name;

void accept(){
 Scanner sc=new Scanner(System.in);	
 System.out.println("Enter The ID And Name:");
 id=sc.nextInt();
 name=sc.next();
}

void display(){
	System.out.println("ID:"+id);
	System.out.println("Name:"+name);

}
}
public interface SimpleclassObject {
	public static void main(String args[]) {
		Student i=new Student();
		i.accept();
		i.display();
	}

}
