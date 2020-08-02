package Naveen_Package;

public class ConditionalOperator {

	public static void main(String[] args) {

		int a = 50;
		int b = 60;
		
		System.out.println((b>a)+" By "+ (b-a));

		if (b>a) {
			System.out.println("b is greater than a by " + (b-a));
		}
		else if (b==a) {
			System.out.println("both the values are equal");
		}
		else {
			System.out.println("A is greater than b by "+ (a-b));
		}
		
		String browser = "firefox";
		
//		if (browser.equals("firefox")) {
		if (browser == "firefox") {
		System.out.println("browser is firefox");
		}
		
		else if (browser.equals("Chrome")) {
			System.out.println("browser is chrome");
		}
		
		else if (browser.equals("ie")) {
			System.out.println("Browser is IE");
		}
		else {
			System.out.println("nothing gets setisfied");
		}
		
		
	
		
		if(true)
		System.out.println("hiiii");
		else {
			System.out.println("no");// dead code
		}
		
		
//WAP to get the highest no amongst 3 numbers 
		
		int x = 50;
		int y = 40;
		int z = 30;
		
		if (x>y && x>z) { // && operator is called short circuit operator
			System.out.println("x is highest");
		}
		else if (y>z) {
			System.out.println("y is highest");
		}
		else {
			System.out.println("z is highest number");
		}
		
// Switch Case int
		
		int q = 1;
		
		switch (q) {
		case 1:
			System.out.println("value is 1");
			break;
		case 2:
			System.out.println("value is 2");
			break;
		default:
			System.out.println("value can not be judged");
			break;
		}
		
		
		
//Switch case String
		String m = "Class";
		switch (m) {
		case "Class":
			System.out.println("value is matched");
			break;

		default:
			System.out.println("value did not matched");
			break;
		}
		
		
		
		
		
		
		
		
		
		
	
	
	
	
	
	
	

		
	}
}

		
		
		
		
		