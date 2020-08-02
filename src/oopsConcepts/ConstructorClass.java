package oopsConcepts;

public class ConstructorClass {

String name;
int age;
int mobile;
	
public ConstructorClass() {// oth cons
System.out.println("Default const");	
}

public ConstructorClass(String abcd) {// 1st param cons
	System.out.println("1 param constructor");
}

	
	public static void main(String ar[]) {
	
		ConstructorClass obj = new ConstructorClass();	// The moment you create the obj, constructor is called.
		ConstructorClass obj2 = new ConstructorClass("Aman");
	}

	
}

