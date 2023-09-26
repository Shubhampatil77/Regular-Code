package Day6Collection;

import java.util.ArrayList;
import java.util.List;
import java.util.Iterator;

public class lterator {
	public static void main(String args[]) {
		List ad = new ArrayList();

		ad.add(222);
		ad.add("Shubham");
		ad.add(100);
		
		System.out.println(ad);

		
		Iterator itr=ad.iterator();
		while(itr.hasNext())
	{
			System.out.println(itr.next());

			ad.remove(0);
			System.out.println(itr.next());
		}
	}
}
