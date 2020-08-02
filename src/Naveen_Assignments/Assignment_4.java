package Naveen_Assignments;

import java.awt.List;
import java.util.ArrayList;
import java.util.Collections;

public class Assignment_4 {

	public static void main(String[] args) {
		
		
//1		00 01 02 03 04 05 06 07 08 09 
//		10 11 12 13 14 15 16 17 18 19 
//		20 21 22 23 24 25 26 27 28 29 
//		30 31 32 33 34 35 36 37 38 39 
//		

for (int i = 0; i <=3; i++) {
	for (int j = 0; j <=9; j++) {
		
	
	
	System.out.print(i+""+j + " " );
	}
		
System.out.println();		
		
}
		
		

//Question 2: Write a program to create a static Array, having following cricket data:
//--name, age, team name, DOB, gender, Strike Rate
//--Try to create multiple Object Arrays for different players 
//--Try to print all the values of each player on the console



Object p1[] = {"Aman",21,"MI","12Oct1994",'M',10.22};

for (int i = 0; i < p1.length; i++) {
	System.out.println(p1[i]);
}

//Question 3: Try to print the following pattern on the console:
//n = 4
//n = 3
//n = 2
//n = 1
//n = 0
		
		
for (int l = 4; l >=0; l--) {
	System.out.println("n = "+ l);
}

System.out.println("----------");

// Arraylist Assignment:


//1.Write a Java program to create a new array list, add some colors (string) and print out the collection

ArrayList<String> colors = new ArrayList<String>();

colors.add("Black");
colors.add("Blue");
colors.add("White");
colors.add("Yellow");
colors.add("Pink");
colors.add("Brown");
colors.add("Orange");

for (int c = 0; c < colors.size(); c++) {
	System.out.println(colors.get(c));
}
System.out.println(colors);


//2. Write a Java program to insert an element into the array list at the first and last positions.


colors.add(0,"BBBlack");
colors.add(colors.size(),"OOOrange");

System.out.println(colors);



colors.add(0,"Magenta");
colors.add(colors.size(),"Last Color");


System.out.println(colors.get(colors.size()-1));

//3. Write a Java program to retrieve an element (at a specified index) from a given array list.

System.out.println(colors.get(6));


//4. Write a Java program to update specific array element by given element.

colors.set(colors.size()-1,"Last color set");
System.out.println(colors.get(colors.size()-1));

colors.set(6, "new Brown");

System.out.println(colors);

//5.Write a Java program to remove the third element from a array list. 
colors.remove(2);
System.out.println(colors);


//6.Write a Java program to search an element in a array list.


if(colors.contains("BBBlack")) {
	System.out.println("element is present in the ArrayList");
}
	else {
		System.out.println("it is not there..");
	}



//7. Write a Java program to reverse elements in a array list
System.out.println("----2");
Collections.reverse(colors);
System.out.println(colors);


//8. Write a Java program to extract a portion of a array list.




ArrayList<String> subArray = new ArrayList<String>(colors.subList(0,10));
System.out.println(subArray);


//List<String> list = colors.subList(0,3);
//System.out.println("SubList stored in List: "+list);
//
//List<String> list = subArray.subList(1,4);
//System.out.println(list);

//************ Neewd to ask from naveen how to sublist by using List only.




//9. Write a Java program of swap two elements in an array list.


int a = 5;
int b = 10;
int c = a;
a =b;
b = c;

System.out.println("Swapped Value of a is "+ a + " And Value of b is "+ b);

int d = 5;
int e = 10;

d = d+e;//15
e= d-e;//5
d=d-e;//10

System.out.println("Swapped Value of d is "+ d + " And Value of e is "+ e);






//10. Write a Java program to empty an array list.


//colors.clear();
//colors.removeAll(colors);
System.out.println(colors); // Both are same , clear is more speedy, and remove all clears inside collection, so it check for colllection everytime and clear the collection. so that is why it is time taking.








//11. Write a Java program to trim the virtual capacity of an array list the current list size.


colors.trimToSize();
System.out.println(colors);







//12. Write a Java program to print all the elements of a ArrayList using the position of the elements


for (int r = 5; r < colors.size(); r++) {
	System.out.println(colors.get(r));
}

		
		
		
		
}
}	