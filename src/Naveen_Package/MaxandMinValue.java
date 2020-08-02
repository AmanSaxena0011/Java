package Naveen_Package;

public class MaxandMinValue {

	public static void main(String[] args) {
		
		
// Int max value 2^31+1
//		min value -2^31
		
		System.out.println("The maximum value of integer is " + Integer.MAX_VALUE);
		System.out.println("The minimum value of integer is " + Integer.MIN_VALUE);
		
	System.out.println( Integer.MAX_VALUE + 1234567890);
	
	System.out.println(  Integer.MAX_VALUE+1);// will show negative as it will not plus in the sum
		
//Reverse using CharArray: u can also convert it using charat using for loop , whicih i have done in assignmnet 8.	
	String s = "SeleniumtestAutomation";
	char c[] = s.toCharArray();
	for (int i = s.length()-1; i >=0; i--) {
		System.out.print(c[i]);
	}System.out.println();
	
// Using StringBuilder Class u can allso revrese the string: // SB is  mutable.and string are immatuable.
	
	String z = "SeleniumtestAutomation";
	 StringBuilder obj = new StringBuilder(z);
	 System.out.println(obj.reverse());
	
	
	
		
		
		
		
		
		
		
	}

}
