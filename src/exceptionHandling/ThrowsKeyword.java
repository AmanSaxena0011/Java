package exceptionHandling;

public class ThrowsKeyword {
// none of the method is taking responsiblity of excetion occured, no body is handling it. so it is being thrown from last to first (Main method)/
//	main method has 2 choice whether it can handle it with tryCatch or throws it away like others. after Main method throwning , the exception is going to JVM.
// None is handling exception as of now, so main method will handle it and put the culprit inside tryCatch block.
//Throws keyword will not handle the exception, its purpose is only to pass the exception from 1 method to other. now it is method res whether u want to handle it or not.
//	methods can be covered by try catch , only code is covered by try catch.we can use try catch inside emthod code.
//	if u dont waNt to handle , use throws keyword after the method.
//	if u write both throws and trycatch together , the exception will be handled bby tryCatch sp there is no use of doing so using throws with mtnhod or using try catch in the same.
//	whenver u want to generate your own exceptioon use throw keyword
	
	
	
	
	public static void main(String ar[]) {
	
		ThrowsKeyword obj = new ThrowsKeyword();
		
		try{
			obj.getValue();
		}
		catch(Exception e){
			e.printStackTrace();
			System.out.println(e.getMessage());
		}
		System.out.println("a");
	}
		
	public void getValue() throws ArithmeticException{
		System.out.println("getValue");
		getNumber();
	}
	
	public void getNumber() throws ArithmeticException{
		System.out.println("getNumber");
		getName();
		
	}
	public void getName() throws ArithmeticException{
		System.out.println("getName");
		int i = 9/0;
	
		System.out.println("AAA");
	
}
}
