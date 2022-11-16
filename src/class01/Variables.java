package com.syntax.class01;

public class Variables {

	public static void main(String[] args) {
		// Student information
		String firstName = "Tarun";
		String lastName = "Srinivasan";
		String grade = "4th";
		String city = "Dublin";
		String state = "California";
		String phone = "123467598";
		// part a)
		System.out.println("My name is " +firstName+" and my last name is "+lastName );
		System.out.println("I am " +grade+" grade student");
		System.out.println("I live in "+city+" "+state);
		System.out.println("And my phone number is "+ phone);
		//part b)
		city = "Redmond";
		state = "Washington state";
		phone = "278935633";
		grade = "3rd";
		
		System.out.println("My name is "+firstName +" " + lastName + " and I moved to "+city+ " "+state+ ". My new phone number is "+phone);
	}
}
