package Day4;
import java.util.*;

class Employee{
	int id;
	String name,dept;
	float salary;
	 
	
	void accept() {
	Scanner sc=new Scanner(System.in);
	System.out.print("Enter The ID :");
	id=sc.nextInt();
	System.out.print("Enter The Name:");
	name=sc.next();
	System.out.print("Enter The Department :");
	dept=sc.next();
	System.out.print("Enter The Salary :");
	salary=sc.nextInt();
	}
	void display() {
		System.out.println("Employee is Id:"+id);
		System.out.println("Employee is Name:"+name);
		System.out.println("Employee is Department:"+dept);
		System.out.println("Employee is Salary:"+salary);
		
	}
}


class SimpleclassObject2 {
	public static void main(String args[]) {
		Employee E=new Employee();
		E.accept();
		E.display();
		
	}

}
