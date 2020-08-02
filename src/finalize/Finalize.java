package finalize;

public class Finalize {
	
	int age;


	public static void main(String[] args) {
		
		Finalize obj = new Finalize();
		obj = null;
		System.gc();
		System.out.println(obj.age);
		
		
	}
	
	
	public void finalize() {
		System.out.println("This is finalize method");
	}

}
