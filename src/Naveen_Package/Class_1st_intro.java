package Naveen_Package;
//Class is a representation of any object., Template of perticular object.
// There are two types of variable , 1 is class variable and second is Local variable (declared inside main method). for calling class variable we need to first create object of the class varible.

public class Class_1st_intro {
	
	String Name = "Aman";
	int age;
	char sex = 'M';
	String city;
	String School;
	

	
	public static void main(String[] args) {
		 int i = 10;// Local Variable 
		 System.out.println(i);
		 
		
			 Class_1st_intro obj = new Class_1st_intro();

			obj.School = "1st obj saraswati";
		 
		 System.out.println(obj.Name);
		 System.out.println(obj.age = 25);
		 System.out.println(obj.sex);
		 System.out.println(obj.city);
		 System.out.println(obj.School);
		 

	
		Class_1st_intro obj2 = new Class_1st_intro();
		obj2.School = "2nd saraswati";
		System.out.println(obj2.School);
		
		
		
		
		
	

}
	}
