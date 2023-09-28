package Day7Collection;

import java.util.LinkedList;

public class LinkedListDemo {
	public static void main(String args[]) {
		LinkedList l = new LinkedList();
		l.add(100);
		l.add(200);
		l.add("Shubham");
		l.add("Deepak");
		l.add("Deepak");
		l.add(300);
		l.add(500);

		System.out.println(l);

		LinkedList ll = new LinkedList();

		ll.addAll(l);
		ll.add(40);

		System.out.println(ll);
		System.out.println("Before Fierst Elemnt of ll=  "+ll.getFirst());
		System.out.println("Before last Elemnt of ll=  "+ll.getLast());
		ll.removeFirst();
		ll.removeLast();
		
		System.out.println("After Fierst Elemnt of ll=  "+ll.getFirst());
		System.out.println("After last Elemnt of ll=  "+ll.getLast());

		System.out.println(l.contains(300));
		System.out.print(l.containsAll(ll));

	}

}
