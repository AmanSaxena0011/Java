package oopsConcepts;

//we can call the stataic variables & methods by 2 way:
//	1. direct calling , no need to create object .
//	2. calling the className.
//1. Static can not be applied for local variabale, it can only be applied only on class variable & methods. 
//
//. Objects are created under heap and obj refrence are stored under Stack memory, and obj will be storing only non static images of class var , methods. Static methods are stored separately in Heap under CMA common memory allocaion and obj reference can call the static variable with the waring though they can't store them.
// common property is also called static property.
public class StaticvsNonStatic {

String name;
static int age;

public void simple() {
	System.out.println("Calling simple method.");
}
	

public static void staticmethod() {
	System.out.println("Calling Static method...");
}

public static void main(String ar[]) {
	
	System.out.println(age);
//	System.out.println(name);
	
	staticmethod();
//	simple();
	
	StaticvsNonStatic.staticmethod();
	System.out.println(StaticvsNonStatic.age);
	
	StaticvsNonStatic obj = new StaticvsNonStatic();
	System.out.println(obj.age);

	
	
	
}

}
