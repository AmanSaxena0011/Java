package oopsConcepts;

public class A {

	public static void main(String[] args) {
//Calling main method from different class		
		System.out.println("Method is A....");

		AA.main(args);
		System.out.println(AA.a);
	
	AA obj = new AA();
	System.out.println(obj.c);
	
	}

}
