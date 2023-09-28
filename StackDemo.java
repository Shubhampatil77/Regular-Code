package Day8Collection;

import java.util.Stack;

public class StackDemo {
	public static void main(String args[]) {
		Stack s = new Stack();
		s.push(100);
		s.push(200);
		s.push(300);
		s.push("Shubham");

		System.out.println(s);
		System.out.println(s.pop());
		System.out.println(s.peek());

		System.out.println("Serach:"+s.search(100));

		System.out.println(s.empty());
		
		
		System.out.println(s);

	}

}
