package Collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.ListIterator;

public class ListCollection {

	public static void main(String[] args) {
		ArrayList l= new ArrayList<>();
		l.add("java");
		l.add("python");
		l.add("html");
		l.add("css");
		l.add("webServices");
		/*
		 * System.out.println(l); for(int i=0;i<l.size();i++) {
		 * System.out.println(l.get(i)); }
		 * 
		 * 
		 * List l1 = new ArrayList(); l1.add("bootstrap"); l1.addAll(l);
		 * System.out.println(l1);
		 * 
		 * ListIterator itr= l.listIterator();
		 * System.out.println("in forwrad direction"); while(itr.hasNext()) {
		 * System.out.println(itr.next()); } System.out.println("--------------------");
		 * System.out.println("in backward direction");
		 * 
		 * while(itr.hasPrevious()) { System.out.println(itr.previous()); }
		 */
		System.out.println(l.isEmpty());
		System.out.println(l.remove("css"));
		System.out.println(l.contains("python"));
		System.out.println(l.lastIndexOf(0));
		//l.sort((CASE_INSENSITIVE_ORDER));
		System.out.println(l);
		


	}

}
