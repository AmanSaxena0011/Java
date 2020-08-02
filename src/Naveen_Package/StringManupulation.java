package Naveen_Package;

public class StringManupulation {
	
//1. str.length	
//2. str.charAt
//3. str.indexof ch	
//4. str.indexof ch from
//5. str.lastindexof	
//6. str.lastindexof ch from	
//7. str.contains
//8. str.trim	
//9. str.toUpperCase
//10. str.toLowerCase	
//11. str.replace	
//12. String Compare equals, equalsignore	
//13. Substring	
//14. Split	
//15.	
//16.	

	public static void main(String[] args) {


		String str = "HI I am counting the string'I'";
		System.out.println(str.length());
		System.out.println(str.charAt(1));
//		System.out.println(str.charAt(40));
		
		System.out.println(str.indexOf('I'));// 1st Occurence
		
		System.out.println(str.indexOf('I',str.indexOf('I')+1));// 2ndoccurence
		System.out.println(str.indexOf('I', str.indexOf('I',str.indexOf('I')+1)+1));//3rd occurence
		
		
		System.out.println(str.lastIndexOf('I'));
		
		System.out.println(str.charAt(str.length()-1));// last index value
		System.out.println("--");
		
		System.out.println(str.indexOf("am"));
		
		
		String mesg = "Welcome Admin";// to check admin is present or not
		if (mesg.contains("Admin")) {
			System.out.println("Yes Admin is present here");
			System.out.println(mesg.indexOf("Welcome"));
		}
	
//		Trim method remove the extra spaces. 
		
		String t1 = "          Hi This is Aman       ";
		System.out.println(t1);
		System.out.println(t1.trim());
// Upper caSE	
		
String a = "Welcome to Selenium !!";
	System.out.println(a.toUpperCase());
	System.out.println(a.toLowerCase());

	
	String dob = "12-12-2019";
	System.out.println(dob.replace('-','/'));
	
	
	String c = "       Welcome to testing      ";
	System.out.println(c.trim().replace(" ", ""));// Removing all the spaces


//	String Compare
	
	String o = "Hi This is My Laptop";
	String oo = "Hi This is my Laptop";
	System.out.println(o.equalsIgnoreCase(oo));
	
	
//	Substring: 
	
	String LongStr = "Hi this is my automation labs";
	System.out.println(LongStr.substring(LongStr.indexOf("my")));
	System.out.println(LongStr.substring(LongStr.indexOf("my"), LongStr.length()));
	
	String order = "Your order number is 12345";// fetch only order no 12345
	System.out.println(order.substring(order.indexOf("is")+3, order.length()));
	
//	Split:
	
String lang = "Java-Python-Ruby-Perl";

String s[] = lang.split("-");

System.out.println(s[0]);
//System.out.println(lang.split("-")[0]);

for (int i = 0; i < s.length; i++) {
	System.out.println(s[i]);
	
	
	String h1 = "xXAnushaxXRufatxXSheena";
	String h2[] = h1.split("xX");
	System.out.println(h2[0]);// blank value
	System.out.println(h2[1]);
//	System.out.println(h2[4]);
	for (int j = 0; j < h2.length; j++) {
		System.out.println(h2[j]);
	}
	
}
	
String empdata = "Aman;Saxena;30;NEC;CA;243601";
System.out.println(empdata.split(";").length);
System.out.println("---");
for (int z = 0; z < empdata.split(";").length; z++) {
	System.out.println(empdata.split(";")[z]);
}





//String emp[] = empdata.split(";");
//System.out.println(empdata.split(";")[1]);
//	System.out.println(emp[0]);
//	for (int k = 0; k < emp.length; k++) {
//		System.out.println(emp[k]);
//	}
	
	
	
	}
	

	

}
