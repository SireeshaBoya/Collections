package Collections;
//by creating objects we can store the values into the arraylist....using constructors tooo 
  

import java.util.ArrayList;
import java.util.List;

class student{
	int id;
	String name;
	String branch;
	String location;
	

public student(int id,String name,String branch,String location){
	this.id=id;
	this.name=name;
	this.branch=branch;
	this.location=location;		
}	
}
public class ObjectCreation {
	public static void main(String[] args) {
		List<student> list=new ArrayList();
		student s1= new student(1,"sireesha","bscAgri","mumbai");
		student s2= new student(2,"thriveni","bscAgri","mumbai");
		list.add(s1);
		list.add(s2);
		for(student s:list) {
			System.out.println(s.id+" "+s.name+" "+s.branch+" "+s.location);
		}		
	}
}
