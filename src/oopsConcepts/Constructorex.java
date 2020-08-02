package oopsConcepts;

public class Constructorex {

	String name;
	int age;
	int mobile;
		
	public Constructorex(String name, int age, int mobile) {
		this.name = name;
		this.age = age;
		this.mobile = mobile;
	}
	public Constructorex(String name) {
			this.name = name;
		
		System.out.println("2nd constructor is called");
	}
	
	public static void main(String[] args) {
	
		Constructorex obj1 = new Constructorex("Aman", 12, 12345); // The moment you create the obj, constructor is called.
		System.out.println(obj1.name + " " + obj1.age + " " + obj1.mobile);
	
		Constructorex obj2 = new Constructorex("Aman");
		System.out.println(obj2.name + " " + obj2.age + " " + obj2.mobile);

	}

}
