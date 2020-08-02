package oopsInterface;

public class Fortishospital extends CDC implements USMedical ,UKMedical, IndianMedical  {

	@Override
	public void Ind1Services() {
	
		
	}

	@Override
	public void Ind2Services() {

		
	}

	@Override
	public void Ind3Services() {
		
		
	}

	@Override
	public void UK1Services() {
		System.out.println("FH--- UK1Medical");
	}

	@Override
	public void UK2Services() {
		System.out.println("FH--- UK1Medical");
		
	}

	@Override
	public void orthoService() {
	System.out.println("FH--- OrthoSrvices of USMedical");
		
	}

	@Override
	public void neuroService() {
		System.out.println("FH--- neoroSrvices of USMedical");
		
	}
	


	@Override
	public void Services_911() {
	
	}
	
//	FH Non Overridden self method
	
	public void OPT() {
		System.out.println("This is mine Fortis OPTMethod");
	}
	
	public void Insurance() {
		System.out.println("This is mine Fortis InsuranceMethod");
	}
// WHO method
	@Override
	public void CovidTest() {
	System.out.println("This is my COVID Test Fortis method");
		
	}

	
	
	
	
}
