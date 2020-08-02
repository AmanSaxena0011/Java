package oops_Abstract;

public class PageTest {

	public static void main(String[] args) {

		
		HomePge hp = new HomePge();
		hp.title();
		hp.header();
		hp.footer();
		hp.userDetails();
		Page.pagePlugin();
		

		Page pg = new HomePge();
		pg.title();
		pg.header();
		pg.footer();

		
	}

}
