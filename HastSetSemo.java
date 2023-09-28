package Day8Collection;

import java.util.HashSet;

public class HastSetSemo {

	public static void main(String[] args) {
		HashSet hs = new HashSet();

		hs.add("Shubham");
		hs.add("Deepak");
		hs.add(100);
		hs.add(200);
		hs.add(300);
		hs.add(null);
		hs.add(400.25);

		System.out.println(hs);
	}
}
