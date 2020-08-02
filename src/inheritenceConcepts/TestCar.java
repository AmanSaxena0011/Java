package inheritenceConcepts;

public class TestCar {

	public static void main(String[] args) {

		BMW b = new BMW();
		b.start();//	1. Overridden method start
		b.stop();//	2. inherited method
		b.automobile();//	3.Child class method
	
		 Car c = new Car();
		 c.start();
		 c.stop();

		 Audi a = new Audi();
		 a.start();
		 a.stop();
		 a.startvehicle();
		 
//		Top Casting
		 Car cb = new BMW();
		 cb.start();
//		 Downn Casting
		 
//		 BMW b2 = (BMW )new Car();// ClassCastexception not allowed at runtime 
		 
//		 Top casting with grandclass:
		 
		 Vehicle vb = new BMW();
		 vb.startvehicle();

		 
		 
	}

}
