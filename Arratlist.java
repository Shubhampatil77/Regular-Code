package Day6Collection;

import java.util.ArrayList;
import java.util.ListIterator;

public class Arratlist {
	public static void main(String args[]) {
		ArrayList ob = new ArrayList();
		ob.add(1000);
		ob.add(2000);
		ob.add("Shubham");

		System.out.println(ob);

		System.out.println(ob.contains(1000));

		System.out.println(ob.isEmpty());

		ListIterator itr = ob.listIterator();

		/*
		 * while(itr.hasNext()) { System.out.println(itr.next());
		 * 
		 * }
		 */
		itr.set(200);
		while (itr.hasPrevious()) {
			System.out.println(itr.next());

		}
	}

}
