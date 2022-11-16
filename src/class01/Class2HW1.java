package com.syntax.class01;

public class Class2HW1 {

	public static void main(String[] args) {
		// Write a Java program to add, subtract, multiply and divide 2 decimal values. 
		//Your program should say. “The __ of 2 numbers __ and  is equal to __
		double n1 = 5.55;
		double n2 = 2.25;
		
		double add = n1+n2;
		double diff = n1-n2;
		double mul = n1*n2;
		double div = n1/n2;
		
		System.out.println("The sum of 2 numbers "+n1+" and "+n2+" is equal to "+add);
		System.out.println("The difference of 2 numbers "+n1+" and "+n2+" is equal to "+diff);
		System.out.println("The multiplication of 2 numbers "+n1+" and "+n2+" is equal to "+mul);		
		System.out.println("The division of 2 numbers "+n1+" and "+n2+" is equal to "+div);
	}
}
