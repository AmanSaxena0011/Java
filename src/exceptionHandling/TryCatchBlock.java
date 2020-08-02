package exceptionHandling;

public class TryCatchBlock {

	public static void main(String[] args) {
	
		
		
		System.out.println("A"); 

		try {
		int i = 9/0;
		System.out.println("B");
			} 
		catch (Exception e) {
			e.printStackTrace();
	
		System.out.println(e.getClass());
		System.out.println(e.getMessage());

			
		}
		
		System.out.println("B");

	}

}
