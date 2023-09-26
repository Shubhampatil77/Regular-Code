package Day6Collection;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class SetDemo {

	public static void main(String[] args) {

		Set s=new HashSet();
		s.add(22);
		s.add("Shubham");
		s.add(null);
		
		System.out.println(s);
		
		Iterator itr=s.iterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());

		}
	}

}
