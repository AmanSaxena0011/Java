package Naveen_Package;

public class LoopsLecture {

	public static void main(String[] args) {
		
		
		int i = 1;
		
		while (i<=10) {
			System.out.println(i);
					i+=3;
	}
// printing 10 to 1
		
//		int j = 10;
//		
//		while (j>=1) {
//			System.out.println(j);
//		j--;
//		}
//		
//		
//		while (true) {
//			System.out.println("it will be always true");
//		}
//		while (false){
//			System.out.println("it is unreachable code");// Unreachable code , never meet such condition
//		}
//				
//		
//		if(true)
//			System.out.println("hiiii");
//			else {
//				System.out.println("no");// dead code
//			}
//		boolean flag = true;
//		 while (flag) {
//			 System.out.println("it will be always true");
//		}
		 
//		 while (!flag) {
//			 System.out.println("it will be always true"); // it will be printed, java will not judge it as it is situation which can be changed.
//		}
		 
		 
		 
// For Loop example------------------------------
		 
	// Odd printing before 10
	for (int k = 1; k <= 10;k+=2/*k=k+2*/) {
		System.out.println(k);
	}
		
//		for (;;) {
//			System.out.println("Infinite print");
//		}
	
// For looop for 1 to 100 and whenever it is factor of 5 , we print message.
	
	for (int a = 1; a <=100; a++) {
		System.out.println(a);
		if (a%5 == 0) {
			System.out.println("Number is factor of 5");
		
	}
	}
		for (int b = 1; b <=100; b++) {
			System.out.println(b);
			if (b%5 == 0) {
				System.out.println("Number is factor of 5 so breaking the loop");
			break;
		}}
		
		
// Do- while loop:
		
		int count = 21;
		do {
			System.out.println(count);
			count++;
		} while (count<=0);  // will print only 21 as in this loop first statement always gets executed.
		
// For Each loop:  is only used in Array:
		
//		for (Type New varible name : arrayName);

		
		
		
		
		
	}
}
