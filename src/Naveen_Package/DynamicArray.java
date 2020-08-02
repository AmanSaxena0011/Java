package Naveen_Package;

import java.util.ArrayList;

public class DynamicArray {

	public static void main(String[] args) {

		
//Creating ArrayList
		
		ArrayList al = new ArrayList();
		al.add(100);
		al.add("Aman");
		al.add('M');
		
		System.out.println(al.get(0));
		System.out.println(al.size());
		System.out.println(al);
		
		al.remove(0);
		System.out.println(al.get(0));
		
		
		
	
//	Only Integer ArrayList	*** Generics in Java***
		ArrayList<Integer> ar = new ArrayList<Integer>();// here <Integer is another class , wrapper class>
		ar.add(800);
		System.out.println(ar.get(0));
		
	
// Internal implementation of ArrayList: Virtual Capacity (Vc) = 10 by default.then as u start giving values , is called physical capacity (Pc). So ar.size() is calculating Pc.that is why initial size value is 0 of arraylist.
//  As the Pc increase , Vc decreases , if Pc = 4 , Vc will be 6. and if i filled all the arraylist upto , my Vc will be 0 now. But java is smart it will create automatically  a new Vc with 10.
//	Interview question: what is the default size of Vc in ALst , : 10.
	
	
// Only Double Values
		
		ArrayList<Double> decimal = new ArrayList<Double>();
		
		decimal.add(12.33);
	System.out.println(decimal.get(0));
	
//	for String:
	
	ArrayList<String> Str = new ArrayList<String>();
	
	Str.add("Zology");
	Str.add("physics");
	Str.add("Chemistry");
	Str.add("Hindi");
	Str.add("english");
	Str.add("english");
	Str.add(null);
	Str.add(null);
	Str.add(null);
	System.out.println(Str.size());
	System.out.println(Str.get(0));
	
// to print all the values of ArrayList , use Loop: For Loop:
	
	for (int i = 0; i < Str.size(); i++) {
		System.out.println(Str.get(i));
	}
// we can add multiple null values inside AList. and duplicate values also can be printer. 
	
// For Each loop:
	
	for (String each : Str) {
		System.out.println(each);
	}
		
	
	
	
	
	
	
	}

}
