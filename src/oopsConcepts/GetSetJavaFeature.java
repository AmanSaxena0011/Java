package oopsConcepts;

public class GetSetJavaFeature {

	
	public String name;
	private int age;
	private int number;
	
	
	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public int getAge() {
		return age;
	}


	public void setAge(int age) {
		this.age = age;
	}


	public int getNumber() {
		return number;
	}


	public void setNumber(int number) {
		this.number = number;
	}


	public static void main(String[] args) {
 
		GetSetJavaFeature obj = new GetSetJavaFeature();
		obj.setAge(12);
		System.out.println(obj.getAge());

	}

}
