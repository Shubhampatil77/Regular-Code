package CollectionDAY2;

import java.util.*;

public class ArrayList1 {
	public static void main(String args[]) {
		ArrayList<String> name = new ArrayList<String>();
		name.add("Durgesh");
		name.add("Shubham");
		name.add("Ajay");
		name.add("Shweta");
		name.add("Durgesh");
		name.remove(3);

		System.out.println(name);
		System.out.println(name.get(0));
		System.out.println(name.get(2));
		System.out.println(name.size());
		System.out.println(name.contains("Shubham"));
		System.out.println(name.isEmpty());

		ArrayList list = new ArrayList();
		list.add(123);
		list.add("Shubham");
		list.add(234.43);
		list.add("My Name is Shubham");
		System.out.println(list);
		System.out.println("_______________________________");

		Vector<String> vector = new Vector<String>();
		vector.addAll(name);
		System.out.println("VECTORS :" + vector);
		System.out.println("_______________________________");
	}

}
