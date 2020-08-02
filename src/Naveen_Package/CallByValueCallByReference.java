package Naveen_Package;

public class CallByValueCallByReference {

	public static void main(String[] args) {
		
//		CallByValue----------------------:
		
		int a = 10;
		int b = 20;
		System.out.println("before going into  the method the value of a & b is " + a + " " + b);//10 ,20
		
		swap(a, b);// 10,20 //	20,10
	
		System.out.println("After the method the unchanged value of a & b is "+ a + " " + b);//		10,20
	}

	public static void swap(int a,int b) {
	System.out.println("Before method calling the value of  a & b is "+ a + " " + b);
		int c = a;//10
		a =b;//20
		b=c;//10
		System.out.println("After method calling the value of  a & b is "+ a + " " + b);

	}
}
