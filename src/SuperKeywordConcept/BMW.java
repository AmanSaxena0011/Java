package SuperKeywordConcept;

public class BMW extends Car{
	
	public BMW() {
		super();
		System.out.println("BMW 0th COnst");
	}

	
	public BMW(int i) {
		super(i);
		System.out.println("BMW 1th COnst");
	}
	
	public BMW(int i, int a) {
		super(i,a);
		System.out.println("BMW 2th COnst");
	}
	
	
int max_speed = 150;
	
	@Override
	public void start() {
		System.out.println("BMW Start>>");
	}
	
	
	public void drive() {
		System.out.println("The car speed is " + super.max_speed);
		super.start();
	}

}
