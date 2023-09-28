package Day8Collection;

import java.util.HashMap;
import java.util.Map;

public class HaspMapDemo {

	public static void main(String[] args) {
		HashMap hm = new HashMap();
		hm.put(1, 100);
		hm.put(2, 200);
		hm.put(3, 30);
		hm.put(4, "Shubham");

		System.out.print(hm);
		System.out.println(hm.size());

		System.out.println(hm.get(1));

	}

}
