package FinallyConcept;

public class User {

	
	public static void test() {
		System.out.println("Hi..");
		
		try {
			int i = 9/0;	
		} catch (Exception e) {
			System.out.println("divide by zero exception occured");
		}
		
		finally {
			System.out.println("You can not skip or ignore me");
		}
		
		
	}
	
	
	public static void main(String[] args) {
	test();
	}

}
