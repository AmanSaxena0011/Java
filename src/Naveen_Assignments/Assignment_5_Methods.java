package Naveen_Assignments;

import java.util.ArrayList;

public class Assignment_5_Methods {
	
	public static void main(String ar[]) {
		
		Assignment_5_Methods obj = new Assignment_5_Methods();
		System.out.println(obj.sum(10, 40));
	
		System.out.println(obj.product(10, 40));
		
		System.out.println(obj.circum(10));
		System.out.println(obj.area(10));		
		
		System.out.println("The highest value is " + obj.maximum(10, 20, 30));
		System.out.println("The lowest value is " + obj.minimum(10, 20, 30));
		
		obj.oddcheck(6);
		obj.eligible(12);
		
		obj.primecheck(10);
		obj.primecheck(17);
		System.out.println(obj.getGrade(71));
		obj.factorial(5);
	}
	
//1.Write a program to print the sum of two numbers entered by user by defining your own method.	
	
	public int sum(int a , int b) {
		return a+b;
	}
	
//2. 2. Define a method that returns the product of two numbers entered by user.
	
	
	public int product(int a, int b) {
		return a*b;
	}
	
	
//3.Write a program to print the circumference and area of a circle of radius entered by user by defining your own method.	2pie r and pie r ^2.
	
	
	public double circum(float r) {
		double circumference = 0;
		
		circumference = 2*Math.PI*r;
		
		return circumference;
	}
	
public double area(float h) {
	double area = 0;
	area = Math.PI*h*h;
	
	return area;
}

//4.Define two methods to print the maximum and the minimum number respectively among three numbers entered by user.

public int maximum(int a , int b, int c) {
	
	if (a>b & a>c) {
		return a;
	}
	else if (b>c) {
		return b;
	}
	else {
		return c;
	}	
}

public int minimum(int a , int b, int c) {
	
	if (a<b & a<c) {
		return a;
	}
	else if (b<c) {
		return b;
	}
	else {
		return c;
	}	
}


//5.Define a program to find out whether a given number is even or odd.

public void oddcheck(int num) {

	if (num%2==0) {
	System.out.println("The given number is even");
	}
	else {
		System.out.println("The given number is odd");
	}
}

//6.A person is eligible to vote if his/her age is greater than or equal to 18. Define a method to find out if he/she is eligible to vote.

public void eligible(int age) {
	if (age>=18) {
		System.out.println("The person is eligible to vote");
	}else {
		System.out.println("The person is not eligible");
	}
}


//7.Define a method to find out if number is prime or not.

public void primecheck(int num) {
	int temp=0;
	for (int i = 2; i < num; i++) {
	if (num%i==0) {
		temp = temp+1;
	}
	}
	if (temp>0) {
		System.out.println(num + " is not a prime nunmber");
	}
	else {
		System.out.println(num + " is prime number");
	}
	}


//8.WAP which will ask the user to enter his/her marks (out of 100). Define a method that will display grades according to the marks entered as below:
//Marks        Grade
//91-100         AA
//81-90          AB
//71-80          BB
//61-70          BC
//51-60          CD
//41-50          DD
//<=40          Fail


public ArrayList<String> getGrade(int Marks) {
	
	ArrayList<String> grade = new ArrayList<String>();
	
	if (Marks<=40) {
		grade.add("Fail");
	}	
	else if (Marks<=50) {
		grade.add("DD");
	}
	else if (Marks<=60) {
		grade.add("CD");
	}
	else if (Marks<=70) {
		grade.add("BC");
	}
	else if (Marks<=80) {
		grade.add("BB");
	}
	else if (Marks<=90) {
		grade.add("AB");
	}
	else if (Marks<=100) {
		grade.add("AA");
	}
	
	
	return grade;
}



//9. Write a program to print the factorial of a number by defining a method named 'Factorial'.
//Factorial of any number n is represented by n! and is equal to 1*2*3*....*(n-1)*n. E.g.-
//4! = 1*2*3*4 = 24
//3! = 3*2*1 = 6
//2! = 2*1 = 2
//Also,
//1! = 1
//0! = 0


int c =1;
public void factorial(int num) {
	
	for (int i =num; i>0; i--) {
		
		c=c*i;
	}
	System.out.println(c);
}





























}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

