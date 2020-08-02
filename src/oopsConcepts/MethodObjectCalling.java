package oopsConcepts;

public class MethodObjectCalling {

	String name;
	
	public static void main(String ar[]) {

	MethodObjectCalling obj = new MethodObjectCalling();
	String a = obj.calling("Aman");
	System.out.println(obj.calling("Aman"));
	System.out.println(obj.name);
	System.out.println(a);
	
	}
	
public String calling(String name) {
	this.name = name;
	return name;
}
	
		
	
	
	
}	
