package oopsConcepts;

public class Cars {
	
String name;
String model;
int number;
static int wheel = 4;
int str = 1;


public static void main(String ar[]) {
	
	Cars c1 = new Cars();
	Cars c2 = new Cars();
	Cars c3 = new Cars();
	
	c1.name="Audi";
	c1.model = "A1";
	c1.number = 123;
	System.out.println(c1.str);
	System.out.println(c2.str);
	

	System.out.println(c1.name + " " +  c1.model + " " +c1.number + " " + Cars.wheel);
	System.out.println(c1.name + " " +  c1.model + " " +c1.number + " " + wheel);
	
	c2.name="BMW";
	c2.model = "B1";
	c2.number = 456;

	
//	System.out.println(c2.name + " " +  c2.model + " " +c2.number + " " + c2.wheel);// Useless we dont need to call it from obj as we have already declared it as a static varilable.
	System.out.println(c2.name + " " +  c2.model + " " +c2.number + " " + Cars.wheel);
	System.out.println(c2.name + " " +  c2.model + " " +c2.number + " " + wheel);
	
	c3.name="Maruti";
	c3.model = "800";
	c3.number = 789;

	
	System.out.println(c3.name + " " +  c3.model + " " +c3.number + " " + c3.wheel);
	System.out.println(c3.name + " " +  c3.model + " " +c3.number + " " + Cars.wheel);
	System.out.println(c3.name + " " +  c3.model + " " +c3.number + " " + wheel);
	
	
	
	getName();
	
}

// static methodds

public static void getName() {
	System.out.println("it will call get contact method");
	getContact();
}
	

public static void getContact() {
	System.out.println("Pls give me your contact no");
}

	public void ns() {
		System.out.println("Non Static method");
		ns2();// Called non static method from non static method, as internally non static methods can call each other.
	}
	
	public void ns2() {
		System.out.println("Called ns method");
	}
	
	
	

}
