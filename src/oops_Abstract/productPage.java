package oops_Abstract;

public class productPage extends Page{

	public static void main(String[] args) {
		
	}

	@Override
	void header() {
	System.out.println("Product Page header>>");
			}

	@Override
	void title() {
	System.out.println("Product Page title>>");
		
	}
	
	
	public void productdetails() {
		System.out.println("Product dedtails");
	}

}
