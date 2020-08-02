package exceptionHandling;

public class TryMultipleCatch {

	String name = "naveen";
	
	public static void main(String[] args) {

System.out.println("ABC");
System.out.println("ABC");

try {	
	int i = 9/0;

TryMultipleCatch obj = null;
System.out.println(obj.name);
}
catch (NullPointerException e) {
	e.printStackTrace();
	System.out.println(e.getMessage());
}	

catch (ArithmeticException e) {
e.printStackTrace();
}



System.out.println("DDD");
System.out.println("EEE");
}
}
