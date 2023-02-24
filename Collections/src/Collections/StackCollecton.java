package Collections;

import java.util.Stack;

public class StackCollecton{
	public static void main(String[] args) {
		Stack s= new Stack();
		s.push(89); // we use push method to add values into the stack
		s.push(2);
		s.push(87);
		s.push(6);
		s.push(45);
		s.push(34);
		System.out.println(s);
		s.pop();// pop method is used to delete the values
		System.out.println(s);
		System.out.println(s.search(89));//search method is used to find the number index position
		
		/*
		 * for(int i =0;i<s.size();i++) { System.out.println(s.get(i));
		 * 
		 * }
		 */
		
		
	}
}

	