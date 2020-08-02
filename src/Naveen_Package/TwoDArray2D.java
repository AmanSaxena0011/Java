package Naveen_Package;

public class TwoDArray2D {

	public static void main(String[] args) {


		int i[][] = new int[2][3];
		
		i[0][0] = 1;
		i[0][1] = 11;
		i[0][2] = 111;
	
	
		i[1][0] = 2;
		i[1][1] = 22;
		i[1][2] = 222;
	
	System.out.println(i[1][2]);
	System.out.println(i.length); // No of rows
	System.out.println(i[0].length); // No of colums
	
//	To Print All the values:
	
	for (int a = 0; a < i.length; a++) {
	
	for (int b = 0; b < i[0].length; b++) {
	
	System.out.println(i[a][b]);
	
	}
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	}

}
