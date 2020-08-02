package Naveen_Assignments;

public class Assignment_7_Encapsulation {
//1. 1st question was very basic covering all the encapculaition lecture only and having the solution itelf in the assignment by naveen.
	
	//2nd Quesion
//			  Step 1: Declare variables private in the class.
//	        private String stdName; // private field.
//	        private int stdRollNo;
//	        private int stdId;

	// Step 2: Apply public getter method for each private vairables in the class.
	      
	// Step 3: Apply public setter method for each private variables in the class.

	   private String stdName; 
       private int stdRollNo;
       private int stdId;

	
	
	public String getStdName() {
		return stdName;
	}



	public void setStdName(String stdName) {
		this.stdName = stdName;
	}



	public int getStdRollNo() {
		return stdRollNo;
	}



	public void setStdRollNo(int stdRollNo) {
		this.stdRollNo = stdRollNo;
	}



	public int getStdId() {
		return stdId;
	}



	public void setStdId(int stdId) {
		this.stdId = stdId;
	}



	public static void main(String[] args) {

Assignment_7_Encapsulation obj = new Assignment_7_Encapsulation();
obj.setStdId(12);
System.out.println(obj.getStdId());


obj.setStdName("Aman");
System.out.println(obj.getStdName());


obj.setStdRollNo(1234);
System.out.println(obj.getStdRollNo());



	}

}
