package Naveen_Package;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class ArrayList_TimeComplexity {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//	 what is the performance of algorithm written in code is denoted by: Time Complexity O(n).	 , how much time my code is taking to execute the algorithm.		
//	Time Complexiy of For loop is always O(n) . as for(i=0; i<=5;i++); Syso(i);  1 + 5 + 5 + 5 = 1+3n = 3n = n = O(n).
// for Two for Loop, O(n^2). as (1+3n)*(1+3n) = quadratic eqn = O(n^2).
// so O(n) is more optimizzed as it will take less time to executed.
		
		
// Sorting in ArrayList
		
		ArrayList<String> name = new ArrayList<String>();
		name.add("Aman");
		name.add("Sumit");
		name.add("Lucky");
		name.add("Aayush");
		name.add("Suman");
	
	
	
	System.out.println(name);
	Collections.sort(name);
	System.out.println(name);

	
// Converting Arraylist to statc array: using toArray method
	
	String ns[]	= new String[name.size()];
	
	name.toArray(ns);

	for (int i = 0; i < name.size(); i++) {
		System.out.println(ns[i]);
		
	}

// Array[] to ArrayList : asList()
	
//	ArrayList<String> nss = new ArrayList<String>(Arrays.asList(ns))	;
//	System.out.println(nss);
	
	
//	ArrayList<String> nsss = new ArrayList<String>();
	System.out.println(Arrays.asList(ns));		
	
	
	
// write a program to create a static array and then convert it to dynamic and vice verca.
	
	
	String q[] = new String[4];
	q[0] = "Aman";
	q[1] = "rahul";
	q[2] = "Rohit";
	q[3] = "Arun";
	
	for (int w = 0; w < q.length; w++) {
	System.out.println(q[w]);
	}
	
// converting Array to ArrayList bu using Arrays.aslist method:
System.out.println(Arrays.asList(q));
	
ArrayList<String> qq = new ArrayList<String>(Arrays.asList(q));
System.out.println(qq);

//ArrayList to Array:

String d[]= new String [qq.size()];

qq.toArray(d);

for (int t = 0; t < qq.size(); t++) {
	System.out.println(d[t]);


// ArrayList to String.

System.out.println(d[t].toString());

	
}
	
	
	
	
	
	
	
	
	
	
	}

}
