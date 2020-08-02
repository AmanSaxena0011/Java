package Naveen_Assignments;

public class Assignment_8_string_Manupulation {
	
	public void getreverse(String name) {

		for (int i = name.length()-1; i>=0; i--) {
			System.out.print(name.charAt(i));
		}
		
	}
		
	public static void main(String[] args) {
		
	
//		1.  Write a program to check two different strings equality.
	
		
		String aa = "Checking the String";
		String ab = "Checking the STRING";
		
		System.out.println(aa.equalsIgnoreCase(ab));// boolean result 
		
		
//		2. Remove all  spaces in a String . 
//		  For example  : “         Hello      Everyone       “ .     Expected result: “HelloEveryone”.
		String spaces = "         Hello      Everyone       ";
		System.out.println(spaces.trim());
		System.out.println(spaces.replace(" ",""));
		System.out.println(spaces.trim().replace(" ",""));
		

//		3. Write a program that will  print out last character and first character of a word.

		String word = "Alphabet";
		System.out.println(word.charAt(0));
		System.out.println(word.charAt(word.length()-1));
		
		
//		4. Write a program to verify a word or a character contains in the sentence.

		String c = "Checking the c or word exist in sentense or not";
		System.out.println(c.contains("c"));
		System.out.println(c.contains("word"));
		
		
//		5.Write a function/ method to reverse your own name.

		
		String name = "Saxena";
//		System.out.println(name);
//		System.out.println(name.charAt(name.length()-1));
//		
		for (int i = name.length()-1; i>=0; i--) {
			System.out.print(name.charAt(i));
		}
		System.out.println(); 
		
		
		Assignment_8_string_Manupulation  obj = new  Assignment_8_string_Manupulation();
		
		obj.getreverse("Zoom");
		
//		6. Write a program that gives you last half of the string.

		
		String full = "Aman  Raja";
		System.out.println(full.length()/2);
		
		for (int i = full.length()/2; i < full.length(); i++) {
			System.out.print(full.charAt(i));
		}
		System.out.println();

//		7.Write a program to get the 3rd  “ e “ of the string .
//		For example: “Welcome to Naveen Automation Lab ! “.
	
		String s = "Welcome to Naveen Automation Lab !";
		
//		System.out.println(s.indexOf('e',s.indexOf('e')+1));
		System.out.println(s.indexOf('e',s.indexOf('e',s.indexOf('e')+1)+1));
		
		
		
//8. Write a method which gives index of (-1) if string is not available. . it should return integer. if String is present, 
//		then it should return the specific index.
	
//				String q = "Subhash";
//		for (int i = 0; i < q.length(); i++) {
//			System.out.println(q.charAt(i));
//		}
//	Half incorrect written program, meed to ask.
				
				
			
//9. Write a program that breaks a whole string into small strings, and print out its all values . (Hint: split, loop) .
String big = "Aman;Saxena;30;NEC";


String firstName 	= big.split(";")[0];
String lastName 	= big.split(";")[1];
String ages 		= big.split(";")[2];
String comp 		= big.split(";")[3];

System.out.println(firstName);
System.out.println(lastName);
System.out.println(ages);
System.out.println(comp);	


String boss =  "Bhanu;Saxena;30;NEC";
String bigboss[] = boss.split(";");
	for (int i = 0; i < bigboss.length; i++) {
		System.out.println(bigboss[i]);
	}	
		
//		10. Assume that a string consists of 3 words, print out the middle one. 

		
		String words = "Aman is smart";
		System.out.println(words.split(" ")[1]);
		
		
		
		
//		11. get only numeric part from this String:
//		String s = "your transaction id is: 12345 and reference id is 34567";

					
		String o = "your transaction id is: 12345 and reference id is 34567";
		
		System.out.println(o.substring(o.indexOf(':')+2, o.indexOf("and")-1));
		System.out.println(o.substring((o.indexOf("is",o.indexOf("is")+1))+3, o.length()));
					
					
					
		
					
					
					
					
					

		
					
					
					
					
					
					
					
					
	}

}
