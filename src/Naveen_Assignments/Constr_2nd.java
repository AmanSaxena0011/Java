package Naveen_Assignments;

import java.util.ArrayList;

public class Constr_2nd {
	
	
public ArrayList<String> getCourse(String name,String country,int stablishedDate) {
	
	ArrayList<String> getCoursedetail = new ArrayList<String>();
	getCoursedetail.add("Java");
	getCoursedetail.add("Python");
	
	
	return getCoursedetail;
	
}
	
	
	
	
	

	public static void main(String[] args) {

Constr_2nd obj = new Constr_2nd();
obj.getCourse("Aman", "India", 1210194);
System.out.println(obj.getCourse("Aman", "India", 1210194));

	}

}
