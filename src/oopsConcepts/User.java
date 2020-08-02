package oopsConcepts;

public class User {
	
	int age;
	int no;
	String name;
	float salary = 23f;
	
	
public void method1() {
System.out.println("calling and printing 1st method...");

}

	public static void main(String ar[]) {
		
		User obj = new User();
		obj.method1();
		obj.age = 20;
		System.out.println(obj.age);
		System.out.println(obj.age = 21);
		obj.salary = 27f;
		System.out.println(obj.salary);
		
		User obj2 = new User();
		obj2.age = 30;
		System.out.println(obj2.age);
		obj2.method1();
		
		
		User user3 = new User();
		user3.age =333;
		System.out.println(user3.age);
		
	// 	
		
}
}