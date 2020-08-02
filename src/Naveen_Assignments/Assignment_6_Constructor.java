package Naveen_Assignments;

import java.util.ArrayList;

public class Assignment_6_Constructor {

//	1. Design a University class template with the following features:
//	 variables:
//	name
//	country
//	stablishedDate
//	List of course provided in Array List<String>
//
//	--Design the constructor of this class with different parameters and all parameters.
//	
//	--Write the get method of each variable with return keyword. 
	
	String name;
	String country;
	int stablishedDate;
ArrayList<String> courses = new ArrayList<String>();

	public Assignment_6_Constructor(String name, String country, int stablishedDate,ArrayList<String> courses) {
		this.name = name;
		this.country = country;
		this.stablishedDate = stablishedDate;
		
		this.courses = courses;
		System.out.println("Calling 1st constructor");
	}
	
//	Write the get method of each variable with return keyword. 
	
	
	
	
	
	
	
	
	
	
	
	public static void main(String[] args) {
	
		ArrayList<String> courses = new ArrayList<String>();
		courses.add("Java");
		courses.add("Python");
		courses.add("SQL");
		Assignment_6_Constructor ar = new Assignment_6_Constructor("Aman","India",12101994,courses);
		System.out.println((ar.name + " " + ar.country +" "+ ar.stablishedDate + " "+ ar.courses));	

	}

}
