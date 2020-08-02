package oopsConcepts;

public class EncapsulationClass {

	
	public String name;
	private int i;
	private int j;
	
	
	public void getName() {
		System.out.println("Getting the name of the employee");
		getSalary();
	}
	
	private void getSalary() {
		System.out.println("Confidential salary");
		
	}
	public static void main(String[] args) {

		EncapsulationClass obj = new EncapsulationClass();
		System.out.println(obj.name);
		System.out.println(obj.i);
		System.out.println(obj.j);
	
		obj.getName();
		obj.getSalary();
	
	}

}
