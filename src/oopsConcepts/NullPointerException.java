package oopsConcepts;

public class NullPointerException {

// we get null pointer exception in 2 cases :
//		1.when someone has given null reference to your object.
//		2. You haven't created object , just created 1 ref of class which is not pointing to obj and pointing to null.
	
//	Null Pointer Exception: suddenly changing the obj reference to null , means now it is not pointing to obj (new className()) , 
//	it is pointing to null now. and now when u try to access obj ref. variable of object , it will throw, as we cant access.
//	means the ref which u have created is now pointing to null.

String name;
int age;
int number;



public static void main(String ar[]) {
	

	
//	NullPointerException obj = new NullPointerException();
//	
//	obj = null;
//	
//	System.out.println(obj.age);
	
	NullPointerException obj;
	obj = null;
	System.out.println(obj.name);
	
	
	
	
}




}
