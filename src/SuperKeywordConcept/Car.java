package SuperKeywordConcept;

public class Car {
	

	public Car() {
		System.out.println("zero param Car Cons");
	}
	
	public Car(int i) {
		System.out.println("1 param Car Cons");
	}
	
	public Car(int i , int j) {
		System.out.println("2 param Car Cons");
	}
	
	int max_speed = 100;
	
	public void start() {
		System.out.println("Car Start>>");
	}

}
