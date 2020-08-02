package oopsConcepts;

public class FunctionsInJava {

// Basicailly there are three types of functions:


	public static void main(String a[]) {
		
		FunctionsInJava obj = new FunctionsInJava();
		obj.simplemethod();
		obj.main();	
//		obj.returnmethod();
		int l = obj.getTotalMethod();
		System.out.println(obj.getTotalMethod());
		System.out.println(l);
		int d = obj.inpret(10, 20);
		System.out.println(d);
		System.out.println(obj.inpret(20, 30));
		
}
	
//	1. No Input() no output(return) Simple Method	
//	return type is Void.
public 	void simplemethod() {
System.out.println("Simple method calling");
}


public void main() {
	System.out.println("2nd method");
}
			
			
//2. No input but giving some return.

//return type is String.
public String returnmethod() {
	System.out.println("method with return but no uinput");
String name = "Aman";
	return name;

}
//return type is Int.
public int getTotalMethod() {
	System.out.println("Get Total method Testing......");
	
	int a = 100;
	int b = 200;
	System.out.println("The value of a is "+ a);
	
	 return b+a;

}
//3rd method some inp and some return , means no void and having return and having values inside ()
// Also called as parametrized fn as parameters are provided in the fn
public int inpret(int a, int b) {
	System.out.println("Testing imp method");
	int c = a+b;
	
	return c;
	}





















	
}