package oopsConcepts;

public class EncapsulationTest {

	public static void main(String[] args) {
		
		EncapsulationClass e1 = new EncapsulationClass();
		e1.getName();// calling wrapper class which is interanally calling private method , which now will be accesible from diff class.
	}

}
