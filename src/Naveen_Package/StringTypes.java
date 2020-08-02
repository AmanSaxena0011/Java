package Naveen_Package;

public class StringTypes {

	public static void main(String[] args) {
		
		String a = "Aman\'";
		String b = "Saxena\"";
		String c = "IT\\";
		
		System.out.println(a+b+c);
		System.out.println(a+' '+b);
		System.out.println(a.toLowerCase());
		System.out.println(b.toLowerCase());
		System.out.println(a.toUpperCase()+' ' + b.toUpperCase());
		System.out.println(a.length());
		System.out.println(a.length()+ b.length());
		System.out.println(a.concat(b));
		System.out.println(a.indexOf("A"));
		System.out.println("Aman Saxena" + 100);
		
		int x = 100;
		int y=  200;
		
		System.out.println(a+b+x+y);
		
		System.out.println("Hello Selenium".concat("t"));
		
	}

}
