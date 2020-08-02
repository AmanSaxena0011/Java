package oopsConcepts;

public class GetterSetter {
	
	public String name;
	private int age;
	private int number;
	
//	getter setter means first set and then get by using two different methods.
	
	private void setAge(int age) {
		this.age = age;
	}
	
	public int getAge() {
		return age;
	}
	
	
	public static void main(String[] args) {

	GetterSetter g1 = new GetterSetter();
	g1.setAge(12);
	System.out.println(g1.getAge());
		

	}

}
