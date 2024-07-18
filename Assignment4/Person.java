package Assignment4;

import java.util.Scanner;

public class Person {
	
	// Create two variable 
	private String name;
	private int age;
	
	public Person(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	public  void displayDetails()
	{
		System.out.println("Name : "+ name+" , "+"Age :"+age);
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Name : ");
		String name = sc.next();
		System.out.println("Enter the Age : ");
		int age = sc.nextInt();
		Person person = new Person(name, age);
		person.displayDetails();
	}
}
