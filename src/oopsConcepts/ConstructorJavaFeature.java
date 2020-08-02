package oopsConcepts;

public class ConstructorJavaFeature {
	 String name;
	 int age;
	 int number;
	
	public ConstructorJavaFeature(String name, int age, int number) {
//		super();// this we will talk later.
		this.name = name;
		this.age = age;
		this.number = number;
	}

	public static void main(String[] args) {

//		SHIFTING OBJECT REFERENCES=------------------------------
		ConstructorJavaFeature c1 = new ConstructorJavaFeature("c1", 11, 1111111);
		ConstructorJavaFeature c2 = new ConstructorJavaFeature("c2", 22, 2222222);
		ConstructorJavaFeature c3 = new ConstructorJavaFeature("c3", 33, 3333333);
		
		System.out.println(c1.name + " " + c1.age + " " + c1.number);
		System.out.println(c2.name + " " + c2.age + " " + c2.number);
		System.out.println(c3.name + " " + c3.age + " " + c3.number);// c1 c2 c3
		
		c1 = c2;
		
		System.out.println(c1.name + " " + c1.age + " " + c1.number);
		System.out.println(c2.name + " " + c2.age + " " + c2.number);
		System.out.println(c3.name + " " + c3.age + " " + c3.number);//c2 c2 c3
		
		
		c2= c3;
		
		System.out.println("-----------------");
		
		System.out.println(c1.name + " " + c1.age + " " + c1.number);
		System.out.println(c2.name + " " + c2.age + " " + c2.number);
		System.out.println(c3.name + " " + c3.age + " " + c3.number);//c2 c3 c3
		
		
		c3=c1;
		
		System.out.println(c1.name + " " + c1.age + " " + c1.number);
		System.out.println(c2.name + " " + c2.age + " " + c2.number);
		System.out.println(c3.name + " " + c3.age + " " + c3.number);//c2 c3  c2
		
		c3=c2;
		System.out.println("---------------       --");
		
		System.out.println(c1.name + " " + c1.age + " " + c1.number);
		System.out.println(c2.name + " " + c2.age + " " + c2.number);
		System.out.println(c3.name + " " + c3.age + " " + c3.number);//c2 c3 c3
		
		
	}

}
