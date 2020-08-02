package FinallyConcept;

public class FinallyCase {
	
	
	
	public static int getMarks(String name) {
		if (name.equalsIgnoreCase("Tom")) {
		try {
			int i = 9/0;
		} catch (Exception e) {
			return -1;
		}
		finally {
		System.out.println("You cant skip me");
//		return 2;
		}
		
		return 100;
		
		}
		
		else if (name.equalsIgnoreCase("Steve")) {
			
		return 50;
		}
		
		else {
			return -1;
		}
		
	}
	
	
	
	public static void main(String ar[]) {
		
		System.out.println(getMarks( "Tom"));
		
	}

}
