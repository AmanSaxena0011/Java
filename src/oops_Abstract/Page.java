package oops_Abstract;

public abstract class Page {
	
	
	public Page() {
		System.out.println("Page class constructor...");
	}
	
	
	public static void  pagePlugin() {
		System.out.println("Page Plugin Method");
	}
	
	
	abstract void header();

	abstract void title();
	
	public final void footer() {
		System.out.println("Page == Footer");
	}
	


}
