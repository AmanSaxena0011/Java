package Naveen_Package;

public class DataConversion {

	public static void main(String[] args) {

//1.String to int:
		
		String x = "100";
		System.out.println(x+20);
		
	int i =	Integer.parseInt(x);
	System.out.println(i+20);
	
	
	String amount = "1000";
	System.out.println(Integer.parseInt(amount)+30);
	
	
//	String a = "100A";
//	System.out.println(Integer.parseInt(a));// NumberFormatException

	//2.String to double:
	
	String p = "12.33";
	System.out.println(p+100);
	
	System.out.println(Double.parseDouble(p)+100);
	
//3. Int to String:
	
	int q = 12345;
	System.out.println(String.valueOf(q)+10);
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	}
}
