package Naveen_Assignments;

public class PrimeNumberCheck {

	public static void main(String[] args) {
	
		int num = 111;
		int temp=0;
		
		for (int i = 2; i < num; i++) {
			if (num%i==0) {
				temp = temp+1;	
			}
			
		}
		
		if (temp>0) {
			System.out.println("Number is not prime Number");
		}
		else {
			System.out.println("Number is Prime Number");
		}
	}

}
