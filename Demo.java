package GenericDay3;
import java.util.*;
public class Demo {
	public static void main(String args[])
	{
		//Genric Type-Safe
		List<String> one=new ArrayList();
		one.add("Shubham");
		one.add("Durgesh");
		
		System.out.println(one);
			
		//Not Generic Type-Safe
		List two=new ArrayList();
		two.add(1);
		two.add("Two");
		System.out.println(two);

	}
	

}
