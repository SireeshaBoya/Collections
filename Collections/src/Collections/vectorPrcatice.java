package Collections;

import java.util.Vector;

public class vectorPrcatice {
	public static void main(String[] args) {
		Vector<String> v1= new Vector<String>();
		v1.add("sireesha");
		v1.add(0,"ramalingadu");
		v1.add("prakashnaidu");
		v1.add(1,"parvathi");
		System.out.println(v1);
		System.out.println(v1.size());
		System.out.println(v1.capacity());
		Vector<String> v2= new Vector<String>();
		v2.add("Vinod");
		v2.addAll(v1);
		v2.set(1, "sreeyan");
		v2.set(2, "happy");
		
		System.out.println(v2.get(1));
		System.out.println(v2.get(2));
		System.out.println(v2);
	}
}
