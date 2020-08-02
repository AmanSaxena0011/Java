package oopsConcepts;

import java.util.ArrayList;

// writing all  the functions of company class (utilities) which we can call from different class.


public class Company {

public String getName() {
return "IBM";
}
	

public int getPrice() {
return 12;
}


public ArrayList<Object> getList() {

ArrayList<Object> List = new ArrayList<Object>();
List.add("Ram");
List.add(12);
List.add('M');
List.add(12.22f);

return List;
}

public int[] staticarray() {
	
	int i[] = new int[2];
	i[0] = 12;
	i[1] = 15;
	
	
	return i;
}
	
//// create a function where we will pass the company name and then you return total employees
int count=0;
public int getcount(String compname) {
	if (compname.equals("IBM")) {
		count = 100;
	}
	else if (compname.equals("Cognizant")) {
		count = 20000;
	}
	else {
		System.out.println(compname + "is not in our list pls try again with correct name");
	}
	
return count;
}

//create a function where u need to pass the comp name and return list of co-founders....


public ArrayList<String>  founders(String compname) {
	
	ArrayList<String> founder = new ArrayList<String>();
	
	if (compname.equals("NEC")) {
		founder.add("Prashant");
	}
	else {
		System.out.println(compname + "is not there");
	}
	
	return founder;
}




































}
