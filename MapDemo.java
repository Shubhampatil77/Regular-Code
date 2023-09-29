package Day8Collection;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;


public class MapDemo {

	
	public static void main(String[] args) {
		
		ArrayList a=new ArrayList();
		a.add(100);
		a.add("Shubham");
		System.out.println(a);
		
		

		Map m=new HashMap();
		m.put(1, 100);
		m.put(2, 200);
		m.put(3, "Shubham");
		m.put(4, "Deepak");
		
//		m.clear();
		System.out.println(m.containsKey(5));
		
		System.out.println(m.containsValue(100));

		System.out.println(m.get(3));
			
		System.out.println(m.size());


		System.out.println(m);
		
	
		
		
	}
}
