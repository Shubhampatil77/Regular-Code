package CollectionDAY2;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class TraverseExample {
	public static void main(String args[]) {
		ArrayList<String> name = new ArrayList<String>();
		name.add("Durgesh");
		name.add("Shubham");
		name.add("Ajay");
		name.add("Shweta");
		name.add("Durgesh");

		for (String str : name) {
			System.out.print(str + "\t" + str.length() + "\t");
			StringBuffer br = new StringBuffer(str);
			System.out.println(br.reverse());
		}

		System.out.println("___________________________________________________________________");

		// Traversing using Iterator (Forward Traversal)
		Iterator<String> itr = name.iterator();

		while (itr.hasNext()) {
			String next = itr.next();
			System.out.println(next);
		}
		
		System.out.println("------------------------------");

		// back Traversing using LISTIterator

		ListIterator<String> litr = name.listIterator(name.size());
		while (litr.hasPrevious())
			
		{
			String previous = litr.previous();
			System.out.println(previous);
		}

		System.out.println("*********************");

		name.forEach(e -> {
			System.out.println(e);

		});
	}
}
