package Naveen_Package;

public class Assignment2Conditional {

	public static void main(String[] args) {
		
		
		int a = 25; 
		int b = 78; 
		int c = 87; 
		int d = 101;
		
		if (a>b && a>c && a>d) {
			System.out.println("a is greatest number");
		}
		else if (b>c && b>d) {
			System.out.println("b is greatest number");
		}
		else if (c>d) {
		System.out.println("c is the greatest number");
		}
		
		else {
			System.out.println("d is greatest number");
		}
		
// 2. WAP to check eligiblity of voter.
		
		int age = 18;
		int living = 5;
	if (age>=18) {
		System.out.println("You can vote for the elections !!");
		if (living>3) {
			System.out.println("You can vote since you are living for more than 3 years.");
		}
		else {
			System.out.println("You can not vote due to living year restriction.");
		}
	
	
	}
	else {
		System.out.println("you can not vote as your age is not >= 18 years; Also due to age restriction we are not checking your living criteria.");
	}
	
	
	
	
	
	
		//3.1 student check switch case :
		
		String student = "Werner";
		
		switch (student) {
		case "Virat":
			System.out.println("Score is 100");
			break;
		case "Smith":
			System.out.println("Score is 90");
			break;
		case "Sachin":
			System.out.println("Score is 200");
			break;
			default:
		System.out.println("This player is not found !!!");
				break;
		}
		
//3.2 Student If-else case:

String students = "Virat";		
		if (students.contentEquals("Virat")) {
			System.out.println("score is 100");
		}
		else if (students.contentEquals("Smith")) {
			System.out.println("score is 90");
		}
		else if (students.contentEquals("Sachin")) {
			System.out.println("score is 200");
		}
		else  {
			System.out.println("This player is not found");
		}
		System.out.println("--------------------------");
		
//4.1 WAP to Swap two numbers with third variable.		
		int m = 10;
		int n = 30;
		
		
		 int o = m;
		 m = n;
		 n = o;
		
		System.out.println(m);
		System.out.println(n);
		System.out.println(o);
		
//4.2 WAP to Swap two numbers witouth third variable.		

int g = 10;
int h = 20;

g = g+h;//30
h = g-h;//10
g= g-h;//20

System.out.println(g);
System.out.println(h);
		
//5. Odd even check

int w = 11;
if (w%2 == 0) {
	System.out.println("Number is Even");
}
else {
	System.out.println("Number is odd");
}

//6.Alphabet & vowel check

char v = 'e';
if (v == 'a' || v == 'e' || v == 'i' || v == 'o' || v == 'u') {
	System.out.println("V is vowel");
}

else {
System.out.println("V is not vowel");
}	
	

}
}




