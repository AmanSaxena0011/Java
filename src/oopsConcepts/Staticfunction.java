package oopsConcepts;

public class Staticfunction {

	// Boolean return function
	public boolean nameCheck(String name) {
		boolean flag= false;
		if (name.equals("Naveen")) {
			flag = true;
		}
		 else if (name.equalsIgnoreCase("AMaN")) {
			flag = true;
		} 
			
		
		else {
			flag = false;
		
		}
		return flag;
	}

	
// getMarks on basis of name
	
	public int getMarks(String name) {
		int marks = -1;
		if (name.equalsIgnoreCase("Bhanu")) {
			marks = 100;
		}
		else if (name.equalsIgnoreCase("sanjeev")) {
			marks = 10;
		}
		return marks;
	}
	
	
	

	public static void main(String ar[]) {
		Staticfunction obj = new Staticfunction();
		System.out.println(obj.nameCheck("Naveen"));
		System.out.println(obj.nameCheck("amaN"));
		
		System.out.println(obj.getMarks("SANJeeV"));
	}
	
	
	
}
