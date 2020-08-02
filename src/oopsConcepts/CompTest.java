package oopsConcepts;

import java.util.ArrayList;

public class CompTest {

	public static void main(String ar[]) {
		
	Company comp = new Company();
	String a = comp.getName();
	System.out.println(a);
	System.out.println(comp.getName());
	
	
	int b  = comp.getPrice();
	System.out.println(b);
	
	
	
	ArrayList<Object> abc = comp.getList();
	System.out.println(abc);
	for (Object q : abc) {
		System.out.println(q);
	}
	
	
	int x[] = comp.staticarray();
	System.out.println(x[0]);
	
	
	
	int r = comp.getcount("IBM");
	System.out.println(r);
	
	ArrayList<String> p = comp.founders("NEC");
	System.out.println(p);
	
	
	
	
	
	}
}
