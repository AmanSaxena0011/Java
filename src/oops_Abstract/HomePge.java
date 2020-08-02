package oops_Abstract;

public class HomePge extends Page{
	
	public HomePge() {
		System.out.println("Child Class Homepage constructor");
	}

	public static void main(String[] args) {
	
	}

	@Override
	void header() {
		System.out.println("HomePage Header--");
	}

	@Override
	void title() {
		System.out.println("Homepage title--");
	}
	
	
	public void userDetails() {
		System.out.println("HP individual user method");
	}
}
