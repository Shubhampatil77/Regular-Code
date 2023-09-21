package CollectionDAY2;

import java.util.HashMap;

public class Map1 {
	public static void main(String args[]) {
		HashMap<String, Integer> course = new HashMap<>();

		// adding Element

		course.put("Core Java", 4000);
		course.put("Python", 3000);
		course.put("Spring", 8000);
		course.put("Core Java", 4000);
		course.put("Android ", 5000);

		System.out.println(course);

		course.forEach((e1, e2) -> {

			System.out.println(e1 + "=>" + e2);
		});

		System.out.println(course.get("Core Java"));

	}

}
