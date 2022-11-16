package com.syntax.class01;

public class Class2HW3 {

	public static void main(String[] args) {
		// Write a program to print the area and perimeter of a rectangle with width = 5 and  height = 8. 
		//Your program should say. 
		//“The perimeter of a rectangle with width  and height __ is equal to __ and the area is __”
		
		int w = 5;
		int h = 8;
		
		int perimeter = (2*w)+(2*h);
		int area = w*h;
		
		System.out.println("The perimeter of a rectangle with width "+w+" and height "+h+ " is equal to "+perimeter+" and the area is "+area);
	}

}
