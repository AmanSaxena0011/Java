package oopsInterface;

public class TestHospitals {

	public static void main(String[] args) {
		Fortishospital obj = new Fortishospital();
		obj.neuroService();
		obj.orthoService();
		obj.OPT();
		System.out.println(USMedical.a);
		obj.CovidTest();
		obj.vaccineTest();
		
		
		USMedical topcasting = new Fortishospital();
topcasting.orthoService();
topcasting.neuroService();
topcasting.Services_911();
	}

}
