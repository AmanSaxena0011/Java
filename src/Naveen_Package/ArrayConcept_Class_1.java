package Naveen_Package;

public class ArrayConcept_Class_1 {

	public static void main(String[] args) {
		
// Array is basically collection of data and these are of two types:
//	a. Static Array: Size is fixed and can store only one type of variable , homogenous ex, int[], string[]..etc., cn be overcome similor issue by Object array.
//	b.Dynamic Array: over ride all above 2 warnings . ex. ArrayList
				
//1. Int Array:
		
		int i[] = new int[4]; 
//		int []p = new int[2]; // we can use square bracket beforer also
		i[0] = 10;
		i[1] = 20;
		i[2]= 30;
		i[3]= 40;
		
		System.out.println(i[0]);
		System.out.println(i[0]+i[1]);
		System.out.println(i.length);
		
		// Print All the values of array, we need to use loop:
		
		for (int j = 0; j<i.length; j++) {
			System.out.print(i[j]+ " ");
		}

		
//2. Double Array:
		
		double d[] = new double[4];
		d[0] = 10.22;
		d[1] = 20.22;
		d[2] = 30.22;
		d[3] = 40.22;
			
		System.out.println(d[0]);
		System.out.println(d[0]+d[1]);
		System.out.println(d.length);
		
		//to Print all the value using for loop 
		
		for (int e = 0; e < d.length; e++) {
			System.out.println(d[e]);
		}
		
		
//3. Char
		
		char s = 'a';
		char f ='b';
		System.out.println(s+f); // char are not added , their ASCII values are added only.
		
		char y[] = new char[2];
		y[0]='a';
		y[1]='b';
System.out.println(y[0]+y[1]);		
System.out.println(y.length);

for (int m = 0; m < y.length; m++) {
	System.out.println(y[m]);
}
		
		
String p[]	= new String[3];

p[0] = "Aman";
p[1] = "Subham";		
p[2] = "Rakesh";		
		System.out.println(p[0] + p[1]);
		System.out.println(p.length);
		
		for (int t = 0; t < p.length; t++) {
			System.out.println(p[t]);
		}
		
		
		
//4. Boolean array;
		
		boolean b[] = new boolean[2];
		
//5. we can create object array to overcome the limitation of similar type of data storage in static array.
		
		Object details[] = new Object[3];
		
		details[0] = "Aman";
		details[1] = 23;
		details[2] = 'M';
		
		System.out.println(details.length);
		for (int fa = 0; fa < details.length; fa++) {
			System.out.println(details[fa]);
		}
		

//6. with While Loop same Array operation performed :		
		Object w[] = new Object[3];
		
		w[0] = "Aman";
		w[1] = 23;
		w[2] = 'M';
		
		System.out.println(w.length);
		
		int qq = 0;
		while (qq<w.length) {
			System.out.println(w[qq]);
			qq++;
		}	
	
//7. For Each loop for Array.
		
		Object ed[] = new Object[3];
		ed[0] = "EmployeeName";
		ed[1] = 30;
		ed[2] = 'F';
		
				
		for (Object r  : ed) {
		System.out.println(r);	
		}
	
	
	
	int lm[] = {10,20,30};
		System.out.println(lm[0]);
		
		
		System.out.println("-----------");
		
		char bc[]= new char[2];
		bc[0] = 'a';
	System.out.println(bc[1]);// will print intial value of char which is space 
	
	
	
//	For size issue we use Arraylist/ Dynamic array.
	
	
	
	
	
	}

}
