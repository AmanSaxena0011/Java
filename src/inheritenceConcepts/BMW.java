package inheritenceConcepts;

public class BMW extends Car{
//Method overriding: when i dont want to use parent property , method name & method signature is same , so the start method gets overrides.
//When you have a method in parent class with the same name and same number of params and the same method in child class, is called method overriding.
//	@Override we mentiod for overridden method (of child class who overrided) to differentiate it from method overloading.
	
	
//	So there are three types of methods:
//	1. Overridden method start
//	2. inherited method
//	3.Child method
	
// Siblings can't share their property.	
//	Parent class can give name to child class obj.
//	Child class object can be refered by parent class obj reference.
 	
	@Override
	public void start() {
		System.out.println("BMW Start method");
	}

	public void automobile() {
		System.out.println("seprate class method");
	}
	
}
