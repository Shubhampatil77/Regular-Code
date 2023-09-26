package Day6Collection;

import java.util.Enumeration;
import java.util.Vector;

public class EnumerationDemo {

	public static void main(String[] args) {
		Vector v = new Vector();
		v.add(122);
		v.add(100);
		v.add("Shubham");

		System.out.println(v);

		Enumeration e = v.elements();
		while(e.hasMoreElements())
		{
			System.out.println(e.nextElement());
		}
			
	}

}
